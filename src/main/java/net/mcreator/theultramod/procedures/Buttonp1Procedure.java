package net.mcreator.theultramod.procedures;

import net.mcreator.theultramod.TheultramodVariables;
import net.mcreator.theultramod.TheultramodElements;

@TheultramodElements.ModElement.Tag
public class Buttonp1Procedure extends TheultramodElements.ModElement {
	public Buttonp1Procedure(TheultramodElements instance) {
		super(instance, 15);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		TheultramodVariables.button1 = (boolean) (true);
	}
}
