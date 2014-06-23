package servicebots.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by Imalune on 6/23/2014.
 */
public class ChargeBlock extends Block {
    ChargeBlock(Material material){
        super(material);
        setBlockName("ChargeBlock");
        setCreativeTab(CreativeTabs.tabTools);
        setHarvestLevel("pickaxe",0);
        setResistance(4);
        setHardness(3);
        //setBlockTextureName();
    }
}
