package com.titan1um.nuggetsapi.item;

import com.titan1um.nuggetsapi.NuggetsApi;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

@SuppressWarnings("unused")
public class ModItemGroups {

    public static final ItemGroup NUGGETS_API_GROUP = Registry.register(
            Registries.ITEM_GROUP,
            new Identifier(NuggetsApi.MOD_ID, "nuggets_api"),
            FabricItemGroup.builder()
                    .displayName(Text.literal("Nuggets API"))
                    .icon(() -> new ItemStack(ModItems.NUGGET_TEMPLATE))
                    .entries((context, entries) -> {
                        entries.add(ModItems.NUGGET_TEMPLATE);
                        entries.add(ModItems.WOOD_NUGGET);
                        entries.add(ModItems.STONE_NUGGET);
                        entries.add(ModItems.DIAMOND_NUGGET);
                        entries.add(ModItems.EMERALD_NUGGET);
                        entries.add(ModItems.NETHERITE_NUGGET);
                        entries.add(ModItems.LAPIS_NUGGET);
                        entries.add(ModItems.QUARTZ_NUGGET);
                        entries.add(ModItems.COAL_NUGGET);
                        entries.add(ModItems.AMETHYST_NUGGET);
                        entries.add(ModItems.SMALL_NETHERITE_UPGRADE_TEMPLATE);
                    })
                    .build()
    );

    public static void register() {
        NuggetsApi.LOGGER.info("Registering Item Groups for " + NuggetsApi.MOD_ID);
    }
}