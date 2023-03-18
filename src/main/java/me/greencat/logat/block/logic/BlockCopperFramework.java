package me.greencat.logat.block.logic;

import me.greencat.logat.block.base.BlockBaseRotatable;
import me.greencat.logat.tab.CreativeTabLoader;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class BlockCopperFramework extends BlockBaseRotatable {
    public BlockCopperFramework() {
        super(Material.IRON, "copper_framework", CreativeTabLoader.LOGIC_GATE_TAB);
    }

    @Override
    public boolean isOpaqueCube(IBlockState blockState) {
        return false;
    }
    public boolean isFullCube(IBlockState blockState) {
        return false;
    }

}
