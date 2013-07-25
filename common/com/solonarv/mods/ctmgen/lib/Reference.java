package com.solonarv.mods.ctmgen.lib;

public class Reference {
    public static final String MOD_NAME     = "CTM Generator";
    public static final String MOD_ID       = "CTMGen";
    public final static String CHANNEL_NAME = MOD_ID;
    public final static String VERSION      = "@VERSION@";
    public final static int    MAX_TPS      = 20;
    public final static int    ITEMID_SHIFT = 256;
    
    public final static String CLIENT_PROXY = "com.solonarv.mods.ctmgen.proxy.ClientProxy";
    public final static String COMMON_PROXY = "com.solonarv.mods.ctmgen.proxy.CommonProxy";
    public final static String SERVER_PROXY = "com.solonarv.mods.ctmgen.proxy.ServerProxy";
}
