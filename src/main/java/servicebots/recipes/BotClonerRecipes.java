package servicebots.recipes;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import servicebots.items.BotItems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Imalune on 6/28/2014.
 */
/*public class BotClonerRecipes {
    private static final BotClonerRecipes smeltingBase = new BotClonerRecipes();
    /**
     * The list of smelting results.
     */
   /* private Map smeltingList = new HashMap();
    private Map experienceList = new HashMap();

    /**
     * Used to call methods addSmelting and getSmeltingResult.
     */
  /* public static BotClonerRecipes smelting() {
        return smeltingBase;
    }

    private BotClonerRecipes() {
        this.func_151396_a(BotItems.itemBotSteel, new ItemStack(BotItems.itemClonedBotSteel, 1, 2), 0.1F);
    }

    public void func_151393_a(Block block, ItemStack stack, float float1) {
        this.func_151396_a(Item.getItemFromBlock(block), stack, float1);
    }

    public void func_151396_a(Item item, ItemStack stack, float float1) {
        this.func_151394_a(new ItemStack(item, 1, 32767), stack, float1);
    }

    public void func_151394_a(ItemStack stack, ItemStack stack2, float float1) {
        this.smeltingList.put(stack, stack2);
        this.experienceList.put(stack2, Float.valueOf(float1));
    }

    /**
     * Returns the smelting result of an item.
     */
   /* public ItemStack getSmeltingResult(ItemStack stack) {
        Iterator iterator = this.smeltingList.entrySet().iterator();
        Map.Entry entry;

        do {
            if (!iterator.hasNext()) {
                return null;
            }

            entry = (Map.Entry) iterator.next();
        }
        while (!this.func_151397_a(stack, (ItemStack) entry.getKey()));

        return (ItemStack) entry.getValue();
    }

    private boolean func_151397_a(ItemStack stack, ItemStack stack2) {
        return stack2.getItem() == stack.getItem() && (stack2.getItemDamage() == 32767 || stack2.getItemDamage() == stack.getItemDamage());
    }

    public Map getSmeltingList() {
        return this.smeltingList;
    }

    public float func_151398_b(ItemStack stack) {
        float ret = stack.getItem().getSmeltingExperience(stack);
        if (ret != -1) return ret;

        Iterator iterator = this.experienceList.entrySet().iterator();
        Map.Entry entry;

        do {
            if (!iterator.hasNext()) {
                return 0.0F;
            }

            entry = (Map.Entry) iterator.next();
        }
        while (!this.func_151397_a(stack, (ItemStack) entry.getKey()));

        return ((Float) entry.getValue()).floatValue();
    }
} */
