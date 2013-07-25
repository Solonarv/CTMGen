package com.solonarv.mods.ctmgen;

import net.minecraftforge.common.Configuration;

import com.solonarv.mods.ctmgen.block.ModBlocks;
import com.solonarv.mods.ctmgen.item.ModItems;
import com.solonarv.mods.ctmgen.lib.Reference;
import com.solonarv.mods.ctmgen.proxy.CommonProxy;
import com.solonarv.mods.ctmgen.tile.TileEntities;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class CTMGen {
    
    @Instance(Reference.MOD_ID)
    public static CTMGen instance;
    
    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static CommonProxy proxy;
    
    public static Configuration cfg;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        cfg = new Configuration(event.getSuggestedConfigurationFile());
        ModItems.init();
        ModBlocks.init();
        ModItems.initRecipes();
        TileEntities.register();
    }
    
    @EventHandler
    public void load(FMLInitializationEvent event) {
        
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        
    }
}
