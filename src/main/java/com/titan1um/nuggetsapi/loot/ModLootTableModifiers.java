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