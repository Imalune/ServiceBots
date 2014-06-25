package servicebots.creativetab;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import servicebots.ServiceBots;
import servicebots.block.BotBlocks;

/**
 * Created by Imalune on 6/23/2014.
 */
public class CreativeTab extends CreativeTabs {
    public CreativeTab(){
        super(ServiceBots.MODID);
    }
    @Override
    @SideOnly(Side.CLIENT)
    public Item getTabIconItem(){
        return Item.getItemFromBlock(BotBlocks.blockCompactEleBot);
    }
}
