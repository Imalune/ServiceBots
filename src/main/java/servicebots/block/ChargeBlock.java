package servicebots.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import servicebots.ServiceBots;

/**
 * Created by Imalune on 6/23/2014.
 */
public class ChargeBlock extends Block {
    ChargeBlock(Material material){
        super(material);
        setBlockName("ChargeBlock");
        setCreativeTab(ServiceBots.cTab);
        setHarvestLevel("pickaxe",0);
        setResistance(4);
        setHardness(3);
        //setBlockTextureName();
    }
}
