package noslabs.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import noslabs.main.NosLabs;
import noslabs.tabs.NosLabsTab;

public class CorrugatedSteel extends Block{

	public CorrugatedSteel(int id, Material material) 
	{
		super(id, material);
		this.setCreativeTab(NosLabs.NosLabsTab);
	}

}