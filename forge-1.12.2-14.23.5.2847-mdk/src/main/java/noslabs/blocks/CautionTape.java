package noslabs.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSoulSand;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import noslabs.Main;
import noslabs.init.ModBlocks;
import noslabs.init.ModItems;
import noslabs.tabs.CreativeTab;
import noslabs.util.IHasModel;
import noslabs.util.Reference;

public class CautionTape extends BlockSoulSand implements IHasModel {

	public CautionTape(String name) {
		
		super();
		setUnlocalizedName(Reference.MODID + "." + name);
		setRegistryName(name);
		setCreativeTab(CreativeTab.NosLabsTab);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		
		setHardness(0.5F);
		setHarvestLevel("shovel", 0);
		setLightLevel(0.0F);
		setLightOpacity(16);
		setResistance(2.5F);
		setSoundType(SoundType.SAND);
		
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
	
}