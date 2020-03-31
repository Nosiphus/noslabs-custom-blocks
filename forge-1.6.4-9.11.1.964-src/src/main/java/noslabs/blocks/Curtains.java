package noslabs.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLadder;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import noslabs.main.NosLabs;
import noslabs.tabs.NosLabsTab;

public class Curtains extends BlockLadder{

	public Curtains(int id, Material material) 
	{
		super(id);
		this.setCreativeTab(NosLabs.NosLabsTab);
	}

}
