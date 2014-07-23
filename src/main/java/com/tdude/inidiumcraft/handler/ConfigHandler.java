package com.tdude.inidiumcraft.handler;

import com.tdude.inidiumcraft.reference.Reference;
import com.tdude.inidiumcraft.utility.LogHelper;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler {

    public static Configuration config;
    public static boolean testValue = false;

    public static void init(File configFile) {

        //creates config object
        if(config == null){
            config = new Configuration(configFile);
            loadConfig();
        }

    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
        if(event.modID.equalsIgnoreCase(Reference.MOD_ID)){
            loadConfig();

        }
    }

    private static void loadConfig() {
        testValue = config.getBoolean("testValue", Configuration.CATEGORY_GENERAL, false, "This is a test config thingy");
        if (config.hasChanged()){
            config.save();
            LogHelper.info("Configs Updated");
        }
    }
}
