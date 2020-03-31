package noslabs.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLever;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import noslabs.main.NosLabs;
import noslabs.tabs.NosLabsTab;

public class NosLabsLever extends BlockLever{

	public NosLabsLever(int id, Material material) 
	{
		super(id);
		this.setCreativeTab(NosLabs.NosLabsTab);
	}

}
