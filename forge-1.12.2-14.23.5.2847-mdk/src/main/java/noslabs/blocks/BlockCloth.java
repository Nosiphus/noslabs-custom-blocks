package noslabs.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockCloth extends BlockBase {

	public BlockCloth(String name) {
		
		super(name, Material.CLOTH);
		
		setHardness(0.8F);
		setHarvestLevel("shears", 0);
		setLightLevel(0.0F);
		setLightOpacity(16);
		setResistance(4.0F);
		setSoundType(SoundType.CLOTH);
		
	}
	
}