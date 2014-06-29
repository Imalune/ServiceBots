package servicebots.items;

import net.minecraft.item.Item;
import servicebots.ServiceBots;

/**
 * Created by Imalune on 6/28/2014.
 */
public class ClonedBotSteel extends Item {
    ClonedBotSteel(){
        setCreativeTab(ServiceBots.cTab);
        setUnlocalizedName("ClonedBotSteel");
        setTextureName("ServiceBots:cbotsteel");
    }
}