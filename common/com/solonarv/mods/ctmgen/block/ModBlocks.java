package com.solonarv.mods.ctmgen.block;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

import com.solonarv.mods.ctmgen.CTMGen;
import com.solonarv.mods.ctmgen.lib.Reference;

public class ModBlocks {
    
    public static BlockControlledSpawner controlledSpawner;
    
    public static void init() {
        controlledSpawner = (BlockControlledSpawner) (new BlockControlledSpawner(CTMGen.cfg.getBlock("controlledSpawner", 600).getInt())
                .setHardness(5.0F).setStepSound(Block.soundMetalFootstep).setUnlocalizedName("controlledSpawner").func_111022_d("mob_spawner"));
        createItemBlocks();
    }
    
    public static void createItemBlocks() {
        Item.itemsList[controlledSpawner.blockID] = null;
        new ItemBlock(controlledSpawner.blockID - Reference.ITEMID_SHIFT);
        
    }
}
