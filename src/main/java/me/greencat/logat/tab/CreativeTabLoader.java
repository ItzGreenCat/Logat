package me.greencat.logat.tab;

import me.greencat.logat.block.loader.BlockLoader;
import me.greencat.logat.item.loader.ItemLoader;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CreativeTabLoader {
    public static final CreativeTabs ITEM_TAB = new CreativeTabs("logat_item") {
        @SideOnly(Side.CLIENT)
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ItemLoader.COPPER_INGOT);
        }
    };
    public static final CreativeTabs BLOCK_TAB = new CreativeTabs("logat_block") {
        @SideOnly(Side.CLIENT)
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(BlockLoader.COPPER_ORE);
        }
    };
    public static final CreativeTabs LOGIC_GATE_TAB = new CreativeTabs("logat_logic_gate") {
        @SideOnly(Side.CLIENT)
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(BlockLoader.COPPER_FRAMEWORK);
        }
    };
}
