package me.greencat.logat.item;

import me.greencat.logat.tab.CreativeTabLoader;

public class CopperIngot extends ItemBase {

    private static final String name = "copper_ingot";

    public CopperIngot() {
        super(name);
        setCreativeTab(CreativeTabLoader.ITEM_TAB);
    }
}
