package com.solonarv.mods.ctmgen.tile;

import java.lang.reflect.Field;

import net.minecraft.tileentity.TileEntityMobSpawner;

public class TileEntityControlledSpawner extends TileEntityMobSpawner {
    protected ControlledSpawnerLogic logic;
    
    public TileEntityControlledSpawner() {
        super();
        try {
            Field baselogicField = TileEntityControlledSpawner.class.getField("field_98050_a");
            baselogicField.setAccessible(true);
            baselogicField.set(this, this.logic);
        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
