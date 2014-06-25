package servicebots.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import servicebots.ServiceBots;

/**
 * Created by Imalune on 6/23/2014.
 */
public class BotSteelGenerator extends Block {
    @SideOnly(Side.CLIENT)
    private IIcon botgenface;
    @SideOnly(Side.CLIENT)
    private IIcon bbotside;

    BotSteelGenerator(Material material) {
        super(material);
        setBlockName("BotSteelGenerator");
        setResistance(4);
        setHardness(3);
        setHarvestLevel("pickaxe", 0);
        setCreativeTab(ServiceBots.cTab);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister register) {
        botgenface = register.registerIcon("ServiceBots:botsteelgen");
        bbotside = register.registerIcon("ServiceBots:bbotside");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        if (side == 4) {
            return botgenface;
        } else {
            return bbotside;
        }
    }
}
