
package net.mcreator.theultramod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ShearsItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.theultramod.TheultramodElements;

@TheultramodElements.ModElement.Tag
public class GoldenshearsItem extends TheultramodElements.ModElement {
	@ObjectHolder("theultramod:goldenshears")
	public static final Item block = null;
	public GoldenshearsItem(TheultramodElements instance) {
		super(instance, 29);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShearsItem(new Item.Properties().group(ItemGroup.TOOLS).maxDamage(100)) {
			@Override
			public int getItemEnchantability() {
				return 2;
			}

			@Override
			public float getDestroySpeed(ItemStack stack, BlockState block) {
				return 4f;
			}
		}.setRegistryName("goldenshears"));
	}
}
