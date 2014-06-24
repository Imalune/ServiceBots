package servicebots.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import servicebots.ServiceBots;

/**
 * Created by Imalune on 6/23/2014.
 */
public class BotSide extends Block{
    BotSide(Material material){
        super(material);
        setCreativeTab(ServiceBots.cTab);
        setBlockName("BotSide");
        setBlockTextureName("ServiceBots:botside");
        setHardness(3);
        setResistance(4);
        setHarvestLevel("pickaxe",0);
    }
}
