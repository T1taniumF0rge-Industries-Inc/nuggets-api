package com.titan1um.nuggetsapi.item;

import com.titan1um.nuggetsapi.NuggetsApi;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item NUGGET_TEMPLATE = register("nugget_template");

    public static final Item WOOD_NUGGET = register("wood_nugget");
    public static final Item STONE_NUGGET = register("stone_nugget");
    public static final Item DIAMOND_NUGGET = register("diamond_nugget");
    public static final Item EMERALD_NUGGET = register("emerald_nugget");
    public static final Item NETHERITE_NUGGET = register("netherite_nugget");
    public static final Item LAPIS_NUGGET = register("lapis_nugget");
    public static final Item QUARTZ_NUGGET = register("quartz_nugget");
    public static final Item COAL_NUGGET = register("coal_nugget");
    public static final Item AMETHYST_NUGGET = register("amethyst_nugget");

    public static final Item SMALL_NETHERITE_UPGRADE_TEMPLATE =
            Registry.register(Registries.ITEM,
                    new Identifier(NuggetsApi.MOD_ID, "small_netherite_upgrade_smithing_template"),
                    SmallNetheriteUpgradeTemplateItem.create());

    private static Item register(String name) {
        return Registry.register(
                Registries.ITEM,
                new Identifier(NuggetsApi.MOD_ID, name),
                new Item(new FabricItemSettings())
        );
    }

    public static void register() {}
}
