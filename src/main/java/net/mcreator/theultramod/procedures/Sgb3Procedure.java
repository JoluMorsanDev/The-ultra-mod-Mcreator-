package net.mcreator.theultramod.procedures;

import net.minecraft.world.World;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.theultramod.TheultramodVariables;
import net.mcreator.theultramod.TheultramodElements;

@TheultramodElements.ModElement.Tag
public class Sgb3Procedure extends TheultramodElements.ModElement {
	public Sgb3Procedure(TheultramodElements instance) {
		super(instance, 5);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Sgb3!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Sgb3!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		TheultramodVariables.WorldVariables.get(world).playerway1 = (String) "Hunter";
		TheultramodVariables.WorldVariables.get(world).syncData(world);
		TheultramodVariables.WorldVariables.get(world).spawnfirst = (boolean) (true);
		TheultramodVariables.WorldVariables.get(world).syncData(world);
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).closeScreen();
	}
}
