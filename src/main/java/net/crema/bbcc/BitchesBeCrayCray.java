package net.crema.bbcc;

import net.crema.bbcc.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BitchesBeCrayCray implements ModInitializer {
	public static final String MOD_ID = "bitches-be-cray-cray";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}