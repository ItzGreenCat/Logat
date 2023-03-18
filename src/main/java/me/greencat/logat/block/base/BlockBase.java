package me.greencat.logat.block.base;

import me.greencat.logat.Logat;
import me.greencat.logat.item.loader.ItemBlockLoader;
import me.greencat.logat.item.loader.ItemRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;

import java.util.Objects;

public abstract class BlockBase extends Block {

    public final String name;
    public final ItemBlock itemBlock;

    public BlockBase(Material material, String name, Boolean hasItemBlock) {
        super(material);
        this.name = name;
        this.setRegistryName(name);
        this.setUnlocalizedName(Logat.MOD_ID + "." + name);
        if(hasItemBlock) {
            this.itemBlock = (ItemBlock) new ItemBlock(this).setRegistryName(Objects.requireNonNull(this.getRegistryName()));
            ItemBlockLoader.register(itemBlock);
        } else {
            this.itemBlock = null;
        }
    }
    public BlockBase(Material material, String name, Boolean hasItemBlock, CreativeTabs tab) {
        this(material,name,hasItemBlock);
        this.setCreativeTab(tab);
    }
    public BlockBase(Material material,String name,CreativeTabs tab) {
        this(material,name,true);
        this.setCreativeTab(tab);
    }
    public BlockBase(Material material,String name) {
        this(material,name,true);
    }
}
