package servicebots;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import servicebots.entities.Entity;

/**
 * Created by Imalune on 6/23/2014.
 */
public class ProxyCommon {
    public void onModPreInit(FMLPreInitializationEvent evt){
        EntityRegistry.registerGlobalEntityID(Entity.class, "Elebot", EntityRegistry.findGlobalUniqueEntityId(), 0xfffff, 0xcccccc);
    }
    public void onModInit(FMLInitializationEvent evt){
     }
}
