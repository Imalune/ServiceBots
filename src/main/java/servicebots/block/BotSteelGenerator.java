package servicebots.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import servicebots.ServiceBots;

/**
 * Created by Imalune on 6/23/2014.
 */
public class BotSteelGenerator extends Block {
    BotSteelGenerator(Material material){
        super(material);
        setBlockName("BotSteelGenerator");
        setResistance(4);
        setHardness(3);
        setHarvestLevel("pickaxe",0);
        setCreativeTab(ServiceBots.cTab);
        //setBlockTextureName();
    }
}
