
package net.mcreator.generallife.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.generallife.itemgroup.GeneralLifeItemGroup;
import net.mcreator.generallife.GeneralLifeModElements;

import java.util.List;

@GeneralLifeModElements.ModElement.Tag
public class HuevoCocidoItem extends GeneralLifeModElements.ModElement {
	@ObjectHolder("general_life:huevo_cocido")
	public static final Item block = null;
	public HuevoCocidoItem(GeneralLifeModElements instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(GeneralLifeItemGroup.tab).maxStackSize(64)
					.food((new Food.Builder()).hunger(6).saturation(0.3f).build()));
			setRegistryName("huevo_cocido");
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Huevo cocido."));
		}
	}
}
