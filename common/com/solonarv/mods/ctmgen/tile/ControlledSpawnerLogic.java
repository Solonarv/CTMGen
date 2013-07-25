package com.solonarv.mods.ctmgen.tile;

import net.minecraft.tileentity.MobSpawnerBaseLogic;
import net.minecraft.world.World;

import com.solonarv.mods.ctmgen.block.ModBlocks;

public class ControlledSpawnerLogic extends MobSpawnerBaseLogic {
    
    protected TileEntityControlledSpawner theSpawner;
    
    public ControlledSpawnerLogic(TileEntityControlledSpawner spawner) {
        this.theSpawner = spawner;
    }
    
    @Override
    public void func_98267_a(int i) {
        this.theSpawner.worldObj.addBlockEvent(this.theSpawner.xCoord, this.theSpawner.yCoord, this.theSpawner.zCoord, ModBlocks.controlledSpawner.blockID, i, 0);
    }
    
    @Override
    public World getSpawnerWorld() {
        return this.theSpawner.worldObj;
    }
    
    @Override
    public int getSpawnerX() {
        return this.theSpawner.xCoord;
    }
    
    @Override
    public int getSpawnerY() {
        return this.theSpawner.yCoord;
    }
    
    @Override
    public int getSpawnerZ() {
        return this.theSpawner.zCoord;
    }
    
    @Override
    public boolean canRun() {
        return super.canRun() && this.theSpawner.worldObj.isBlockIndirectlyGettingPowered(this.theSpawner.xCoord, this.theSpawner.yCoord, this.theSpawner.zCoord);
    }
}
