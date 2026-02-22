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

package com.titan1um.nuggetsapi.loot;

import com.titan1um.nuggetsapi.item.ModItems;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;

public class ModLootTableModifiers {

    // The identifier for the Bastion Treasure room chest
    private static final Identifier TREASURE_ROOM =
            new Identifier("minecraft", "chests/bastion_treasure");

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            // Check if we are looking at the specific Bastion Treasure chest
            if (source.isBuiltin() && TREASURE_ROOM.equals(id)) {

                LootPool pool = LootPool.builder()
                        // One "roll" per chest
                        .rolls(ConstantLootNumberProvider.create(1))

                        // This condition creates a 50% chance (0.5f) for the item to appear
                        .conditionally(RandomChanceLootCondition.builder(0.5f))

                        // The item to be added from your ModItems class
                        .with(ItemEntry.builder(ModItems.SMALL_NETHERITE_UPGRADE_TEMPLATE))

                        .build();

                // Inject our custom pool into the existing vanilla loot table
                tableBuilder.pool(pool);
            }
        });
    }
}