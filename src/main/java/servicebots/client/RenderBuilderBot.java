package servicebots.client;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import servicebots.ServiceBots;

/**
 * Created by Imalune on 6/25/2014.
 */
@SideOnly(Side.CLIENT)
public class RenderBuilderBot extends RenderBiped {
    public final ResourceLocation texture = new ResourceLocation(ServiceBots.MODID, "textures/entities/elebot.png");
    public final ModelBiped botModel;
    public RenderBuilderBot(ModelBiped model)
    {
        super(model, 0.5f);
        botModel = model;
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return this.texture;
    }
}
