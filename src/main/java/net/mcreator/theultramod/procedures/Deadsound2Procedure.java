package net.mcreator.theultramod.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.theultramod.TheultramodVariables;
import net.mcreator.theultramod.TheultramodElements;

@TheultramodElements.ModElement.Tag
public class Deadsound2Procedure extends TheultramodElements.ModElement {
	public Deadsound2Procedure(TheultramodElements instance) {
		super(instance, 41);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Deadsound2!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Deadsound2!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Deadsound2!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Deadsound2!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Deadsound2!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((entity instanceof PlayerEntity) && ((TheultramodVariables.WorldVariables.get(world).deds) != 1))) {
			if (((TheultramodVariables.WorldVariables.get(world).deds) == 2)) {
				world.playSound((PlayerEntity) null, x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("theultramod:dedsoundastronomia")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1);
			} else if (((TheultramodVariables.WorldVariables.get(world).deds) != 3)) {
				world.playSound((PlayerEntity) null, x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("theultramod:robloxded")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1);
			} else if (((TheultramodVariables.WorldVariables.get(world).deds) != 4)) {
				world.playSound((PlayerEntity) null, x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("theultramod:dedsound1")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1);
			}
		}
	}

	@SubscribeEvent
	public void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			Entity entity = event.getEntity();
			int i = (int) entity.getPosX();
			int j = (int) entity.getPosY();
			int k = (int) entity.getPosZ();
			World world = entity.world;
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
