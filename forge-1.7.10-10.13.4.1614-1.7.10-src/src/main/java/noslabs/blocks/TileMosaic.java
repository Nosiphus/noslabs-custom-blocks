package noslabs.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import noslabs.main.NosLabs;

public class TileMosaic extends Block{

	public TileMosaic(Material material) 
	{
		super(material);
		this.setCreativeTab(NosLabs.NosLabsTab);
	}

}