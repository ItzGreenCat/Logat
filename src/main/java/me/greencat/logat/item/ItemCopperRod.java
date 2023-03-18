package me.greencat.logat.item;

import me.greencat.logat.item.base.ItemBase;
import me.greencat.logat.tab.CreativeTabLoader;

public class ItemCopperRod extends ItemBase {
    public ItemCopperRod() {
        super("copper_rod");
        this.setCreativeTab(CreativeTabLoader.ITEM_TAB);
    }
}
