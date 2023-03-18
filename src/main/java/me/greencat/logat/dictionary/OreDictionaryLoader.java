package me.greencat.logat.dictionary;

import me.greencat.logat.block.loader.BlockLoader;
import me.greencat.logat.item.loader.ItemLoader;

public class OreDictionaryLoader {
    public static void push() {
        //Metal Ore
        OreDictionaryRegistry.addToDictionary(BlockLoader.COPPER_ORE,"oreCopper");
        //Metal Block
        OreDictionaryRegistry.addToDictionary(BlockLoader.COPPER_BLOCK,"blockCopper");
        //Metal Ingot
        OreDictionaryRegistry.addToDictionary(ItemLoader.COPPER_INGOT,"ingotCopper");

    }
}
