package servicebots.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by Imalune on 6/23/2014.
 */
public class CBuilderBot extends Block {
    CBuilderBot(Material material){
        super(material);
        setResistance(4);
        setHardness(3);
        setHarvestLevel("pickaxe",0);
        setCreativeTab(CreativeTabs.tabTools);
        setBlockName("CompactBuilderBot");
        //setBlockTextureName;
    }
}
