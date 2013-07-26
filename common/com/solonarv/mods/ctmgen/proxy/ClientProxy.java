package com.solonarv.mods.ctmgen.proxy;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.client.renderer.tileentity.TileEntityMobSpawnerRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

import com.solonarv.mods.ctmgen.tile.TileEntityControlledSpawner;

public class ClientProxy extends CommonProxy {
    
    Map<Class<? extends TileEntity>, TileEntitySpecialRenderer> renderers = new HashMap<Class<? extends TileEntity>, TileEntitySpecialRenderer>();
    
    @Override
    public void registerRenderers() {
        renderers.put(TileEntityControlledSpawner.class, new TileEntityMobSpawnerRenderer());
        
        for (TileEntitySpecialRenderer tesr : renderers.values()) {
            tesr.setTileEntityRenderer(TileEntityRenderer.instance);
        }
        TileEntityRenderer.instance.specialRendererMap.putAll(renderers);
    }
}
