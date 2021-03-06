package servicebots.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import servicebots.ServiceBots;

/**
 * Created by Imalune on 6/24/2014.
 */
public class CompactEleBot extends Block {
    @SideOnly(Side.CLIENT)
    private IIcon elebotface;
    @SideOnly(Side.CLIENT)
    private IIcon bbotside;
    @SideOnly(Side.CLIENT)
    private IIcon botback;

    CompactEleBot(Material material) {
        super(material);
        setBlockName("CompactEleBot");
        setCreativeTab(ServiceBots.cTab);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister register) {
        elebotface = register.registerIcon("ServiceBots:elebotface");
        bbotside = register.registerIcon("ServiceBots:bbotside");
        botback = register.registerIcon("ServiceBots:botback");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        if (side == 4) {
            return elebotface;
        } else if (side == 5) {
            return botback;
        } else {
            return bbotside;
        }
    }
}
