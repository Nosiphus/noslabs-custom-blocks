package noslabs.blocks;

import net.minecraft.block.BlockTorch;
import net.minecraft.block.material.Material;
import noslabs.main.NosLabs;

public class LED extends BlockTorch{

	public LED(Material material) 
	{
		super();
		this.setCreativeTab(NosLabs.NosLabsTab);
	}

}
