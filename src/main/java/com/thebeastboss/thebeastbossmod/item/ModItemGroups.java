package com.thebeastboss.thebeastbossmod.item;

import com.thebeastboss.thebeastbossmod.TBBMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup BEASTBOSS_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(TBBMod.MOD_ID, "beastboss"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.beastboss")).icon(() -> new ItemStack(ModItems.BEASTBOSS_GEM))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.BEASTBOSS_GEM);
                    }).build());
    public static void registerItemGroups() {
        TBBMod.LOGGER.info("Registering Item Groups for " + TBBMod.MOD_ID);
    }
}
