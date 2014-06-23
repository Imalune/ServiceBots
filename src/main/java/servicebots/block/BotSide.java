package servicebots.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by Imalune on 6/23/2014.
 */
public class BotSide extends Block{
    BotSide(Material material){
        super(material);
        setCreativeTab(CreativeTabs.tabTools);
        //Change later
        setBlockName("BotSide");
        //setBlockTextureName();
        setHardness(3);
        setResistance(4);
        setHarvestLevel("pickaxe",0);
    }
}
