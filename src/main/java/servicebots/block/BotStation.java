package servicebots.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by Imalune on 6/22/2014.
 */
public class BotStation extends Block{
    BotStation(Material material) {
        super(material);
        setCreativeTab(CreativeTabs.tabTools);
        //Needs to be changed
        setBlockName("BotStation");
        //setBlocktextureName();
        //Needs Texture
        setHardness(3);
        setResistance(4);
        setHarvestLevel("pickaxe",0);
    }
}
