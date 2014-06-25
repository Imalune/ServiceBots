package servicebots.items;

import net.minecraft.item.Item;
import servicebots.ServiceBots;

/**
 * Created by Imalune on 6/23/2014.
 */
public class Compactor extends Item {
    Compactor(){
        setUnlocalizedName("Compactor");
        setCreativeTab(ServiceBots.cTab);
        setTextureName("ServiceBots:compactor");
    }
}
