package noslabs.main;

import net.minecraft.block.Block;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.BlockHalfSlab;
import net.minecraft.block.BlockLadder;
import net.minecraft.block.BlockLever;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.material.Material;
import noslabs.blocks.*;
import noslabs.items.*;
import noslabs.tabs.NosLabsTab;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

@Mod(modid = NosLabs.MODID, version = NosLabs.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class NosLabs
{
    public static final String MODID = "NosLabs";
    public static final String VERSION = "1.0";
    
    public static CreativeTabs NosLabsTab = new NosLabsTab(CreativeTabs.getNextID(), "NosLabs");
    
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
    public static BlockHalfSlab HalfStep;
    public static BlockTrapDoor Hatch;
    public static Block HorizontalPipe;
    public static Block HorizontalStripe;
    public static Block IronPlate;
    public static Block IronStack;
    public static BlockTorch Lantern;
    public static BlockTorch LED;
    public static Block LimestoneBrick;
    public static Block LinoleumTile;
    public static Block LitMonitor;
    public static Block Monitor;
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
    
    public static Item Pencil;
    
    @EventHandler
    public void load(FMLInitializationEvent event)
    {
    	BlackMarble = new BlackMarble(2692, Material.rock).setUnlocalizedName("BlackMarble").setTextureName("noslabs:black_marble").setStepSound(Block.soundStoneFootstep);
    	GameRegistry.registerBlock(BlackMarble, MODID + BlackMarble.getUnlocalizedName().substring(5));
    	LanguageRegistry.addName(BlackMarble, "Black Marble");
    	
    	BluePaneling = new BluePaneling(2693, Material.rock).setUnlocalizedName("BluePaneling").setTextureName("noslabs:blue_paneling").setStepSound(Block.soundStoneFootstep);
    	GameRegistry.registerBlock(BluePaneling, MODID + BluePaneling.getUnlocalizedName().substring(5));
    	LanguageRegistry.addName(BluePaneling, "Blue Paneling");
    	
    	BluePlastic = new BluePlastic(2694, Material.cloth).setUnlocalizedName("BluePlastic").setTextureName("noslabs:blue_plastic").setStepSound(Block.soundClothFootstep);
    	GameRegistry.registerBlock(BluePlastic, MODID + BluePlastic.getUnlocalizedName().substring(5));
    	LanguageRegistry.addName(BluePlastic, "Blue Plastic");
    	
    	CautionTape = new CautionTape(2695, Material.cloth).setUnlocalizedName("CautionTape").setTextureName("noslabs:caution_tape").setStepSound(Block.soundClothFootstep);
    	GameRegistry.registerBlock(CautionTape, MODID + CautionTape.getUnlocalizedName().substring(5));
    	LanguageRegistry.addName(CautionTape, "Caution Tape");
    	
    	Circuitry = new Circuitry(2696, Material.iron).setUnlocalizedName("Circuitry").setTextureName("noslabs:circuitry").setStepSound(Block.soundMetalFootstep);
    	GameRegistry.registerBlock(Circuitry, MODID + Circuitry.getUnlocalizedName().substring(5));
    	LanguageRegistry.addName(Circuitry, "Circuitry");
    	
    	ClayTile = new ClayTile(2697, Material.clay).setUnlocalizedName("ClayTile").setTextureName("noslabs:clay_tile").setStepSound(Block.soundGravelFootstep);
    	GameRegistry.registerBlock(ClayTile, MODID + ClayTile.getUnlocalizedName().substring(5));
    	LanguageRegistry.addName(ClayTile, "Clay Tile");
    	
    	Concrete = new Concrete(2698, Material.rock).setUnlocalizedName("Concrete").setTextureName("noslabs:concrete").setStepSound(Block.soundStoneFootstep);
    	GameRegistry.registerBlock(Concrete, MODID + Concrete.getUnlocalizedName().substring(5));
    	LanguageRegistry.addName(Concrete, "Concrete");
    	
    	Console = new Console(2699, Material.wood).setUnlocalizedName("Console").setTextureName("noslabs:console").setStepSound(Block.soundWoodFootstep);
    	GameRegistry.registerBlock(Console, MODID + Console.getUnlocalizedName().substring(5));
    	LanguageRegistry.addName(Console, "Console");
    	
    	CorrugatedCopper = new CorrugatedCopper(2700, Material.iron).setUnlocalizedName("CorrugatedCopper").setTextureName("noslabs:corrugated_copper").setStepSound(Block.soundMetalFootstep);
    	GameRegistry.registerBlock(CorrugatedCopper, MODID + CorrugatedCopper.getUnlocalizedName().substring(5));
    	LanguageRegistry.addName(CorrugatedCopper, "Corrugated Copper");
    	
    	CorrugatedSteel = new CorrugatedSteel(2701, Material.iron).setUnlocalizedName("CorrugatedSteel").setTextureName("noslabs:corrugated_steel").setStepSound(Block.soundMetalFootstep);
    	GameRegistry.registerBlock(CorrugatedSteel, MODID + CorrugatedSteel.getUnlocalizedName().substring(5));
    	LanguageRegistry.addName(CorrugatedSteel, "Corrugated Steel");
    	
    	Countertop = new Countertop(2702, Material.wood).setUnlocalizedName("Countertop").setStepSound(Block.soundWoodFootstep);
    	GameRegistry.registerBlock(Countertop, MODID + Countertop.getUnlocalizedName().substring(5));
    	LanguageRegistry.addName(Countertop, "Countertop");
    	
    	Curtains = (BlockLadder) new Curtains(2703, Material.cloth).setUnlocalizedName("Curtains").setTextureName("noslabs:curtains").setStepSound(Block.soundClothFootstep);
    	GameRegistry.registerBlock(Curtains, MODID + Curtains.getUnlocalizedName().substring(5));
    	LanguageRegistry.addName(Curtains, "Curtains");
    	
    	DarkStoneBricks = new DarkStoneBricks(2704, Material.rock).setUnlocalizedName("DarkStoneBricks").setTextureName("noslabs:dark_stone_bricks").setStepSound(Block.soundStoneFootstep);
    	GameRegistry.registerBlock(DarkStoneBricks, MODID + DarkStoneBricks.getUnlocalizedName().substring(5));
    	LanguageRegistry.addName(DarkStoneBricks, "Dark Stone Bricks");
    	
    	DecorativeConcrete = new DecorativeConcrete(2705, Material.iron).setUnlocalizedName("DecorativeConcrete").setTextureName("noslabs:decorative_concrete").setStepSound(Block.soundMetalFootstep);
    	GameRegistry.registerBlock(DecorativeConcrete, MODID + DecorativeConcrete.getUnlocalizedName().substring(5));
    	LanguageRegistry.addName(DecorativeConcrete, "Decorative Concrete");
    	
    	FluorescentPanel = new FluorescentPanel(2706, Material.glass).setUnlocalizedName("FluorescentPanel").setTextureName("noslabs:flourescent_panel").setStepSound(Block.soundGlassFootstep).setLightValue(1.0F);
    	GameRegistry.registerBlock(FluorescentPanel, MODID + FluorescentPanel.getUnlocalizedName().substring(5));
    	LanguageRegistry.addName(FluorescentPanel, "Fluorescent Panel");
    	
    	GoldFilgaree = new GoldFilgaree(2707, Material.cloth).setUnlocalizedName("GoldFilgaree").setTextureName("noslabs:gold_filgaree").setStepSound(Block.soundClothFootstep);
    	GameRegistry.registerBlock(GoldFilgaree, MODID + GoldFilgaree.getUnlocalizedName().substring(5));
    	LanguageRegistry.addName(GoldFilgaree, "Gold Filgaree");
    	
    	GreenPlastic = new GreenPlastic(2708, Material.cloth).setUnlocalizedName("GreenPlastic").setTextureName("noslabs:green_plastic").setStepSound(Block.soundClothFootstep);
    	GameRegistry.registerBlock(GreenPlastic, MODID + GreenPlastic.getUnlocalizedName().substring(5));
    	LanguageRegistry.addName(GreenPlastic, "Green Plastic");
    	
    	HalfStep = (BlockHalfSlab) new HalfStep(2709, Material.rock).setUnlocalizedName("HalfStep").setTextureName("noslabs:half_step").setStepSound(Block.soundStoneFootstep);
    	GameRegistry.registerBlock(HalfStep, MODID + HalfStep.getUnlocalizedName().substring(5));
    	LanguageRegistry.addName(HalfStep, "Half Step");
    	
    	Hatch = (BlockTrapDoor) new Hatch(2710, Material.wood).setUnlocalizedName("Hatch").setTextureName("noslabs:hatch").setStepSound(Block.soundWoodFootstep);
    	GameRegistry.registerBlock(Hatch, MODID + Hatch.getUnlocalizedName().substring(5));
    	LanguageRegistry.addName(Hatch, "Hatch");
    	
    	HorizontalPipe = new HorizontalPipe(2711, Material.iron).setUnlocalizedName("HorizontalPipe").setTextureName("noslabs:horizontal_pipe").setStepSound(Block.soundMetalFootstep);
    	GameRegistry.registerBlock(HorizontalPipe, MODID + HorizontalPipe.getUnlocalizedName().substring(5));
    	LanguageRegistry.addName(HorizontalPipe, "Horizontal Pipe");
    	
    	HorizontalStripe = new HorizontalStripe(2712, Material.cloth).setUnlocalizedName("HorizontalStripe").setTextureName("noslabs:horizontal_stripe").setStepSound(Block.soundClothFootstep);
    	GameRegistry.registerBlock(HorizontalStripe, MODID + HorizontalStripe.getUnlocalizedName().substring(5));
    	LanguageRegistry.addName(HorizontalStripe, "Horizontal Stripe");
    	
    	IronPlate = new IronPlate(2713, Material.iron).setUnlocalizedName("IronPlate").setTextureName("noslabs:iron_plate").setStepSound(Block.soundMetalFootstep);
    	GameRegistry.registerBlock(IronPlate, MODID + IronPlate.getUnlocalizedName().substring(5));
    	LanguageRegistry.addName(IronPlate, "Iron Plate");
    	
    	IronStack = new IronStack(2714, Material.iron).setUnlocalizedName("IronStack").setTextureName("noslabs:iron_stack").setStepSound(Block.soundMetalFootstep);
    	GameRegistry.registerBlock(IronStack, MODID + IronStack.getUnlocalizedName().substring(5));
    	LanguageRegistry.addName(IronStack, "Iron Stack");
    	
    	Lantern = (BlockTorch) new Lantern(2715, Material.wood).setUnlocalizedName("Lantern").setTextureName("noslabs:lantern").setStepSound(Block.soundWoodFootstep);
    	GameRegistry.registerBlock(Lantern, MODID + Lantern.getUnlocalizedName().substring(5));
    	LanguageRegistry.addName(Lantern, "Lantern");
    	
    	LED = (BlockTorch) new LED(2716, Material.glass).setUnlocalizedName("LED").setTextureName("noslabs:led").setStepSound(Block.soundGlassFootstep);
    	GameRegistry.registerBlock(LED, MODID + LED.getUnlocalizedName().substring(5));
    	LanguageRegistry.addName(LED, "LED");
    	
    	LimestoneBrick = new LimestoneBrick(2717, Material.rock).setUnlocalizedName("LimestoneBrick").setTextureName("noslabs:limestone_brick").setStepSound(Block.soundStoneFootstep);
    	GameRegistry.registerBlock(LimestoneBrick, MODID + LimestoneBrick.getUnlocalizedName().substring(5));
    	LanguageRegistry.addName(LimestoneBrick, "Limestone Brick");
    	
    	LinoleumTile = new LinoleumTile(2718, Material.iron).setUnlocalizedName("LinoleumTile").setTextureName("noslabs:linoleum_tile").setStepSound(Block.soundMetalFootstep);
    	GameRegistry.registerBlock(LinoleumTile, MODID + LinoleumTile.getUnlocalizedName().substring(5));
    	LanguageRegistry.addName(LinoleumTile, "Linoleum Tile");
    	
    	LitMonitor = new LitMonitor(2719, Material.iron).setUnlocalizedName("LitMonitor").setStepSound(Block.soundMetalFootstep);
    	GameRegistry.registerBlock(LitMonitor, MODID + LitMonitor.getUnlocalizedName().substring(5));
    	LanguageRegistry.addName(LitMonitor, "Lit Monitor");
    	
    	Monitor = new Monitor(2720, Material.iron).setUnlocalizedName("Monitor").setStepSound(Block.soundMetalFootstep);
    	GameRegistry.registerBlock(Monitor, MODID + Monitor.getUnlocalizedName().substring(5));
    	LanguageRegistry.addName(Monitor, "Monitor");
    	
    	NosLabsGlass = (BlockGlass) new NosLabsGlass(2721, Material.glass).setUnlocalizedName("NosLabsGlass").setStepSound(Block.soundGlassFootstep);
    	GameRegistry.registerBlock(NosLabsGlass, MODID + NosLabsGlass.getUnlocalizedName().substring(5));
    	LanguageRegistry.addName(NosLabsGlass, "NosLabs Glass");
    	
    	NosLabsLadder = (BlockLadder) new NosLabsLadder(2722, Material.wood).setUnlocalizedName("NosLabsLadder").setTextureName("noslabs:ladder").setStepSound(Block.soundWoodFootstep);
    	GameRegistry.registerBlock(NosLabsLadder, MODID + NosLabsLadder.getUnlocalizedName().substring(5));
    	LanguageRegistry.addName(NosLabsLadder, "NosLabs Ladder");
    	
    	NosLabsLamp = new NosLabsLamp(2723, Material.glass).setUnlocalizedName("NosLabsLamp").setTextureName("noslabs:lamp").setStepSound(Block.soundGlassFootstep).setLightValue(1.0F);
    	GameRegistry.registerBlock(NosLabsLamp, MODID + NosLabsLamp.getUnlocalizedName().substring(5));
    	LanguageRegistry.addName(NosLabsLamp, "NosLabs Lamp");
    	
    	NosLabsLever = (BlockLever) new NosLabsLever(2724, Material.wood).setUnlocalizedName("NosLabsLever").setTextureName("noslabs:lever").setStepSound(Block.soundWoodFootstep);
    	GameRegistry.registerBlock(NosLabsLever, MODID + NosLabsLever.getUnlocalizedName().substring(5));
    	LanguageRegistry.addName(NosLabsLever, "NosLabs Lever");
    	
    	OrangePlastic = new OrangePlastic(2725, Material.cloth).setUnlocalizedName("OrangePlastic").setTextureName("noslabs:orange_plastic").setStepSound(Block.soundClothFootstep);
    	GameRegistry.registerBlock(OrangePlastic, MODID + OrangePlastic.getUnlocalizedName().substring(5));
    	LanguageRegistry.addName(OrangePlastic, "Orange Plastic");
    	
    	Pillar = new Pillar(2726, Material.rock).setUnlocalizedName("Pillar").setTextureName("noslabs:pillar").setStepSound(Block.soundStoneFootstep);
    	GameRegistry.registerBlock(Pillar, MODID + Pillar.getUnlocalizedName().substring(5));
    	LanguageRegistry.addName(Pillar, "Pillar");
    	
    	PinkStucco = new PinkStucco(2727, Material.cloth).setUnlocalizedName("PinkStucco").setTextureName("noslabs:pink_stucco").setStepSound(Block.soundClothFootstep);
    	GameRegistry.registerBlock(PinkStucco, MODID + PinkStucco.getUnlocalizedName().substring(5));
    	LanguageRegistry.addName(PinkStucco, "Pink Stucco");
    	
    	RedPlastic = new RedPlastic(2728, Material.cloth).setUnlocalizedName("RedPlastic").setTextureName("noslabs:red_plastic").setStepSound(Block.soundClothFootstep);
    	GameRegistry.registerBlock(RedPlastic, MODID + RedPlastic.getUnlocalizedName().substring(5));
    	LanguageRegistry.addName(RedPlastic, "Red Plastic");
    	
    	ReinforcedPaneling = new ReinforcedPaneling(2729, Material.rock).setUnlocalizedName("ReinforcedPaneling").setTextureName("noslabs:reinforced_paneling").setStepSound(Block.soundStoneFootstep);
    	GameRegistry.registerBlock(ReinforcedPaneling, MODID + ReinforcedPaneling.getUnlocalizedName().substring(5));
    	LanguageRegistry.addName(ReinforcedPaneling, "Reinforced Paneling");
    	
    	RivetedSteel = new RivetedSteel(2730, Material.rock).setUnlocalizedName("RivetedSteel").setTextureName("noslabs:riveted_steel").setStepSound(Block.soundStoneFootstep);
    	GameRegistry.registerBlock(RivetedSteel, MODID + RivetedSteel.getUnlocalizedName().substring(5));
    	LanguageRegistry.addName(RivetedSteel, "Riveted Steel");
    	
    	Rug = new Rug(2731, Material.cloth).setUnlocalizedName("Rug").setTextureName("noslabs:rug").setStepSound(Block.soundClothFootstep);
    	GameRegistry.registerBlock(Rug, MODID + Rug.getUnlocalizedName().substring(5));
    	LanguageRegistry.addName(Rug, "Rug");
    	
    	Shale = new Shale(2732, Material.cloth).setUnlocalizedName("Shale").setTextureName("noslabs:shale").setStepSound(Block.soundClothFootstep);
    	GameRegistry.registerBlock(Shale, MODID + Shale.getUnlocalizedName().substring(5));
    	LanguageRegistry.addName(Shale, "Shale");
    	
    	SmoothMetal = new SmoothMetal(2733, Material.iron).setUnlocalizedName("SmoothMetal").setTextureName("noslabs:smooth_metal").setStepSound(Block.soundMetalFootstep);
    	GameRegistry.registerBlock(SmoothMetal, MODID + SmoothMetal.getUnlocalizedName().substring(5));
    	LanguageRegistry.addName(SmoothMetal, "Smooth Metal");
    	
    	StripeIntersection = new StripeIntersection(2734, Material.cloth).setUnlocalizedName("StripeIntersection").setTextureName("noslabs:stripe_intersection").setStepSound(Block.soundClothFootstep);
    	GameRegistry.registerBlock(StripeIntersection, MODID + StripeIntersection.getUnlocalizedName().substring(5));
    	LanguageRegistry.addName(StripeIntersection, "Stripe Intersection");
    	
    	TechAccent = new TechAccent(2735, Material.wood).setUnlocalizedName("TechAccent").setTextureName("noslabs:tech_accent").setStepSound(Block.soundWoodFootstep);
    	GameRegistry.registerBlock(TechAccent, MODID + TechAccent.getUnlocalizedName().substring(5));
    	LanguageRegistry.addName(TechAccent, "Tech Accent");
    	
    	TileMosaic = new TileMosaic(2736, Material.rock).setUnlocalizedName("TileMosaic").setTextureName("noslabs:tile_mosaic").setStepSound(Block.soundStoneFootstep);
    	GameRegistry.registerBlock(TileMosaic, MODID + TileMosaic.getUnlocalizedName().substring(5));
    	LanguageRegistry.addName(TileMosaic, "Tile Mosaic");
    	
    	VerticalPipe = new VerticalPipe(2737, Material.iron).setUnlocalizedName("VerticalPipe").setTextureName("noslabs:vertical_pipe").setStepSound(Block.soundMetalFootstep);
    	GameRegistry.registerBlock(VerticalPipe, MODID + VerticalPipe.getUnlocalizedName().substring(5));
    	LanguageRegistry.addName(VerticalPipe, "Vertical Pipe");
    	
    	VerticalStripe = new VerticalStripe(2738, Material.cloth).setUnlocalizedName("VerticalStripe").setTextureName("noslabs:vertical_stripe").setStepSound(Block.soundClothFootstep);
    	GameRegistry.registerBlock(VerticalStripe, MODID + VerticalStripe.getUnlocalizedName().substring(5));
    	LanguageRegistry.addName(VerticalStripe, "Vertical Stripe");
    	
    	VioletVelvet = new VioletVelvet(2739, Material.cloth).setUnlocalizedName("VioletVelvet").setTextureName("noslabs:violet_velvet").setStepSound(Block.soundClothFootstep);
    	GameRegistry.registerBlock(VioletVelvet, MODID + VioletVelvet.getUnlocalizedName().substring(5));
    	LanguageRegistry.addName(VioletVelvet, "Violet Velvet");
    	
    	WhiteMarble = new WhiteMarble(2740, Material.rock).setUnlocalizedName("WhiteMarble").setTextureName("noslabs:white_marble").setStepSound(Block.soundStoneFootstep);
    	GameRegistry.registerBlock(WhiteMarble, MODID + WhiteMarble.getUnlocalizedName().substring(5));
    	LanguageRegistry.addName(WhiteMarble, "White Marble");
    	
    	Pencil = new Pencil(8000).setUnlocalizedName("Pencil").setTextureName("noslabs:pencil");
    	LanguageRegistry.addName(Pencil, "Pencil");
    }
}
