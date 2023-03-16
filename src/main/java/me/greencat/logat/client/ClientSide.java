package me.greencat.logat.client;

import me.greencat.logat.CommonSide;
import me.greencat.logat.model.ModelRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientSide extends CommonSide {
    @Override
    public void preInit(FMLPreInitializationEvent event) {
        new ModelRegistry();
        super.preInit(event);
    }
    @Override
    public void Init(FMLInitializationEvent event) {
        super.Init(event);
    }
    @Override
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
    }
}
