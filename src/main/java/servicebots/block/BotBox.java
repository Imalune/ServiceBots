package servicebots.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import servicebots.ServiceBots;

/**
 * Created by Imalune on 6/23/2014.
 */
public class BotBox extends Block{
    BotBox(Material material){
    super(material);
    setCreativeTab(ServiceBots.cTab);
    setBlockName("BotBox");
    //setBlockTextureName("ServiceBots:botbox");
    setHardness(3);
    setResistance(4);
    setHarvestLevel("pickaxe",0);
}
}
