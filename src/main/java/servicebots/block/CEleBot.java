package servicebots.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by Imalune on 6/23/2014.
 */
public class CEleBot extends Block {
    CEleBot(Material material){
        super(material);
        setBlockName("CompactEleBot");
        setCreativeTab(CreativeTabs.tabTools);
        setHarvestLevel("pickaxe",0);
        setHardness(3);
        setResistance(4);
        //setBlockTextureName();
    }
}
