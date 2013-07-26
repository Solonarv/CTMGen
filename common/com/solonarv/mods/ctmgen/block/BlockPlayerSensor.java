package com.solonarv.mods.ctmgen.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

import com.solonarv.mods.ctmgen.tile.TileEntityPlayerSensor;

public class BlockPlayerSensor extends Block {
    
    public Icon texture;
    
    public BlockPlayerSensor(int id) {
        super(id, Material.rock);
    }
    
    @Override
    public boolean hasComparatorInputOverride() {
        return true;
    }
    
    @Override
    public int getComparatorInputOverride(World world, int x, int y, int z, int _) {
        return this.countNeighborPlayers(world, x, y, z);
    }
    
    public int countNeighborPlayers(World world, int x, int y, int z) {
        return ((TileEntityPlayerSensor) (world.getBlockTileEntity(x, y, z))).countPlayers();
    }
    
    @Override
    public void registerIcons(IconRegister ir) {
        this.texture = ir.registerIcon("ctmgen:player_sensor");
    }
}
