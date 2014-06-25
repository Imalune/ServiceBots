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
        if (side == MathHelper.floor_float(meta / 2) + 1 || (meta == 0 && side == 3)) {
            return (meta % 2 == 0) ? botgenface : botgenface;
        } else {
            return bbotside;
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
