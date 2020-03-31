package noslabs.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import noslabs.main.NosLabs;

public class VerticalPipe extends Block{

	public VerticalPipe(Material material) 
	{
		super(material);
		this.setCreativeTab(NosLabs.NosLabsTab);
	}

}
