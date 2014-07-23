package com.tdude.inidiumcraft.init;

import com.tdude.inidiumcraft.item.ItemIC;
import com.tdude.inidiumcraft.item.ItemInidiumGem;
import com.tdude.inidiumcraft.item.ItemInidiumPickT1;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
    public static final ItemIC InidiumGem = new ItemInidiumGem();
    public static final ItemIC InidiumPickT1 = new ItemInidiumPickT1();

    public static void init() {
        GameRegistry.registerItem(InidiumGem, "inidium_crystal");
        GameRegistry.registerItem(InidiumPickT1, "Inidium Pickaxe");
    }

}
