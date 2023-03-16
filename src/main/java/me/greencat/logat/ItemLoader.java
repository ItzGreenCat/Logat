package me.greencat.logat;

import me.greencat.logat.item.CopperIngot;

public class ItemLoader extends ItemRegistry{

    public static final CopperIngot COPPER_INGOT = registerItemAndModel(new CopperIngot());

    public ItemLoader() {
        super();
    }
}
