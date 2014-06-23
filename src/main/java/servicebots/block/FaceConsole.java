package servicebots.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import servicebots.ServiceBots;

/**
 * Created by Imalune on 6/23/2014.
 */
public class FaceConsole extends Block {
    FaceConsole(Material material){
        super(material);
        setBlockName("FaceConsole");
        //setBlockTextureName();
        setHardness(3);
        setResistance(4);
        setHarvestLevel("pickaxe",0);
        setCreativeTab(ServiceBots.cTab);
    }
}
