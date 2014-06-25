package servicebots.tileentities;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;

/**
 * Created by Imalune on 6/24/2014.
 */
public class TileEntityBotBox extends TileEntity implements IInventory{
    private final ItemStack[] items;
    public TileEntityBotBox(){
        items = new ItemStack[54];
    }

    @Override
    public int getSizeInventory() {
        return items.length;
    }

    @Override
    public ItemStack getStackInSlot(int var1) {
        return items[var1];
    }

    @Override
    public ItemStack decrStackSize(int var1, int var2) {
        ItemStack itemStack = getStackInSlot(var1);
        if (itemStack != null){
          if (itemStack.stackSize <= var2){
                setInventorySlotContents(var1,null);
            }
            else {
                itemStack = itemStack.splitStack(var2);
            }
        }
        return itemStack;
    }

    @Override
    public ItemStack getStackInSlotOnClosing(int var1) {
        ItemStack itemStack = getStackInSlot(var1);
        setInventorySlotContents(var1,null);
        return itemStack;
    }

    @Override
    public void setInventorySlotContents(int var1, ItemStack var2) {
        items[var1]=var2;
        if (var2 != null && var2.stackSize > getInventoryStackLimit()){
            var2.stackSize=getInventoryStackLimit();
        }
    }

    @Override
    public String getInventoryName() {
        return "Container.BotBox";
    }

    @Override
    public boolean hasCustomInventoryName() {
        return true;
    }

    @Override
    public int getInventoryStackLimit() {
        return 64;
    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer var1) {
        return var1.getDistanceSq(xCoord,yCoord,zCoord)<=64;
    }

    @Override
    public void openInventory() {

    }

    @Override
    public void closeInventory() {

    }

    @Override
    public boolean isItemValidForSlot(int var1, ItemStack var2) {
        return true;
    }
    @Override
    public void writeToNBT(NBTTagCompound compound){
        super.writeToNBT(compound);
        NBTTagList items = new NBTTagList();
        for (int i=0;i<getSizeInventory();i++){
            ItemStack stack = getStackInSlot(i);
            if(stack!=null){
                NBTTagCompound item = new NBTTagCompound();
                item.setByte("slot",(byte)i);
                stack.writeToNBT(item);
                items.appendTag(item);
            }
        }
        compound.setTag("items",items);
    }
    @Override
    public void readFromNBT(NBTTagCompound compound){
        super.readFromNBT(compound);
        NBTTagList items = compound.getTagList("items",10);
        for (int i = 0;i<items.tagCount();i++){
            NBTTagCompound item = items.getCompoundTagAt(i);
            int slot = item.getByte("slot");
            if(slot>=0 && slot<getSizeInventory()){
                setInventorySlotContents(slot,ItemStack.loadItemStackFromNBT(item));
            }
        }
    }
}
