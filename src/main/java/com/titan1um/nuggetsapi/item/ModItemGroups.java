/*
MIT License
Copyright (c) 2026 The T1taniumF0rge Industries® (Inc.)

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
 */

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
        NuggetsApi.LOGGER.info("Registering item groups for " + NuggetsApi.MOD_ID);
    }
}