/*
 * COP
 */
package com.titan1um.nuggetsapi;

import com.titan1um.nuggetsapi.item.ModItems;
import com.titan1um.nuggetsapi.item.ModItemGroups;
import com.titan1um.nuggetsapi.loot.ModLootTableModifiers;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NuggetsApi implements ModInitializer {

	public static final String MOD_ID = "nuggets-api";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// Register all items
		ModItems.register();

		// Register creative tabs / item groups
		ModItemGroups.register();

		// Modify loot tables
		ModLootTableModifiers.modifyLootTables();

		LOGGER.info("Nuggets API loaded successfully!");
	}
}