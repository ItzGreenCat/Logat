package me.greencat.logat.block.logic;

import me.greencat.logat.block.base.BlockLogicGateBase;
import me.greencat.logat.tab.CreativeTabLoader;
import me.greencat.logat.tileentity.RedstoneConverterEntity;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockRedstoneConverter extends BlockLogicGateBase {
    public BlockRedstoneConverter(){
        super(Material.IRON,"redstone_converter", CreativeTabLoader.LOGIC_GATE_TAB);
    }
    @Override
    public boolean hasTileEntity(IBlockState state) {
        return true;
    }

    @Override
    public TileEntity createTileEntity(World world, IBlockState state) {
        return new RedstoneConverterEntity();
    }
}
