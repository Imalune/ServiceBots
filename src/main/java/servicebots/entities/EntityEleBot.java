package servicebots.entities;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.passive.IAnimals;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import servicebots.ServiceBots;

/**
 * Created by Imalune on 6/23/2014.
 */
public class EntityEleBot extends EntityCreature implements IAnimals {
    public final ResourceLocation texture = new ResourceLocation(ServiceBots.MODID, "textures/entities/elebot.png");
    public EntityEleBot(World world){
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
