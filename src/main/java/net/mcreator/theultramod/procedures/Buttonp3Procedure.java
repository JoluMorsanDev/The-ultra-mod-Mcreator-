package net.mcreator.theultramod.procedures;

import net.mcreator.theultramod.TheultramodVariables;
import net.mcreator.theultramod.TheultramodElements;

@TheultramodElements.ModElement.Tag
public class Buttonp3Procedure extends TheultramodElements.ModElement {
	public Buttonp3Procedure(TheultramodElements instance) {
		super(instance, 37);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		TheultramodVariables.button3 = (boolean) (true);
	}
}
