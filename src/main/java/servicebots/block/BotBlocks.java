package servicebots.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;

/**
 * Created by Imalune on 6/22/2014.
 */
public class BotBlocks {
    public static BotSide blockBotSide;
    public static BotStation blockBotStation;
    public static BotSteel itemBotSteel;
    public static BotSteelGenerator blockBotSteelGenerator;
    public static ChargeBlock blockChargeBlock;
    public static Compactor itemCompactor;
    public static CompactorChip itemCompactorChip;
    public static Console itemConsole;
    public static EZBotMover blockEZBotMover;
    public static FaceConsole blockFaceConsole;
    public static HoloClip itemHoloClip;
    public static IronChunk itemIronChunk;
    public static SparkStarter itemSparkStarter;
    public static Starter itemStarter;

    public static void init(){
        blockBotSide = new BotSide(Material.iron);
        blockBotStation = new BotStation(Material.iron);
        blockBotSteelGenerator = new BotSteelGenerator(Material.iron);
        blockChargeBlock = new ChargeBlock(Material.iron);
        blockEZBotMover = new EZBotMover(Material.iron);
        blockFaceConsole = new FaceConsole(Material.iron);

        GameRegistry.registerBlock(blockBotSide,"BotSide");
        GameRegistry.registerBlock(blockBotStation,"BotStation");
        GameRegistry.registerItem(itemBotSteel,"BotSteel");
        GameRegistry.registerBlock(blockBotSteelGenerator,"BotSteelGenerator");
        GameRegistry.registerBlock(blockChargeBlock,"ChargeBlock");
        GameRegistry.registerItem(itemCompactor,"Compactor");
        GameRegistry.registerItem(itemCompactorChip,"CompactorChip");
        GameRegistry.registerItem(itemConsole,"Console");
        GameRegistry.registerBlock(blockEZBotMover,"EZBotMover");
        GameRegistry.registerBlock(blockFaceConsole,"FaceConsole");
        GameRegistry.registerItem(itemHoloClip,"HoloClip");
        GameRegistry.registerItem(itemIronChunk,"IronChunk");
        GameRegistry.registerItem(itemSparkStarter,"SparkStarter");
        GameRegistry.registerItem(itemStarter,"Starter");
    }
}
