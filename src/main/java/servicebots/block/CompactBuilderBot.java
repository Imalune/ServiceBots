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
public class CompactBuilderBot extends Block {
    @SideOnly(Side.CLIENT)
    private IIcon builderbotface;
    @SideOnly(Side.CLIENT)
    private IIcon builderbotside;
    @SideOnly(Side.CLIENT)
    private IIcon builderbotback;

    CompactBuilderBot(Material material) {
        super(material);
        setBlockName("CompactBuilderBot");
        setCreativeTab(ServiceBots.cTab);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister register) {
        builderbotface = register.registerIcon("ServiceBots:builderbotface");
        builderbotside = register.registerIcon("ServiceBots:builderbotside");
        builderbotback = register.registerIcon("ServiceBots:builderbotback");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        if (side == 4) {
            return builderbotface;
        } else if (side == 5) {
            return builderbotback;
        } else {
            return builderbotside;
        }
    }
}
