package servicebots.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;
import servicebots.tileentities.TileEntityBotBox;
import servicebots.tileentities.TileEntityChargeBlock;
import servicebots.tileentities.TileEntityEZBotMover;

/**
 * Created by Imalune on 6/22/2014.
 */
public class BotBlocks {
    public static BotBox blockBotBox;
    public static BotSide blockBotSide;
    public static BotStation blockBotStation;
    //public static BotCloner blockBotCloner;
    public static ChargeBlock blockChargeBlock;
    public static CompactBuilderBot blockCompactBuilderBot;
    public static CompactEleBot blockCompactEleBot;
    public static EZBotMover blockEZBotMover;
    public static FaceConsole blockFaceConsole;
    public static PerimeterMap blockPerimeterMap;

    public static void init(){
        blockBotBox = new BotBox(Material.iron);
        blockBotSide = new BotSide(Material.iron);
        blockBotStation = new BotStation(Material.iron);
        blockChargeBlock = new ChargeBlock(Material.iron);
        blockCompactBuilderBot = new CompactBuilderBot(Material.cake);
        blockCompactEleBot = new CompactEleBot(Material.cake);
        blockEZBotMover = new EZBotMover(Material.iron);
        blockFaceConsole = new FaceConsole(Material.iron);
        blockPerimeterMap = new PerimeterMap(Material.cake);

        GameRegistry.registerBlock(blockBotBox,"BotBox");
        GameRegistry.registerBlock(blockBotSide,"BotSide");
        GameRegistry.registerBlock(blockBotStation,"BotStation");
       // GameRegistry.registerBlock(blockBotCloner,"BotCloner");
        GameRegistry.registerBlock(blockChargeBlock,"ChargeBlock");
        GameRegistry.registerBlock(blockCompactBuilderBot,"CompactBuilderBot");
        GameRegistry.registerBlock(blockCompactEleBot,"CompactEleBot");
        GameRegistry.registerBlock(blockEZBotMover,"EZBotMover");
        GameRegistry.registerBlock(blockFaceConsole,"FaceConsole");
        GameRegistry.registerBlock(blockPerimeterMap,"PerimeterMap");
        GameRegistry.registerTileEntity(TileEntityBotBox.class, "TileEntityBotBox");
        GameRegistry.registerTileEntity(TileEntityChargeBlock.class,"TileEntityChargeBlock");
        GameRegistry.registerTileEntity(TileEntityEZBotMover.class,"TileEntityEZBlockMover");
    }
}
