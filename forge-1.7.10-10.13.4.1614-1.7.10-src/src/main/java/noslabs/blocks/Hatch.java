package noslabs.blocks;

import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.material.Material;
import noslabs.main.NosLabs;

public class Hatch extends BlockTrapDoor{

	public Hatch(Material material) 
	{
		super(material);
		this.setCreativeTab(NosLabs.NosLabsTab);
	}

}
