package servicebots.containers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import servicebots.recipes.BotClonerRecipes;

/**
 * Created by Imalune on 6/29/2014.
 */
/*public class BotClonerSlot extends Slot
{
    private EntityPlayer thePlayer;
    private int var1;

    public BotClonerSlot(EntityPlayer player, IInventory inventory, int par3, int par4, int par5)
    {
        super(inventory, par3, par4, par5);
        this.thePlayer = player;
    }

    public boolean isItemValid(ItemStack stack)
    {
        return false;
    }

    public ItemStack decrStackSize(int par1)
    {
        if (this.getHasStack())
        {
            this.var1 += Math.min(par1, this.getStack().stackSize);
        }

        return super.decrStackSize(par1);
    }

    public void onPickupFromSlot(EntityPlayer player, ItemStack stack)
    {
        this.onCrafting(stack);
        super.onPickupFromSlot(player, stack);
    }

    protected void onCrafting(ItemStack stack, int par2)
    {
        this.var1 += par2;
        this.onCrafting(stack);
    }

   protected void onCrafting(ItemStack stack) {
        stack.onCrafting(this.thePlayer.worldObj, this.thePlayer, this.var1);

        if (!this.thePlayer.worldObj.isRemote) {
            int var2 = this.var1;
            float var3 = BotClonerRecipes.smelting().getExperience(stack);
            int var4;
        }
    }
}*/