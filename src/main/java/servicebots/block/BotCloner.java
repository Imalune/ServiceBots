package servicebots.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import servicebots.ServiceBots;
import servicebots.tileentities.TileEntityBotCloner;

import java.util.Random;

/**
 * Created by Imalune on 6/23/2014.
 */
/*public class BotCloner extends BlockContainer {
    private final Random random = new Random();
    private final boolean bool;
    private static boolean bools;
    @SideOnly(Side.CLIENT)
    private IIcon bbotside;
    @SideOnly(Side.CLIENT)
    private IIcon clonerface;

    protected BotCloner(boolean boole)
    {
        super(Material.rock);
        this.bool = boole;
    }

    public Item getItemDropped(int var1, Random rando, int var2)
    {
        return Item.getItemFromBlock(BotBlocks.blockBotCloner);
    }

    public void onBlockAdded(World world, int var1, int var2, int var3)
    {
        super.onBlockAdded(world, var1, var2, var3);
        this.func_149930_e(world, var1, var2, var3);
    }

    private void func_149930_e(World world, int var1, int var2, int var3)
    {
        if (!world.isRemote)
        {
            Block block = world.getBlock(var1, var2, var3 - 1);
            Block block1 = world.getBlock(var1, var2, var3 + 1);
            Block block2 = world.getBlock(var1 - 1, var2, var3);
            Block block3 = world.getBlock(var1 + 1, var2, var3);
            byte b0 = 3;

            if (block.func_149730_j() && !block1.func_149730_j())
            {
                b0 = 3;
            }

            if (block1.func_149730_j() && !block.func_149730_j())
            {
                b0 = 2;
            }

            if (block2.func_149730_j() && !block3.func_149730_j())
            {
                b0 = 5;
            }

            if (block3.func_149730_j() && !block2.func_149730_j())
            {
                b0 = 4;
            }

            world.setBlockMetadataWithNotify(var1, var2, var3, b0, 2);
        }
    }
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int var1, int var2)
    {
        return var1 == 1 ? this.bbotside : (var1 == 0 ? this.bbotside : (var1 != var2 ? this.blockIcon : this.clonerface));
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister register)
    {
        this.blockIcon = register.registerIcon("ServiceBots:bbotside");
        this.clonerface = register.registerIcon("ServiceBots:botsteelgenface");
        this.bbotside = register.registerIcon("ServiceBots:bbotside");
    }
  /*  @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int metadata, float what, float these, float are) {
        {
            TileEntity tileEntity = world.getTileEntity(x, y, z);
            if (tileEntity == null || player.isSneaking()) {
                return false;
            } else {
                player.openGui(ServiceBots.instance, ServiceBots.GUIID.BotCloner.ordinal(), world, x, y, z);
                return true;
            }
        }
    }
    /**
     * Update which block the furnace is using depending on whether or not it is burning
     */
  /*  public static void updateFurnaceBlockState(boolean boo, World world, int var1, int var2, int var3)
    {
        int l = world.getBlockMetadata(var1, var2, var3);
        TileEntity tileentity = world.getTileEntity(var1, var2, var3);
        bools = true;

        if (boo)
        {
            world.setBlock(var1, var2, var3, BotBlocks.blockBotCloner);
        }
        else
        {
            world.setBlock(var1, var2, var3, BotBlocks.blockBotCloner);
        }

        bools = false;
        world.setBlockMetadataWithNotify(var1, var2, var3, l, 2);

        if (tileentity != null)
        {
            tileentity.validate();
            world.setTileEntity(var1, var2, var3, tileentity);
        }
    }
    public TileEntity createNewTileEntity(World world, int var1)
    {
        return new TileEntityBotCloner();
    }
    public void onBlockPlacedBy(World world, int var1, int var2, int var3, EntityLivingBase entity, ItemStack stack)
    {
        int l = MathHelper.floor_double((double)(entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

        if (l == 0)
        {
            world.setBlockMetadataWithNotify(var1, var2, var3, 2, 2);
        }

        if (l == 1)
        {
            world.setBlockMetadataWithNotify(var1, var2, var3, 5, 2);
        }

        if (l == 2)
        {
            world.setBlockMetadataWithNotify(var1, var2, var3, 3, 2);
        }

        if (l == 3)
        {
            world.setBlockMetadataWithNotify(var1, var2, var3, 4, 2);
        }

        if (stack.hasDisplayName())
        {
            ((TileEntityBotCloner)world.getTileEntity(var1, var2, var3)).func_145951_a(stack.getDisplayName());
        }
    }

    public void breakBlock(World world, int var1, int var2, int var3, Block bloc, int var4)
    {
        if (!bools)
        {
            TileEntityBotCloner tileentitybotcloner = (TileEntityBotCloner)world.getTileEntity(var1, var2, var3);

            if (tileentitybotcloner != null)
            {
                for (int i1 = 0; i1 < tileentitybotcloner.getSizeInventory(); ++i1)
                {
                    ItemStack itemstack = tileentitybotcloner.getStackInSlot(i1);

                    if (itemstack != null)
                    {
                        float f = this.random.nextFloat() * 0.8F + 0.1F;
                        float f1 = this.random.nextFloat() * 0.8F + 0.1F;
                        float f2 = this.random.nextFloat() * 0.8F + 0.1F;

                        while (itemstack.stackSize > 0)
                        {
                            int j1 = this.random.nextInt(21) + 10;

                            if (j1 > itemstack.stackSize)
                            {
                                j1 = itemstack.stackSize;
                            }

                            itemstack.stackSize -= j1;
                            EntityItem entityitem = new EntityItem(world, (double)((float)var1 + f), (double)((float)var2 + f1), (double)((float)var3 + f2), new ItemStack(itemstack.getItem(), j1, itemstack.getItemDamage()));

                            if (itemstack.hasTagCompound())
                            {
                                entityitem.getEntityItem().setTagCompound((NBTTagCompound)itemstack.getTagCompound().copy());
                            }

                            float f3 = 0.05F;
                            entityitem.motionX = (double)((float)this.random.nextGaussian() * f3);
                            entityitem.motionY = (double)((float)this.random.nextGaussian() * f3 + 0.2F);
                            entityitem.motionZ = (double)((float)this.random.nextGaussian() * f3);
                            world.spawnEntityInWorld(entityitem);
                        }
                    }
                }

                world.func_147453_f(var1, var2, var3, bloc);
            }
        }

        super.breakBlock(world, var1, var2, var3, bloc, var4);
    }
    @SideOnly(Side.CLIENT)
    public Item getItem(World world, int var1, int var2, int var3)
    {
        return Item.getItemFromBlock(BotBlocks.blockBotCloner);
    }
}*/
