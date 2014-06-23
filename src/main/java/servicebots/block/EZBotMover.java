package servicebots.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by Imalune on 6/23/2014.
 */
public class EZBotMover extends Block {
    EZBotMover(Material material){
        super(material);
        //setBlockTextureName();
        setCreativeTab(CreativeTabs.tabTools);
        setBlockName("EZBotMover");
        setHardness(3);
        setResistance(4);
        setHarvestLevel("pickaxe",0);
    }
}
