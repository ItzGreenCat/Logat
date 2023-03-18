package me.greencat.logat.tileentity.loader;

import me.greencat.logat.tileentity.RedstoneConverterEntity;

public class TileEntityLoader extends TileEntityRegistry{

    public TileEntityLoader() {
        super();
        register(RedstoneConverterEntity.class,"redstone_converter");
    }
}
