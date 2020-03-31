package noslabs.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockHalfSlab;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import noslabs.main.NosLabs;
import noslabs.tabs.NosLabsTab;

public class HalfStep extends BlockHalfSlab{

	public HalfStep(int id, Material material) 
	{
		super(id, false, material);
		this.setCreativeTab(NosLabs.NosLabsTab);
	}

	@Override
	public String getFullSlabName(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
