package com.solonarv.mods.ctmgen.tile;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

import com.solonarv.mods.ctmgen.lib.Metric;

public class TileEntityPlayerSensor extends TileEntity {
    
    public double centerX, centerY, centerZ;
    public double scaleX, scaleY, scaleZ;
    public double range;
    public Metric distanceMetric;
    
    public int countPlayers() {
        int numPlayers = 0;
        for (Object playerObj : this.worldObj.playerEntities) {
            EntityPlayer p = (EntityPlayer) playerObj;
            if (this.inRange(p.posX, p.posY, p.posZ)) {
                numPlayers++;
            }
        }
        
        return numPlayers;
    }
    
    protected boolean inRange(double x, double y, double z) {
        return range >= distanceMetric.apply((x - centerX) / scaleX, (y - centerY) / scaleY, (z - centerZ) / scaleZ);
    }
    
    @Override
    public void writeToNBT(NBTTagCompound nbt) {
        super.writeToNBT(nbt);
        nbt.setDouble("centerX", this.centerX);
        nbt.setDouble("centerY", this.centerY);
        nbt.setDouble("centerZ", this.centerZ);
        
        nbt.setDouble("scaleX", this.scaleX);
        nbt.setDouble("scaleY", this.scaleY);
        nbt.setDouble("scaleZ", this.scaleZ);
        
        nbt.setDouble("range", this.range);
        
        nbt.setByte("metric", (byte) distanceMetric.id);
    }
    
    @Override
    public void readFromNBT(NBTTagCompound nbt) {
        super.writeToNBT(nbt);
        this.centerX = nbt.getDouble("centerX");
        this.centerY = nbt.getDouble("centerY");
        this.centerZ = nbt.getDouble("centerZ");
        
        this.scaleX = nbt.getDouble("scaleX");
        this.scaleY = nbt.getDouble("scaleY");
        this.scaleZ = nbt.getDouble("scaleZ");
        
        this.range = nbt.getDouble("range");
        
        this.distanceMetric = Metric.getMetricByID(nbt.getByte("metric"));
    }
    
}
