
package net.mcreator.generallife.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.generallife.item.CarnePurificadaItem;
import net.mcreator.generallife.GeneralLifeModElements;

@GeneralLifeModElements.ModElement.Tag
public class GeneralLifeItemGroup extends GeneralLifeModElements.ModElement {
	public GeneralLifeItemGroup(GeneralLifeModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabgeneral_life") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(CarnePurificadaItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
