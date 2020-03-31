package noslabs.blocks;
 
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import noslabs.main.NosLabs;
 
public class BlackMarble extends Block
{

	public BlackMarble(Material material)
	{
		super(material);
		this.setCreativeTab(NosLabs.NosLabsTab);
	}
}
