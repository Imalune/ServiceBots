package servicebots.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
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
        if (side == 1) {
            return builderbotside;
        }
        else if (side == MathHelper.floor_float(meta / 2) + 1 || (meta == 0 && side == 3)) {
            return (meta % 2 == 0) ? builderbotface : builderbotface;
        } else {
            return builderbotside;
        }
    }

    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase player, ItemStack item) {
        int l = MathHelper.floor_double((double) (player.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

        if (l == 0) {
            world.setBlockMetadataWithNotify(x, y, z, 2, 2);
        }

        if (l == 1) {
            world.setBlockMetadataWithNotify(x, y, z, 8, 2);
        }

        if (l == 2) {
            world.setBlockMetadataWithNotify(x, y, z, 4, 2);
        }

        if (l == 3) {
            world.setBlockMetadataWithNotify(x, y, z, 6, 2);
        }
    }
}
