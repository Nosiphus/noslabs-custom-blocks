package noslabs.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import noslabs.main.NosLabs;

public class CautionTape extends Block{

	public CautionTape(Material material) 
	{
		super(material);
		this.setCreativeTab(NosLabs.NosLabsTab);
	}

}
