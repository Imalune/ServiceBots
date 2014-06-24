package servicebots.block;

import net.minecraft.item.Item;
import servicebots.ServiceBots;

/**
 * Created by Imalune on 6/23/2014.
 */
public class Starter extends Item {
    Starter(){
        setUnlocalizedName("Starter");
        setCreativeTab(ServiceBots.cTab);
        setTextureName("ServiceBots:Starter");
    }
}
