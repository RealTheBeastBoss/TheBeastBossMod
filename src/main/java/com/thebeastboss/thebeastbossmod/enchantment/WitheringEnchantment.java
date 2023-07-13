package com.thebeastboss.thebeastbossmod.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ItemStack;

import java.util.Random;

public class WitheringEnchantment extends Enchantment {
    public WitheringEnchantment() {
        super(Rarity.UNCOMMON, EnchantmentTarget.DIGGER, new EquipmentSlot[] {EquipmentSlot.MAINHAND});
    }

    @Override
    public boolean isAcceptableItem(ItemStack stack) {
        return stack.getItem() instanceof HoeItem;
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if (!user.getWorld().isClient()) {
            if (target == null) {
                return;
            }
            LivingEntity enemy = (LivingEntity) target;
            float chance = 0f;
            int duration = 0;
            switch (level) {
                case 1:
                    chance = 0.2f;
                    duration = 8 * 20;
                    break;
                case 2:
                    chance = 0.3f;
                    duration = 12 * 20;
                    break;
                case 3:
                    chance = 0.5f;
                    duration = 20 * 20;
                    break;
            }
            if (new Random().nextFloat() < chance) {
                enemy.addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, duration));
            }
        }
        super.onTargetDamaged(user, target, level);
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }
}
