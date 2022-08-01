package net.blockysm.mod;

import net.blockysm.mod.item.ModItem;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BlockySM implements ModInitializer {
	public static final String MOD_ID = "blockyussr_showcase_mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	@Override
	public void onInitialize() {
		ModItem.ModItems.registerModItems();


	}
}
