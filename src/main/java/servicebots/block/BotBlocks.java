package servicebots.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;
import servicebots.items.*;

/**
 * Created by Imalune on 6/22/2014.
 */
public class BotBlocks {
    public static BotSide blockBotSide;
    public static FaceConsole blockFaceConsole;

    public static void init(){
        blockFaceConsole = new FaceConsole(Material.iron);
        blockBotSide = new BotSide(Material.iron);

        GameRegistry.registerBlock(blockBotSide,"BotSide");
        GameRegistry.registerBlock(blockFaceConsole,"FaceConsole");
    }
}
