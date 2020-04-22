package net.mcreator.theultramod.procedures;

import net.mcreator.theultramod.TheultramodVariables;
import net.mcreator.theultramod.TheultramodElements;

@TheultramodElements.ModElement.Tag
public class Buttonp2Procedure extends TheultramodElements.ModElement {
	public Buttonp2Procedure(TheultramodElements instance) {
		super(instance, 20);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		TheultramodVariables.button2 = (boolean) (true);
	}
}
