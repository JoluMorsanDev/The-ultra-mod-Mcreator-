package net.mcreator.theultramod.procedures;

import net.minecraft.world.World;

import net.mcreator.theultramod.TheultramodVariables;
import net.mcreator.theultramod.TheultramodElements;

@TheultramodElements.ModElement.Tag
public class DedsoundOnKeyPressedProcedure extends TheultramodElements.ModElement {
	public DedsoundOnKeyPressedProcedure(TheultramodElements instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure DedsoundOnKeyPressed!");
			return;
		}
		World world = (World) dependencies.get("world");
		if (((TheultramodVariables.WorldVariables.get(world).deds) <= 6)) {
			TheultramodVariables.WorldVariables.get(world).deds = (double) ((TheultramodVariables.WorldVariables.get(world).deds) + 1);
			TheultramodVariables.WorldVariables.get(world).syncData(world);
		} else {
			TheultramodVariables.WorldVariables.get(world).deds = (double) 1;
			TheultramodVariables.WorldVariables.get(world).syncData(world);
		}
	}
}
