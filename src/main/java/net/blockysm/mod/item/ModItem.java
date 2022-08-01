package net.blockysm.mod.item;

import net.blockysm.mod.material.NeoriteToolMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.blockysm.mod.BlockySM;

public class ModItem {
    public class ModItems {
        //Neorite Sword
        public static final Item NEORITE_SWORD = registerItem("neorite_sword",
                new SwordItem(NeoriteToolMaterial.INSTANCE, 11, -2.0F, new FabricItemSettings().group(ModItemGroup.BLOCKY)));
        //Mod Declaration
        private static Item registerItem(String name, Item item){
            return Registry.register(Registry.ITEM, new Identifier(BlockySM.MOD_ID, name), item);

        }
        public static void registerModItems(){
            BlockySM.LOGGER.info("Registering Mod Items for" + BlockySM.MOD_ID);
        }
    }

}
