package noslabs.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import noslabs.init.ModBlocks;

public class CreativeTab {

	public static CreativeTabs NosLabsTab = new CreativeTabs("NosLabs")
	{
		@Override
		public ItemStack getTabIconItem()
		{
			return new ItemStack(Item.getItemFromBlock(ModBlocks.FLUORESCENT_PANEL));
		}
	};
	
}
