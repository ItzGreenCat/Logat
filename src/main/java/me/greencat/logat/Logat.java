package me.greencat.logat;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(
        modid = Logat.MOD_ID,
        name = Logat.MOD_NAME,
        version = Logat.VERSION
)
public class Logat {

    public static final String MOD_ID = "logat";
    public static final String MOD_NAME = "Logat";
    public static final String VERSION = "1.0-SNAPSHOT";

    @Mod.Instance(MOD_ID)
    public static Logat INSTANCE;


    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {

    }


    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event) {

    }
}
