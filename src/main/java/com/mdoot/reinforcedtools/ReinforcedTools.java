package com.mdoot.reinforcedtools;

import com.mdoot.reinforcedtools.block.ModBlocks;
import com.mdoot.reinforcedtools.item.ModItemGroups;
import com.mdoot.reinforcedtools.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReinforcedTools implements ModInitializer {
	public static final String MOD_ID = "reinforcedtools";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}