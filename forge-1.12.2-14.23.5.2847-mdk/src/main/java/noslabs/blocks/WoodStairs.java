package noslabs.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import noslabs.Main;
import noslabs.init.ModBlocks;
import noslabs.init.ModItems;
import noslabs.tabs.CreativeTab;
import noslabs.util.IHasModel;
import noslabs.util.Reference;

public class WoodStairs extends BlockStairs implements IHasModel {

    private final Block modelBlock;
    private final IBlockState modelState;
	
	public WoodStairs(IBlockState modelState, String name) {
		
		super(modelState);
		setUnlocalizedName(Reference.MODID + "." + name);
		setRegistryName(name);
		setCreativeTab(CreativeTab.NosLabsTab);
		
        this.modelBlock = modelState.getBlock();
        this.modelState = modelState;
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		
		setHardness(2.0F);
		setHarvestLevel("axe", 0);
		setLightLevel(0.0F);
		setLightOpacity(0);
		setResistance(10.0F);
		setSoundType(SoundType.WOOD);
		
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
	
}