package com.solonarv.mods.ctmgen.block;

import com.solonarv.mods.ctmgen.CTMGen;

public class ModBlocks {
    
    public static BlockControlledSpawner controlledSpawner;
    
    public static void init() {
        controlledSpawner = new BlockControlledSpawner(CTMGen.cfg.getBlock("controlledSpawner", 600).getInt());
    }
}
