package servicebots.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import servicebots.ServiceBots;

/**
 * Created by Imalune on 6/22/2014.
 */
public class BotStation extends Block{
    BotStation(Material material) {
        super(material);
        setCreativeTab(ServiceBots.cTab);
        setBlockName("BotStation");
        //setBlocktextureName();
        //Needs Texture
        setHardness(3);
        setResistance(4);
        setHarvestLevel("pickaxe",0);
    }
}
