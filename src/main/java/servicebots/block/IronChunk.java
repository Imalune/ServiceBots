package servicebots.block;

import net.minecraft.item.Item;
import servicebots.ServiceBots;

/**
 * Created by Imalune on 6/22/2014.
 */
public class IronChunk extends Item {
    IronChunk() {
        setUnlocalizedName("IronChunk");
        setTextureName("ServiceBots:ironchunk");
        setCreativeTab(ServiceBots.cTab);
    }
}
