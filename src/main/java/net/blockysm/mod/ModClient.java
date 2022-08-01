package net.blockysm.mod;

import net.blockysm.mod.item.ModItem;
import net.fabricmc.api.ClientModInitializer;

public class ModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModItem.ModItems.registerModItems();
    }
}
