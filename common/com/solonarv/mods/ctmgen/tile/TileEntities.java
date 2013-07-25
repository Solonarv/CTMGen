package com.solonarv.mods.ctmgen.tile;

import cpw.mods.fml.common.registry.GameRegistry;

public class TileEntities {
    public static void register() {
        GameRegistry.registerTileEntity(TileEntityControlledSpawner.class, "TileEntityControlledSpawner");
    }
}
