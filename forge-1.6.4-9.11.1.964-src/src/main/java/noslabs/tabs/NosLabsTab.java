package noslabs.tabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import noslabs.main.NosLabs;
public final class NosLabsTab extends CreativeTabs
{
	public NosLabsTab(int par1, String par2Str)
	{
		super(par1, par2Str);
	}


	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex()
	{
		return NosLabs.BluePaneling.blockID;
	}



	public String getTranslatedTabLabel()
	{
		return "NosLabs";
	}
}