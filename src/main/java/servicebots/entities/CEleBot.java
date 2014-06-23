package servicebots.entities;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import servicebots.ServiceBots;

/**
 * Created by Imalune on 6/23/2014.
 */
public class CEleBot extends Block {
    CEleBot(Material material){
        super(material);
        setBlockName("CompactEleBot");
        setCreativeTab(ServiceBots.cTab);
        setHarvestLevel("pickaxe",0);
        setHardness(3);
        setResistance(4);
        //setBlockTextureName();
    }
}
