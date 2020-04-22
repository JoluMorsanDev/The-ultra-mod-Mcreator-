
package net.mcreator.theultramod.keybind;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.network.NetworkEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.network.PacketBuffer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.client.Minecraft;

import net.mcreator.theultramod.procedures.DedsoundOnKeyPressedProcedure;
import net.mcreator.theultramod.TheultramodElements;
import net.mcreator.theultramod.Theultramod;

import java.util.function.Supplier;

@TheultramodElements.ModElement.Tag
public class DedsoundKeyBinding extends TheultramodElements.ModElement {
	@OnlyIn(Dist.CLIENT)
	private KeyBinding keys;
	public DedsoundKeyBinding(TheultramodElements instance) {
		super(instance, 42);
		elements.addNetworkMessage(KeyBindingPressedMessage.class, KeyBindingPressedMessage::buffer, KeyBindingPressedMessage::new,
				KeyBindingPressedMessage::handler);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void initElements() {
		keys = new KeyBinding("key.mcreator.dedsound", GLFW.GLFW_KEY_0, "key.categories.misc");
		ClientRegistry.registerKeyBinding(keys);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public void onKeyInput(InputEvent.KeyInputEvent event) {
		if (Minecraft.getInstance().currentScreen == null) {
			if (event.getKey() == keys.getKey().getKeyCode() && event.getAction() == GLFW.GLFW_PRESS) {
				Theultramod.PACKET_HANDLER.sendToServer(new KeyBindingPressedMessage());
				pressAction(Minecraft.getInstance().player);
			}
		}
	}
	public static class KeyBindingPressedMessage {
		public KeyBindingPressedMessage() {
		}

		public KeyBindingPressedMessage(PacketBuffer buffer) {
		}

		public static void buffer(KeyBindingPressedMessage message, PacketBuffer buffer) {
		}

		public static void handler(KeyBindingPressedMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				pressAction(context.getSender());
			});
			context.setPacketHandled(true);
		}
	}
	private static void pressAction(PlayerEntity entity) {
		World world = entity.world;
		int x = (int) entity.getPosX();
		int y = (int) entity.getPosY();
		int z = (int) entity.getPosZ();
		// security measure to prevent arbitrary chunk generation
		if (!world.isBlockLoaded(new BlockPos(x, y, z)))
			return;
		{
			java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
			$_dependencies.put("world", world);
			DedsoundOnKeyPressedProcedure.executeProcedure($_dependencies);
		}
	}
}
