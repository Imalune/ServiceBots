package servicebots;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import servicebots.block.BotBlocks;
import sun.org.mozilla.javascript.internal.ast.Block;

/**
 * Created by Imalune on 6/22/2014.
 */
@Mod(modid = servicebots.MODID, version = "${version}")
public class ServiceBotsClass {
    public static final String MODID = "ServiceBots";

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        BotBlocks.init();
        GameRegistry.addShapedRecipe(new ItemStack(BotBlocks.blockBotSide),
                "BBB","ICI","BBB",'B', BotBlocks.itemBlockSteel,'I',BotBlocks.itemIronChunk,'C',BotBlocks.itemConsole);
        GameRegistry.addShapedRecipe(new ItemStack(BotBlocks.blockBotStation),
                "B B"," C ","   ",'B',BotBlocks.itemBlockSteel,'C',Blocks.crafting_table);
        GameRegistry.addShapedRecipe(new ItemStack(BotBlocks.itemBlockSteel),
                "DDD","DID","DDD",'D', Blocks.dirt,'I',BotBlocks.itemIronChunk);
        GameRegistry.addShapedRecipe(new ItemStack(BotBlocks.blockBotSteelGenerator),
                "BHB","SRS","BHB",'B',BotBlocks.itemBlockSteel,'H',BotBlocks.itemHoloClip,'S', Blocks.stone,'R',Items.redstone);
        GameRegistry.addShapedRecipe(new ItemStack(BotBlocks.blockChargeBlock),
                "SPS","TGT","TTT",'S',BotBlocks.itemStarter,'P',BotBlocks.itemSparkStarter,'T',Blocks.stone,'G',Blocks.glass);
        GameRegistry.addShapedRecipe(new ItemStack(BotBlocks.itemCompactor),
                "S S","CIC","TTT",'S',BotBlocks.itemStarter,'C',Blocks.cobblestone,'I',BotBlocks.itemIronChunk,'T',Blocks.stone);

    }
}
