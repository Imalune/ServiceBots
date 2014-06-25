package servicebots.entities;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.passive.IAnimals;
import net.minecraft.world.World;

/**
 * Created by Imalune on 6/23/2014.
 */
public class EntityBuilderBot extends EntityCreature implements IAnimals {
    public EntityBuilderBot(World world){
        super(world);
        //initial variables
        setHealth(100);
    }
    @Override
    public void entityInit(){
        //datawatcher creation
        super.entityInit();
    }
    @Override
    public void onLivingUpdate(){
        //doing every tick
        if(worldObj.isRemote){
            //client logic
        }
        else{
            //server logic
        }
        super.onLivingUpdate();
    }
}