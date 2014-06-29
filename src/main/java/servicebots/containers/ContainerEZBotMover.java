package servicebots.containers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import servicebots.tileentities.TileEntityBotBox;
import servicebots.tileentities.TileEntityEZBotMover;

/**
 * Created by Imalune on 6/28/2014.
 */
public class ContainerEZBotMover extends Container {

    protected TileEntityEZBotMover tileEntity;

    public ContainerEZBotMover (InventoryPlayer inventoryPlayer, TileEntityEZBotMover entity) {
        tileEntity = entity;
        for(int y = 0; y < 3; y++){
            for (int x = 0; x < 9; x++){
                addSlotToContainer(new Slot(tileEntity, x + y * 9, 9 + x * 18, 13 + y *18));
            }
        }
        bindPlayerInventory(inventoryPlayer);
    }
    @Override
    public boolean canInteractWith(EntityPlayer player) {
        return tileEntity.isUseableByPlayer(player);
    }
    protected void bindPlayerInventory(InventoryPlayer inventoryPlayer) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                addSlotToContainer(new Slot(inventoryPlayer, j + i * 9 + 9,
                        8 + j * 18, 84 + i * 18));
            }
        }

        for (int i = 0; i < 9; i++) {
            addSlotToContainer(new Slot(inventoryPlayer, i, 8 + i * 18, 142));
        }
    }

    @Override
    public ItemStack transferStackInSlot(EntityPlayer player, int slot) {
        ItemStack stack = null;
        Slot slotObject = (Slot) inventorySlots.get(slot);

        if (slotObject != null && slotObject.getHasStack()) {
            ItemStack stackInSlot = slotObject.getStack();
            stack = stackInSlot.copy();

            if (slot >= 27) {
                if (!super.mergeItemStack(stackInSlot, 0, 27, false)) {
                    return null;
                }
            }
            else if (!this.mergeItemStack(stackInSlot, 27, 23, false)) {
                return null;
            }

            if (stackInSlot.stackSize == 0) {
                slotObject.putStack(null);
            } else {
                slotObject.onSlotChanged();
            }
            if (stackInSlot.stackSize == stack.stackSize) {
                return null;
            }
            slotObject.onPickupFromSlot(player, stackInSlot);
        }
        return stack;
    }
}