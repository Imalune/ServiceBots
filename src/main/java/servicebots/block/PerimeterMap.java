package servicebots.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import servicebots.ServiceBots;

/**
 * Created by Imalune on 6/23/2014.
 */
public class PerimeterMap extends Block {
    PerimeterMap(Material material){
        super(material);
        setCreativeTab(ServiceBots.cTab);
        setBlockName("PerimeterMap");
        setBlockTextureName("ServiceBots:perimeter");
    }
}
