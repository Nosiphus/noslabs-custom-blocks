package noslabs.items;

import net.minecraft.item.ItemFood;
import noslabs.Main;
import noslabs.init.ModItems;
import noslabs.tabs.CreativeTab;
import noslabs.util.IHasModel;
import noslabs.util.Reference;

public class FoodBase extends ItemFood implements IHasModel {

	public FoodBase(String name, int amount, float saturation, boolean isAnimalFood) {
		
		super(amount, saturation, isAnimalFood);
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
