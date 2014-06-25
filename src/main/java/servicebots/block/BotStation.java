package servicebots.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import servicebots.ServiceBots;

/**
 * Created by Imalune on 6/22/2014.
 */
public class BotStation extends Block {
    @SideOnly(Side.CLIENT)
    private IIcon botstationface;
    @SideOnly(Side.CLIENT)
    private IIcon botstationside;
    @SideOnly(Side.CLIENT)
    private IIcon botstationtop;

    BotStation(Material material) {
        super(material);
        setBlockName("BotStation");
        setHardness(3);
        setResistance(4);
        setHarvestLevel("pickaxe", 0);
        setCreativeTab(ServiceBots.cTab);
    }
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister register) {
        this.botstationside = register.registerIcon("ServiceBots:botstationside");
        this.botstationtop = register.registerIcon("ServiceBots:botstationtop");
        this.botstationface = register.registerIcon("ServiceBots:botstationface");
    }
    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        if (side == 1) {
            return botstationtop;
        }
        else if (side == MathHelper.floor_float(meta / 2) + 1 || (meta == 0 && side == 3)) {
            return (meta % 2 == 0) ? botstationface:botstationface;
        } else {
            return botstationside;
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
    public boolean onBlockActivated(World world, int var1, int var2, int var3, EntityPlayer player, int var4, float float1, float float2, float float3) {
        if (world.isRemote) {
            return true;
        } else {
            player.displayGUIWorkbench(var1, var2, var3);
            return true;
        }
    }
}