package net.mcreator.theultramod.procedures;

import net.minecraft.world.World;

import net.mcreator.theultramod.TheultramodVariables;
import net.mcreator.theultramod.TheultramodElements;

@TheultramodElements.ModElement.Tag
public class FletcherkeyOnKeyPressedProcedure extends TheultramodElements.ModElement {
	public FletcherkeyOnKeyPressedProcedure(TheultramodElements instance) {
		super(instance, 14);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure FletcherkeyOnKeyPressed!");
			return;
		}
		World world = (World) dependencies.get("world");
		if (((TheultramodVariables.guiopen1) == (true))) {
			TheultramodVariables.WorldVariables.get(world).Esckey = (boolean) (true);
			TheultramodVariables.WorldVariables.get(world).syncData(world);
			TheultramodVariables.guiopen1 = (boolean) (false);
		}
		if (((TheultramodVariables.guiopen2) == (true))) {
			TheultramodVariables.WorldVariables.get(world).Esckey = (boolean) (true);
			TheultramodVariables.WorldVariables.get(world).syncData(world);
			TheultramodVariables.guiopen2 = (boolean) (false);
		}
	}
}
