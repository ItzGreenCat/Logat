package me.greencat.logat;

import me.greencat.logat.block.loader.BlockLoader;
import me.greencat.logat.dictionary.OreDictionaryLoader;
import me.greencat.logat.furnace.FurnaceRecipeRegistry;
import me.greencat.logat.item.loader.ItemLoader;
import me.greencat.logat.tileentity.loader.TileEntityLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonSide {
    public void preInit(FMLPreInitializationEvent event) {
        new ItemLoader();
        new BlockLoader();
        new TileEntityLoader();
        OreDictionaryLoader.push();
        FurnaceRecipeRegistry.push();
    }

    public void Init(FMLInitializationEvent event) {

    }

    public void postInit(FMLPostInitializationEvent event) {

    }
}
