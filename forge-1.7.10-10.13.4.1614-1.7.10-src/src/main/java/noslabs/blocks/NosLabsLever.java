package noslabs.blocks;

import net.minecraft.block.BlockLever;
import net.minecraft.block.material.Material;
import noslabs.main.NosLabs;

public class NosLabsLever extends BlockLever{

	public NosLabsLever(Material material) 
	{
		super();
		this.setCreativeTab(NosLabs.NosLabsTab);
	}

}
