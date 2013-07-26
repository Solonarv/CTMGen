package com.solonarv.mods.ctmgen.tile;

import net.minecraft.tileentity.TileEntityMobSpawner;

public class TileEntityControlledSpawner extends TileEntityMobSpawner {
    @Override
    public void updateEntity() {
        if (this.worldObj.isBlockIndirectlyGettingPowered(this.xCoord, this.yCoord, this.zCoord)) {
            super.updateEntity();
        }
    }
}
