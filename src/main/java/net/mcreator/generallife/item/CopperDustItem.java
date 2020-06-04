
package net.mcreator.generallife.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.generallife.itemgroup.GeneralLifeItemGroup;
import net.mcreator.generallife.GeneralLifeModElements;

@GeneralLifeModElements.ModElement.Tag
public class CopperDustItem extends GeneralLifeModElements.ModElement {
	@ObjectHolder("general_life:copper_dust")
	public static final Item block = null;
	public CopperDustItem(GeneralLifeModElements instance) {
		super(instance, 16);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(GeneralLifeItemGroup.tab).maxStackSize(64));
			setRegistryName("copper_dust");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
