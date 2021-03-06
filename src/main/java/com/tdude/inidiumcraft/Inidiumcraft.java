package com.tdude.inidiumcraft;

import com.tdude.inidiumcraft.handler.ConfigHandler;
import com.tdude.inidiumcraft.init.ModItems;
import com.tdude.inidiumcraft.proxy.IProxy;
import com.tdude.inidiumcraft.reference.Reference;
import com.tdude.inidiumcraft.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name= Reference.MOD_NAME, version= Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class Inidiumcraft {

    @Mod.Instance(Reference.MOD_ID)
    public static Inidiumcraft instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        ConfigHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigHandler());
        ModItems.init();
        LogHelper.info("Items Loaded!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
    }
}
