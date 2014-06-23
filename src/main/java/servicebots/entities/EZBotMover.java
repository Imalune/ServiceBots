package servicebots.entities;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import servicebots.ServiceBots;

/**
 * Created by Imalune on 6/23/2014.
 */
public class EZBotMover extends Block {
    EZBotMover(Material material){
        super(material);
        //setBlockTextureName();
        setCreativeTab(ServiceBots.cTab);
        setBlockName("EZBotMover");
        setHardness(3);
        setResistance(4);
        setHarvestLevel("pickaxe",0);
    }
}
