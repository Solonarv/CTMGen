package com.solonarv.mods.ctmgen.block;

import net.minecraft.block.BlockMobSpawner;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.solonarv.mods.ctmgen.tile.TileEntityControlledSpawner;

public class BlockControlledSpawner extends BlockMobSpawner {
    
    protected BlockControlledSpawner(int id) {
        super(id);
    }
    
    @Override
    public TileEntity createNewTileEntity(World world) {
        return new TileEntityControlledSpawner();
    }
}
