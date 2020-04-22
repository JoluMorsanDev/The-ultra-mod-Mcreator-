package net.mcreator.theultramod.procedures;

import net.minecraftforge.fml.network.NetworkHooks;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.network.PacketBuffer;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.theultramod.gui.SpawnguiGui;
import net.mcreator.theultramod.TheultramodVariables;
import net.mcreator.theultramod.TheultramodElements;

import io.netty.buffer.Unpooled;

@TheultramodElements.ModElement.Tag
public class Spawnguip1Procedure extends TheultramodElements.ModElement {
	public Spawnguip1Procedure(TheultramodElements instance) {
		super(instance, 2);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Spawnguip1!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Spawnguip1!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Spawnguip1!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Spawnguip1!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Spawnguip1!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((TheultramodVariables.WorldVariables.get(world).spawnfirst) == (false))) {
			if (entity instanceof ServerPlayerEntity)
				NetworkHooks.openGui((ServerPlayerEntity) entity, new INamedContainerProvider() {
					@Override
					public ITextComponent getDisplayName() {
						return new StringTextComponent("Spawngui");
					}

					@Override
					public Container createMenu(int id, PlayerInventory inventory, PlayerEntity player) {
						return new SpawnguiGui.GuiContainerMod(id, inventory,
								new PacketBuffer(Unpooled.buffer()).writeBlockPos(new BlockPos(x, y, z)));
					}
				}, new BlockPos(x, y, z));
		}
	}

	@SubscribeEvent
	public void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			Entity entity = event.player;
			World world = entity.world;
			int i = (int) entity.getPosX();
			int j = (int) entity.getPosY();
			int k = (int) entity.getPosZ();
			java.util.HashMap<String, Object> dependencies = new java.util.HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("event", event);
			this.executeProcedure(dependencies);
		}
	}
}
