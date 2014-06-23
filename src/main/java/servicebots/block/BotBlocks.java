package servicebots.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;
import servicebots.entities.*;

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
    public static CBuilderBot blockCBuilderBot;
    public static CEleBot blockCEleBot;

    public static void init(){
                blockFaceConsole = new FaceConsole(Material.iron);
        itemConsole = new Console();
        itemBotSteel = new BotSteel();
        itemCompactorChip = new CompactorChip();
        itemHoloClip = new HoloClip();
        itemIronChunk = new IronChunk();
        itemSparkStarter = new SparkStarter();
        itemStarter = new Starter();

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
