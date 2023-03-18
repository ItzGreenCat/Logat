package me.greencat.logat.item.ingot;

import me.greencat.logat.dictionary.OreDictionaryRegistry;
import me.greencat.logat.item.base.ItemBase;
import me.greencat.logat.item.loader.ItemLoader;
import me.greencat.logat.tab.CreativeTabLoader;

public class ItemCopperIngot extends ItemBase {

    private static final String name = "copper_ingot";

    public ItemCopperIngot() {
        super(name);
        setCreativeTab(CreativeTabLoader.ITEM_TAB);
    }
}
