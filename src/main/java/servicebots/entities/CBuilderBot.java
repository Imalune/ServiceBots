package servicebots.entities;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import servicebots.ServiceBots;

/**
 * Created by Imalune on 6/23/2014.
 */
public class CBuilderBot extends Block {
    CBuilderBot(Material material){
        super(material);
        setResistance(4);
        setHardness(3);
        setHarvestLevel("pickaxe",0);
        setCreativeTab(ServiceBots.cTab);
        setBlockName("CompactBuilderBot");
        //setBlockTextureName;
    }
}
