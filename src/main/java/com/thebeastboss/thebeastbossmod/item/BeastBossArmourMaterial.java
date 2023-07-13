package com.thebeastboss.thebeastbossmod.item;

import com.thebeastboss.thebeastbossmod.TBBMod;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class BeastBossArmourMaterial implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[] {420, 600, 564, 490};
    private static final int[] PROTECTION_VALUES = new int[] {3, 9, 7, 4};
    public static final BeastBossArmourMaterial INSTANCE = new BeastBossArmourMaterial();
    @Override
    public int getDurability(ArmorItem.Type type) {
        return BASE_DURABILITY[type.getEquipmentSlot().getEntitySlotId()];
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return PROTECTION_VALUES[type.getEquipmentSlot().getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 23;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(TBBMod.BEASTBOSS_GEM);
    }

    @Override
    public String getName() {
        return "beastboss";
    }

    @Override
    public float getToughness() {
        return 4.0f;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.2f;
    }
}
