package servicebots.items;

import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Imalune on 6/22/2014.
 */
public class BotItems {
    public static BotSteel itemBotSteel;
    public static ClonedBotSteel itemClonedBotSteel;
    public static Compactor itemCompactor;
    public static CompactorChip itemCompactorChip;
    public static Console itemConsole;
    public static HoloClip itemHoloClip;
    public static IronChunk itemIronChunk;
    public static SparkStarter itemSparkStarter;
    public static Starter itemStarter;

    public static void init(){
        itemBotSteel = new BotSteel();
        itemClonedBotSteel = new ClonedBotSteel();
        itemCompactor = new Compactor();
        itemCompactorChip = new CompactorChip();
        itemConsole = new Console();
        itemHoloClip = new HoloClip();
        itemIronChunk = new IronChunk();
        itemSparkStarter = new SparkStarter();
        itemStarter = new Starter();

        GameRegistry.registerItem(itemBotSteel,"BotSteel");
        GameRegistry.registerItem(itemClonedBotSteel,"ClonedBotSteel");
        GameRegistry.registerItem(itemCompactor,"Compactor");
        GameRegistry.registerItem(itemCompactorChip,"CompactorChip");
        GameRegistry.registerItem(itemConsole,"Console");
        GameRegistry.registerItem(itemHoloClip,"HoloClip");
        GameRegistry.registerItem(itemIronChunk,"IronChunk");
        GameRegistry.registerItem(itemSparkStarter,"SparkStarter");
        GameRegistry.registerItem(itemStarter,"Starter");
    }
}