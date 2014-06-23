package servicebots;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;

/**
 * Created by Imalune on 6/22/2014.
 */
@Mod(modid = servicebots.MODID, version = "${version}")
public class ServiceBotsClass {
    public static final String MODID = "ServiceBots";

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        BotBlocks.init()
    }
}
