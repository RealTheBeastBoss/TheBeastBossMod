package com.thebeastboss.thebeastbossmod.item;

import com.thebeastboss.thebeastbossmod.TBBMod;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class BeastBossToolMaterial implements ToolMaterial {
    public static final BeastBossToolMaterial INSTANCE = new BeastBossToolMaterial();
    @Override
    public int getDurability() {
        return 2169;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 10.0f;
    }

    @Override
    public float getAttackDamage() {
        return 5.0f;
    }

    @Override
    public int getMiningLevel() {
        return 5;
    }

    @Override
    public int getEnchantability() {
        return 21;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(TBBMod.BEASTBOSS_GEM.asItem());
    }
}
