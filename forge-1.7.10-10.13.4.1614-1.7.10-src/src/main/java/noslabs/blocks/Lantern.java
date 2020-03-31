package noslabs.blocks;

import net.minecraft.block.BlockTorch;
import net.minecraft.block.material.Material;
import noslabs.main.NosLabs;

public class Lantern extends BlockTorch{

	public Lantern(Material material) 
	{
		super();
		this.setCreativeTab(NosLabs.NosLabsTab);
	}

}
