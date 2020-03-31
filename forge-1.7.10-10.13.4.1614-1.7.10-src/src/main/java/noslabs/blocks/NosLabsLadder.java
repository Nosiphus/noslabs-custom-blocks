package noslabs.blocks;

import net.minecraft.block.BlockLadder;
import net.minecraft.block.material.Material;
import noslabs.main.NosLabs;

public class NosLabsLadder extends BlockLadder{

	public NosLabsLadder(Material material) 
	{
		super();
		this.setCreativeTab(NosLabs.NosLabsTab);
	}

}
