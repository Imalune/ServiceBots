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
import servicebots.items.BotItems;
import servicebots.creativetab.CreativeTab;

/**
 * Created by Imalune on 6/22/2014.
 */
@Mod(modid = ServiceBots.MODID, version = "0.0.1")
public class ServiceBots {
    public static final String MODID = "servicebots";
    public static final CreativeTabs cTab = new CreativeTab();
    @Mod.Instance(ServiceBots.MODID)
    public static ServiceBots instance;
    @SidedProxy(serverSide="servicebots.ProxyCommon",clientSide = "servicebots.client.ProxyClient")
    public static ProxyCommon proxy;

    @Mod.EventHandler
    public void ini(FMLPreInitializationEvent nevent)
    {
            proxy.onModPreInit(nevent);
        }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        BotBlocks.init();
        BotItems.init();
        registerCraftingRecipes();
    }
    private void registerCraftingRecipes(){
        GameRegistry.addShapedRecipe(new ItemStack(BotBlocks.blockBotSide),
                "BBB", "ICI", "BBB", 'B', BotItems.itemBotSteel, 'I', BotItems.itemIronChunk, 'C', BotItems.itemConsole);
        GameRegistry.addShapedRecipe(new ItemStack(BotBlocks.blockBotStation),
               "B B"," C ","   ",'B',BotItems.itemBotSteel,'C',Blocks.crafting_table);
        GameRegistry.addShapedRecipe(new ItemStack(BotItems.itemBotSteel),
                "DDD","DID","DDD",'D', Blocks.dirt,'I',BotItems.itemIronChunk);
        GameRegistry.addShapedRecipe(new ItemStack(BotBlocks.blockBotSteelGenerator),
               "BHB","SRS","BHB",'B',BotItems.itemBotSteel,'H',BotItems.itemHoloClip,'S', Blocks.stone,'R',Items.redstone);
        GameRegistry.addShapedRecipe(new ItemStack(BotBlocks.blockChargeBlock),
                "SPS","TGT","TTT",'S',BotItems.itemStarter,'P',BotItems.itemSparkStarter,'T',Blocks.stone,'G',Blocks.glass);
        GameRegistry.addShapedRecipe(new ItemStack(BotBlocks.blockCompactBuilderBot),
                "BHB","HFH","BHB",'B',BotItems.itemBotSteel,'H',BotItems.itemHoloClip,'F',BotBlocks.blockFaceConsole);
        GameRegistry.addShapedRecipe(new ItemStack(BotBlocks.blockCompactEleBot),
                "BBB","BFB","BBB",'B',BotItems.itemBotSteel,'F',BotBlocks.blockFaceConsole);
        GameRegistry.addShapedRecipe(new ItemStack(BotBlocks.blockEZBotMover),
                "HHH"," C ","HHH",'H',BotItems.itemHoloClip,'C',BotItems.itemCompactorChip);
        GameRegistry.addShapedRecipe(new ItemStack(BotBlocks.blockFaceConsole),
                "BBB","BHB","BBB",'B',BotItems.itemBotSteel,'H',BotItems.itemHoloClip);
        GameRegistry.addShapedRecipe(new ItemStack(BotItems.itemCompactorChip),
                "B B", " H ", "B B", 'B', BotItems.itemBotSteel, 'H', BotItems.itemHoloClip);
        GameRegistry.addShapedRecipe(new ItemStack(BotItems.itemCompactor),
                "S S","CIC","TTT",'S',BotItems.itemStarter,'C',Blocks.cobblestone,'I',BotItems.itemIronChunk,'T',Blocks.stone);
        GameRegistry.addShapedRecipe(new ItemStack(BotItems.itemConsole),
                "GGG", "GHG", "GGG", 'G', Blocks.glass, 'H', BotItems.itemHoloClip);
        GameRegistry.addShapelessRecipe(new ItemStack(BotItems.itemHoloClip),new ItemStack(Blocks.glass,2),new ItemStack(Blocks.stone,3));
        GameRegistry.addShapelessRecipe(new ItemStack(BotItems.itemIronChunk,6),Blocks.iron_ore);
        GameRegistry.addShapedRecipe(new ItemStack(BotItems.itemSparkStarter),
                "S S","DID","TTT",'S',BotItems.itemStarter,'D',Blocks.dirt,'I',BotItems.itemIronChunk,'T',Blocks.stone);
        GameRegistry.addShapedRecipe(new ItemStack(BotItems.itemStarter),
                "I I","BBB","SSS",'I',BotItems.itemIronChunk,'B',BotItems.itemBotSteel,'S',Blocks.stone);
    }

}
