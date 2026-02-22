package com.titan1um.nuggetsapi.item;

import net.minecraft.item.Item;

public class SmallNetheriteUpgradeTemplateItem {
    public static Item create() {
        return new Item(new Item.Settings()); // simple item, no smithing table behavior
    }
}