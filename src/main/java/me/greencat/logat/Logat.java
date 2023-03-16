package me.greencat.logat;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.util.logging.Logger;

@Mod(
        modid = Logat.MOD_ID,
        name = Logat.MOD_NAME,
        version = Logat.VERSION
)
public class Logat {

    public static final String MOD_ID = "logat";
    public static final String MOD_NAME = "Logat";
    public static final String VERSION = "1.0-SNAPSHOT";

    public static final Logger logger = Logger.getLogger("Logat-Log");

    @Mod.Instance(MOD_ID)
    public static Logat INSTANCE;

    @SidedProxy(serverSide = "me.greencat.logat.CommonSide",clientSide = "me.greencat.logat.client.ClientSide")
    private static CommonSide PROXY;


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        PROXY.preInit(event);
    }


    @Mod.EventHandler
    public void Init(FMLInitializationEvent event) {
        PROXY.Init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        PROXY.postInit(event);
    }
}
