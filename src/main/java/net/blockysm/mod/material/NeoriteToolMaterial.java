package net.blockysm.mod.material;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class NeoriteToolMaterial implements ToolMaterial {
    public static final NeoriteToolMaterial INSTANCE = new NeoriteToolMaterial();
    @Override
    public int getDurability() {
        return 20310;
    }

    @Override
    //9.0F is Netherrite
    public float getMiningSpeedMultiplier() {
        return 14.0F;
    }

    @Override
    public float getAttackDamage() {
        return 1.0F;
    }

    @Override
    public int getMiningLevel() {
        return 5;
    }

    @Override
    //Same as Golden Tools
    public int getEnchantability() {
        return 22;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.NETHERITE_INGOT);
    }
}
