package noslabs.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import noslabs.Main;
import noslabs.init.ModItems;
import noslabs.tabs.CreativeTab;
import noslabs.util.IHasModel;
import noslabs.util.Reference;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name) {
		
		setUnlocalizedName(Reference.MODID + "." + name);
		setRegistryName(name);
		setCreativeTab(CreativeTab.NosLabsTab);
		
		ModItems.ITEMS.add(this);
		
	}
	
	@Override
	public void registerModels() {
		
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
	
}
