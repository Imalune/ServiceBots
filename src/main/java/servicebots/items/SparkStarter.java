package servicebots.items;

import net.minecraft.item.Item;
import servicebots.ServiceBots;

/**
 * Created by Imalune on 6/23/2014.
 */
public class SparkStarter extends Item {
    public SparkStarter(){
        setCreativeTab(ServiceBots.cTab);
        setUnlocalizedName("SparkStarter");
        setTextureName("ServiceBots:sparkstarter");
    }
}
