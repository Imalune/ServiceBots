package servicebots;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import servicebots.block.BotBlocks;
import servicebots.creativetab.CreativeTab;

/**
 * Created by Imalune on 6/22/2014.
 */
@Mod(modid = ServiceBots.MODID, version = "0.0.1")
public class ServiceBots {
    public static final String MODID = "ServiceBots";
    public static final CreativeTabs cTab = new CreativeTab();
    @Mod.Instance(ServiceBots.MODID)
    public static ServiceBots instance;
    @SidedProxy(serverSide="ServiceBots.ProxyCommon",clientSide = "servicebots.client.CProxy")
    public static ProxyCommon proxy;

    @Mod.EventHandler
    public void ini(FMLPreInitializationEvent nevent)
    {
            proxy.onModPreInit(nevent);
        }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        BotBlocks.init();
        GameRegistry.addShapedRecipe(new ItemStack(BotBlocks.blockBotSide),
                "BBB","ICI","BBB",'B', BotBlocks.itemBotSteel,'I',BotBlocks.itemIronChunk,'C',BotBlocks.itemConsole);
        //GameRegistry.addShapedRecipe(new ItemStack(BotBlocks.blockBotStation),
        //       "B B"," C ","   ",'B',BotBlocks.itemBotSteel,'C',Blocks.crafting_table);
        GameRegistry.addShapedRecipe(new ItemStack(BotBlocks.itemBotSteel),
                "DDD","DID","DDD",'D', Blocks.dirt,'I',BotBlocks.itemIronChunk);
       // GameRegistry.addShapedRecipe(new ItemStack(BotBlocks.blockBotSteelGenerator),
         //       "BHB","SRS","BHB",'B',BotBlocks.itemBotSteel,'H',BotBlocks.itemHoloClip,'S', Blocks.stone,'R',Items.redstone);
        //GameRegistry.addShapedRecipe(new ItemStack(BotBlocks.blockChargeBlock),
         //       "SPS","TGT","TTT",'S',BotBlocks.itemStarter,'P',BotBlocks.itemSparkStarter,'T',Blocks.stone,'G',Blocks.glass);
        //GameRegistry.addShapedRecipe(new ItemStack(BotBlocks.itemCompactor),
           //     "S S","CIC","TTT",'S',BotBlocks.itemStarter,'C',Blocks.cobblestone,'I',BotBlocks.itemIronChunk,'T',Blocks.stone);
        GameRegistry.addShapedRecipe(new ItemStack(BotBlocks.itemCompactorChip),
                "B B"," H ","B B",'B',BotBlocks.itemBotSteel,'H',BotBlocks.itemHoloClip);
        GameRegistry.addShapedRecipe(new ItemStack(BotBlocks.itemConsole),
                "GGG","GHG","GGG",'G',Blocks.glass,'H',BotBlocks.itemHoloClip);
        //GameRegistry.addShapedRecipe(new ItemStack(BotBlocks.blockEZBotMover),
         //       "HHH"," C ","HHH",'H',BotBlocks.itemHoloClip,'C',BotBlocks.itemCompactorChip);
        GameRegistry.addShapedRecipe(new ItemStack(BotBlocks.blockFaceConsole),
                "BBB","BHB","BBB",'B',BotBlocks.itemBotSteel,'H',BotBlocks.itemHoloClip);
        GameRegistry.addShapelessRecipe(new ItemStack(BotBlocks.itemHoloClip),new ItemStack(Blocks.glass,2),new ItemStack(Blocks.stone,3));
        GameRegistry.addShapelessRecipe(new ItemStack(BotBlocks.itemIronChunk,6),Items.iron_ingot);
        GameRegistry.addShapedRecipe(new ItemStack(BotBlocks.itemSparkStarter),
                "S S","DID","TTT",'S',BotBlocks.itemStarter,'D',Blocks.dirt,'I',BotBlocks.itemIronChunk,'T',Blocks.stone);
        GameRegistry.addShapedRecipe(new ItemStack(BotBlocks.itemStarter),
                "I I","BBB","SSS",'I',BotBlocks.itemIronChunk,'B',BotBlocks.itemBotSteel,'S',Blocks.stone);
    }
}
