package net.mcreator.theultramod;

import net.minecraftforge.fml.network.PacketDistributor;
import net.minecraftforge.fml.network.NetworkEvent;
import net.minecraftforge.fml.LogicalSide;

import net.minecraft.world.storage.WorldSavedData;
import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.World;
import net.minecraft.network.PacketBuffer;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.client.Minecraft;

import java.util.function.Supplier;

public class TheultramodVariables {
	public static double fletcherx = 0;
	public static double fletchery = 0;
	public static double fletcherz = 0;
	public static boolean button1 = false;
	public static boolean guiopen1 = false;
	public static boolean button2 = false;
	public static boolean guiopen2 = false;
	public static boolean button3 = false;
	public static boolean dedpres = false;
	public static class WorldVariables extends WorldSavedData {
		public static final String DATA_NAME = "theultramod_worldvars";
		public boolean spawnfirst = false;
		public String playerway1 = "none";
		public boolean Esckey = false;
		public double deds = 1;
		public WorldVariables() {
			super(DATA_NAME);
		}

		public WorldVariables(String s) {
			super(s);
		}

		@Override
		public void read(CompoundNBT nbt) {
			spawnfirst = nbt.getBoolean("spawnfirst");
			playerway1 = nbt.getString("playerway1");
			Esckey = nbt.getBoolean("Esckey");
			deds = nbt.getDouble("deds");
		}

		@Override
		public CompoundNBT write(CompoundNBT nbt) {
			nbt.putBoolean("spawnfirst", spawnfirst);
			nbt.putString("playerway1", playerway1);
			nbt.putBoolean("Esckey", Esckey);
			nbt.putDouble("deds", deds);
			return nbt;
		}

		public void syncData(World world) {
			this.markDirty();
			if (world.isRemote) {
				Theultramod.PACKET_HANDLER.sendToServer(new WorldSavedDataSyncMessage(1, this));
			} else {
				Theultramod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(world.dimension::getType), new WorldSavedDataSyncMessage(1, this));
			}
		}
		static WorldVariables clientSide = new WorldVariables();
		public static WorldVariables get(World world) {
			if (world instanceof ServerWorld) {
				return ((ServerWorld) world).getSavedData().getOrCreate(WorldVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class MapVariables extends WorldSavedData {
		public static final String DATA_NAME = "theultramod_mapvars";
		public boolean fletcherclicked = false;
		public MapVariables() {
			super(DATA_NAME);
		}

		public MapVariables(String s) {
			super(s);
		}

		@Override
		public void read(CompoundNBT nbt) {
			fletcherclicked = nbt.getBoolean("fletcherclicked");
		}

		@Override
		public CompoundNBT write(CompoundNBT nbt) {
			nbt.putBoolean("fletcherclicked", fletcherclicked);
			return nbt;
		}

		public void syncData(World world) {
			this.markDirty();
			if (world.isRemote) {
				Theultramod.PACKET_HANDLER.sendToServer(new WorldSavedDataSyncMessage(0, this));
			} else {
				Theultramod.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), new WorldSavedDataSyncMessage(0, this));
			}
		}
		static MapVariables clientSide = new MapVariables();
		public static MapVariables get(World world) {
			if (world instanceof ServerWorld) {
				return world.getServer().getWorld(DimensionType.OVERWORLD).getSavedData().getOrCreate(MapVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class WorldSavedDataSyncMessage {
		public int type;
		public WorldSavedData data;
		public WorldSavedDataSyncMessage(PacketBuffer buffer) {
			this.type = buffer.readInt();
			if (this.type == 0)
				this.data = new MapVariables();
			else
				this.data = new WorldVariables();
			this.data.read(buffer.readCompoundTag());
		}

		public WorldSavedDataSyncMessage(int type, WorldSavedData data) {
			this.type = type;
			this.data = data;
		}

		public static void buffer(WorldSavedDataSyncMessage message, PacketBuffer buffer) {
			buffer.writeInt(message.type);
			buffer.writeCompoundTag(message.data.write(new CompoundNBT()));
		}

		public static void handler(WorldSavedDataSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (context.getDirection().getReceptionSide().isServer())
					syncData(message, context.getDirection().getReceptionSide(), context.getSender().world);
				else
					syncData(message, context.getDirection().getReceptionSide(), Minecraft.getInstance().player.world);
			});
			context.setPacketHandled(true);
		}

		private static void syncData(WorldSavedDataSyncMessage message, LogicalSide side, World world) {
			if (side.isServer()) {
				message.data.markDirty();
				if (message.type == 0) {
					Theultramod.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), message);
					world.getServer().getWorld(DimensionType.OVERWORLD).getSavedData().set(message.data);
				} else {
					Theultramod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(world.dimension::getType), message);
					((ServerWorld) world).getSavedData().set(message.data);
				}
			} else {
				if (message.type == 0) {
					MapVariables.clientSide = (MapVariables) message.data;
				} else {
					WorldVariables.clientSide = (WorldVariables) message.data;
				}
			}
		}
	}
}
