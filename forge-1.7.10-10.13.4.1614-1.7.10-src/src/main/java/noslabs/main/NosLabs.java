package noslabs.main;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.BlockLadder;
import net.minecraft.block.BlockLever;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import noslabs.blocks.*;

@Mod(modid = NosLabs.MODID, version = NosLabs.VERSION)
public class NosLabs
{
    public static final String MODID = "NosLabs";
    public static final String VERSION = "1.1-9.12.2016";
    
    public static Block BeigePlastic;
    public static Block BlackMarble;
    public static Block BluePaneling;
    public static Block BluePlastic;
    public static Block CautionTape;
    public static Block Circuitry;
    public static Block ClayTile;
    public static Block Concrete;
    public static Block Console;
    public static Block CorrugatedCopper;
    public static Block CorrugatedSteel;
    public static Block Countertop;
    public static BlockLadder Curtains;
    public static Block DarkStoneBricks;
    public static Block DecorativeConcrete;
    public static Block FluorescentPanel;
    public static Block GoldFilgaree;
    public static Block GreenPlastic;
    public static BlockTrapDoor Hatch;
    public static Block HorizontalPipe;
    public static Block HorizontalStripe;
    public static Block IronPlate;
    public static Block IronStack;
    public static BlockTorch Lantern;
    public static BlockTorch LED;
    public static Block LimestoneBrick;
    public static Block LinoleumTile;
    public static BlockGlass NosLabsGlass;
    public static BlockLadder NosLabsLadder;
    public static Block NosLabsLamp;
    public static BlockLever NosLabsLever;
    public static Block OrangePlastic;
    public static Block Pillar;
    public static Block PinkStucco;
    public static Block RedPlastic;
    public static Block ReinforcedPaneling;
    public static Block RivetedSteel;
    public static Block Rug;
    public static Block Shale;
    public static Block SmoothMetal;
    public static Block StripeIntersection;
    public static Block TechAccent;
    public static Block TileMosaic;
    public static Block VerticalPipe;
    public static Block VerticalStripe;
    public static Block VioletVelvet;
    public static Block WhiteMarble;
    public static Block WhitePlastic;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	BeigePlastic = new BeigePlastic(Material.cloth).setBlockName("BeigePlastic").setBlockTextureName("noslabs:beige_plastic").setStepSound(Block.soundTypeCloth);
    	GameRegistry.registerBlock(BeigePlastic, MODID + BeigePlastic.getUnlocalizedName().substring(5));
    	
    	BlackMarble = new BlackMarble(Material.rock).setBlockName("BlackMarble").setBlockTextureName("noslabs:black_marble").setStepSound(Block.soundTypeStone);
    	GameRegistry.registerBlock(BlackMarble, BlackMarble.getUnlocalizedName().substring(5));
    	
    	BluePaneling = new BluePaneling(Material.rock).setBlockName("BluePaneling").setBlockTextureName("noslabs:blue_paneling").setStepSound(Block.soundTypeStone);
    	GameRegistry.registerBlock(BluePaneling, MODID + BluePaneling.getUnlocalizedName().substring(5));
    	
    	BluePlastic = new BluePlastic(Material.cloth).setBlockName("BluePlastic").setBlockTextureName("noslabs:blue_plastic").setStepSound(Block.soundTypeCloth);
    	GameRegistry.registerBlock(BluePlastic, MODID + BluePlastic.getUnlocalizedName().substring(5));
    	
    	CautionTape = new CautionTape(Material.cloth).setBlockName("CautionTape").setBlockTextureName("noslabs:caution_tape").setStepSound(Block.soundTypeCloth);
    	GameRegistry.registerBlock(CautionTape, MODID + CautionTape.getUnlocalizedName().substring(5));
    	
    	Circuitry = new Circuitry(Material.iron).setBlockName("Circuitry").setBlockTextureName("noslabs:circuitry").setStepSound(Block.soundTypeMetal);
    	GameRegistry.registerBlock(Circuitry, MODID + Circuitry.getUnlocalizedName().substring(5));
    	
    	ClayTile = new ClayTile(Material.cloth).setBlockName("ClayTile").setBlockTextureName("noslabs:clay_tile").setStepSound(Block.soundTypeCloth);
    	GameRegistry.registerBlock(ClayTile, MODID + ClayTile.getUnlocalizedName().substring(5));
    	
    	Concrete = new Concrete(Material.rock).setBlockName("Concrete").setBlockTextureName("noslabs:concrete").setStepSound(Block.soundTypeStone);
    	GameRegistry.registerBlock(Concrete, MODID + Concrete.getUnlocalizedName().substring(5));
    	
    	Console = new Console(Material.wood).setBlockName("Console").setBlockTextureName("noslabs:console").setStepSound(Block.soundTypeWood);
    	GameRegistry.registerBlock(Console, MODID + Console.getUnlocalizedName().substring(5));
    	
    	CorrugatedCopper = new CorrugatedCopper(Material.iron).setBlockName("CorrugatedCopper").setBlockTextureName("noslabs:corrugated_copper").setStepSound(Block.soundTypeMetal);
    	GameRegistry.registerBlock(CorrugatedCopper, MODID + CorrugatedCopper.getUnlocalizedName().substring(5));
    	
    	CorrugatedSteel = new CorrugatedSteel(Material.iron).setBlockName("CorrugatedSteel").setBlockTextureName("noslabs:corrugated_steel").setStepSound(Block.soundTypeMetal);
    	GameRegistry.registerBlock(CorrugatedSteel, MODID + CorrugatedSteel.getUnlocalizedName().substring(5));
    	
    	Countertop = new Countertop(Material.wood).setBlockName("Countertop").setStepSound(Block.soundTypeWood);
    	GameRegistry.registerBlock(Countertop, MODID + Countertop.getUnlocalizedName().substring(5));
    	
    	Curtains = (BlockLadder) new Curtains(Material.cloth).setBlockName("Curtains").setBlockTextureName("noslabs:curtains").setStepSound(Block.soundTypeCloth);
    	GameRegistry.registerBlock(Curtains, MODID + Curtains.getUnlocalizedName().substring(5));
    	
    	DarkStoneBricks = new DarkStoneBricks(Material.rock).setBlockName("DarkStoneBricks").setBlockTextureName("noslabs:dark_stone_bricks").setStepSound(Block.soundTypeStone);
    	GameRegistry.registerBlock(DarkStoneBricks, MODID + DarkStoneBricks.getUnlocalizedName().substring(5));
    	
    	DecorativeConcrete = new DecorativeConcrete(Material.iron).setBlockName("DecorativeConcrete").setBlockTextureName("noslabs:decorative_concrete").setStepSound(Block.soundTypeLadder);
    	GameRegistry.registerBlock(DecorativeConcrete, MODID + DecorativeConcrete.getUnlocalizedName().substring(5));
    	
    	FluorescentPanel = new FluorescentPanel(Material.glass).setBlockName("FluorescentPanel").setBlockTextureName("noslabs:fluorescent_panel").setStepSound(Block.soundTypeGlass).setLightLevel(1.0F);
    	GameRegistry.registerBlock(FluorescentPanel, MODID + FluorescentPanel.getUnlocalizedName().substring(5));
    	
    	GoldFilgaree = new GoldFilgaree(Material.cloth).setBlockName("GoldFilgaree").setBlockTextureName("noslabs:gold_filgaree").setStepSound(Block.soundTypeCloth);
    	GameRegistry.registerBlock(GoldFilgaree, MODID + GoldFilgaree.getUnlocalizedName().substring(5));
    	
    	GreenPlastic = new GreenPlastic(Material.cloth).setBlockName("GreenPlastic").setBlockTextureName("noslabs:green_plastic").setStepSound(Block.soundTypeCloth);
    	GameRegistry.registerBlock(GreenPlastic, MODID + GreenPlastic.getUnlocalizedName().substring(5));
    	
    	Hatch = (BlockTrapDoor) new Hatch(Material.wood).setBlockName("Hatch").setBlockTextureName("noslabs:hatch").setStepSound(Block.soundTypeWood);
    	GameRegistry.registerBlock(Hatch, MODID + Hatch.getUnlocalizedName().substring(5));
    	
    	HorizontalPipe = new HorizontalPipe(Material.iron).setBlockName("HorizontalPipe").setBlockTextureName("noslabs:horizontal_pipe").setStepSound(Block.soundTypeMetal);
    	GameRegistry.registerBlock(HorizontalPipe, MODID + HorizontalPipe.getUnlocalizedName().substring(5));
    	
    	HorizontalStripe = new HorizontalStripe(Material.cloth).setBlockName("HorizontalStripe").setBlockTextureName("noslabs:horizontal_stripe").setStepSound(Block.soundTypeCloth);
    	GameRegistry.registerBlock(HorizontalStripe, MODID + HorizontalStripe.getUnlocalizedName().substring(5));
    	
    	IronPlate = new IronPlate(Material.iron).setBlockName("IronPlate").setBlockTextureName("noslabs:iron_plate").setStepSound(Block.soundTypeMetal);
    	GameRegistry.registerBlock(IronPlate, MODID + IronPlate.getUnlocalizedName().substring(5));
    	
    	IronStack = new IronStack(Material.iron).setBlockName("IronStack").setBlockTextureName("noslabs:iron_stack").setStepSound(Block.soundTypeMetal);
    	GameRegistry.registerBlock(IronStack, MODID + IronStack.getUnlocalizedName().substring(5));
    	
    	Lantern = (BlockTorch) new Lantern(Material.wood).setBlockName("Lantern").setBlockTextureName("noslabs:lantern").setStepSound(Block.soundTypeWood);
    	GameRegistry.registerBlock(Lantern, MODID + Lantern.getUnlocalizedName().substring(5));
    	
    	LED = (BlockTorch) new LED(Material.glass).setBlockName("LED").setBlockTextureName("noslabs:led").setStepSound(Block.soundTypeGlass);
    	GameRegistry.registerBlock(LED, MODID + LED.getUnlocalizedName().substring(5));
    	
    	LimestoneBrick = new LimestoneBrick(Material.rock).setBlockName("LimestoneBrick").setBlockTextureName("noslabs:limestone_brick").setStepSound(Block.soundTypeStone);
    	GameRegistry.registerBlock(LimestoneBrick, MODID + LimestoneBrick.getUnlocalizedName().substring(5));
    	
    	LinoleumTile = new LinoleumTile(Material.iron).setBlockName("LinoleumTile").setBlockTextureName("noslabs:linoleum_tile").setStepSound(Block.soundTypeMetal);
    	GameRegistry.registerBlock(LinoleumTile, MODID + LinoleumTile.getUnlocalizedName().substring(5));
    	
    	NosLabsGlass = (BlockGlass) new NosLabsGlass(Material.glass).setBlockName("NosLabsGlass").setStepSound(Block.soundTypeGlass);
    	GameRegistry.registerBlock(NosLabsGlass, MODID + NosLabsGlass.getUnlocalizedName().substring(5));
    	
    	NosLabsLadder = (BlockLadder) new NosLabsLadder(Material.wood).setBlockName("NosLabsLadder").setBlockTextureName("noslabs:ladder").setStepSound(Block.soundTypeLadder);
    	GameRegistry.registerBlock(NosLabsLadder, MODID + NosLabsLadder.getUnlocalizedName().substring(5));
    	
    	NosLabsLamp = new NosLabsLamp(Material.glass).setBlockName("NosLabsLamp").setBlockTextureName("noslabs:lamp").setStepSound(Block.soundTypeGlass).setLightLevel(1.0F);
    	GameRegistry.registerBlock(NosLabsLamp, MODID + NosLabsLamp.getUnlocalizedName().substring(5));
    	
    	NosLabsLever = (BlockLever) new NosLabsLever(Material.wood).setBlockName("NosLabsLever").setBlockTextureName("noslabs:lever").setStepSound(Block.soundTypeWood);
    	GameRegistry.registerBlock(NosLabsLever, MODID + NosLabsLever.getUnlocalizedName().substring(5));
    	
    	OrangePlastic = new OrangePlastic(Material.cloth).setBlockName("OrangePlastic").setBlockTextureName("noslabs:orange_plastic").setStepSound(Block.soundTypeCloth);
    	GameRegistry.registerBlock(OrangePlastic, MODID + OrangePlastic.getUnlocalizedName().substring(5));
    	
    	Pillar = new Pillar(Material.rock).setBlockName("Pillar").setBlockTextureName("noslabs:pillar").setStepSound(Block.soundTypeStone);
    	GameRegistry.registerBlock(Pillar, MODID + Pillar.getUnlocalizedName().substring(5));
    	
    	PinkStucco = new PinkStucco(Material.cloth).setBlockName("PinkStucco").setBlockTextureName("noslabs:pink_stucco").setStepSound(Block.soundTypeCloth);
    	GameRegistry.registerBlock(PinkStucco, MODID + PinkStucco.getUnlocalizedName().substring(5));
    	
    	RedPlastic = new RedPlastic(Material.cloth).setBlockName("RedPlastic").setBlockTextureName("noslabs:red_plastic").setStepSound(Block.soundTypeCloth);
    	GameRegistry.registerBlock(RedPlastic, MODID + RedPlastic.getUnlocalizedName().substring(5));
    	
    	ReinforcedPaneling = new ReinforcedPaneling(Material.rock).setBlockName("ReinforcedPaneling").setBlockTextureName("noslabs:reinforced_paneling").setStepSound(Block.soundTypeStone);
    	GameRegistry.registerBlock(ReinforcedPaneling, MODID + ReinforcedPaneling.getUnlocalizedName().substring(5));
    	
    	RivetedSteel = new RivetedSteel(Material.iron).setBlockName("RivetedSteel").setBlockTextureName("noslabs:riveted_steel").setStepSound(Block.soundTypeMetal);
    	GameRegistry.registerBlock(RivetedSteel, MODID + RivetedSteel.getUnlocalizedName().substring(5));
    	
    	Rug = new Rug(Material.cloth).setBlockName("Rug").setBlockTextureName("noslabs:rug").setStepSound(Block.soundTypeCloth);
    	GameRegistry.registerBlock(Rug, MODID + Rug.getUnlocalizedName().substring(5));
    	
    	Shale = new Shale(Material.cloth).setBlockName("Shale").setBlockTextureName("noslabs:shale").setStepSound(Block.soundTypeCloth);
    	GameRegistry.registerBlock(Shale, MODID + Shale.getUnlocalizedName().substring(5));
    	
    	SmoothMetal = new SmoothMetal(Material.iron).setBlockName("SmoothMetal").setBlockTextureName("noslabs:smooth_metal").setStepSound(Block.soundTypeMetal);
    	GameRegistry.registerBlock(SmoothMetal, MODID + SmoothMetal.getUnlocalizedName().substring(5));
    	
    	StripeIntersection = new StripeIntersection(Material.cloth).setBlockName("StripeIntersection").setBlockTextureName("noslabs:stripe_intersection").setStepSound(Block.soundTypeCloth);
    	GameRegistry.registerBlock(StripeIntersection, MODID + StripeIntersection.getUnlocalizedName().substring(5));
    	
    	TechAccent = new TechAccent(Material.wood).setBlockName("TechAccent").setBlockTextureName("noslabs:tech_accent").setStepSound(Block.soundTypeWood);
    	GameRegistry.registerBlock(TechAccent, MODID + TechAccent.getUnlocalizedName().substring(5));
    	
    	TileMosaic = new TileMosaic(Material.rock).setBlockName("TileMosaic").setBlockTextureName("noslabs:tile_mosaic").setStepSound(Block.soundTypeStone);
    	GameRegistry.registerBlock(TileMosaic, MODID + TileMosaic.getUnlocalizedName().substring(5));
    	
    	VerticalPipe = new VerticalPipe(Material.iron).setBlockName("VerticalPipe").setBlockTextureName("noslabs:vertical_pipe").setStepSound(Block.soundTypeMetal);
    	GameRegistry.registerBlock(VerticalPipe, MODID + VerticalPipe.getUnlocalizedName().substring(5));
    	
    	VerticalStripe = new VerticalStripe(Material.cloth).setBlockName("VerticalStripe").setBlockTextureName("noslabs:vertical_stripe").setStepSound(Block.soundTypeCloth);
    	GameRegistry.registerBlock(VerticalStripe, MODID + VerticalStripe.getUnlocalizedName().substring(5));
    	
    	VioletVelvet = new VioletVelvet(Material.cloth).setBlockName("VioletVelvet").setBlockTextureName("noslabs:violet_velvet").setStepSound(Block.soundTypeCloth);
    	GameRegistry.registerBlock(VioletVelvet, MODID + VioletVelvet.getUnlocalizedName().substring(5));
    	
    	WhiteMarble = new WhiteMarble(Material.rock).setBlockName("WhiteMarble").setBlockTextureName("noslabs:white_marble").setStepSound(Block.soundTypeStone);
    	GameRegistry.registerBlock(WhiteMarble, MODID + WhiteMarble.getUnlocalizedName().substring(5));
    	
    	WhitePlastic = new WhitePlastic(Material.cloth).setBlockName("WhitePlastic").setBlockTextureName("noslabs:white_plastic").setStepSound(Block.soundTypeCloth);
    	GameRegistry.registerBlock(WhitePlastic, MODID + WhitePlastic.getUnlocalizedName().substring(5));
    }
	public static CreativeTabs NosLabsTab = new CreativeTabs("NosLabs")
	{
		@Override
		public Item getTabIconItem()
		{
			return new ItemStack(BluePaneling).getItem();
		}
	};
}
