package com.thebeastboss.thebeastbossmod.item;

import com.thebeastboss.thebeastbossmod.TBBMod;
import com.thebeastboss.thebeastbossmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup BEASTBOSS_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(TBBMod.MOD_ID, "beastboss"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.beastboss")).icon(() -> new ItemStack(TBBMod.BEASTBOSS_GEM))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.BEASTBOSS_ORE);
                        entries.add(ModBlocks.DEEPSLATE_BEASTBOSS_ORE);
                        entries.add(TBBMod.BEASTBOSS_GEM);
                        entries.add(ModBlocks.BEASTBOSS_BLOCK);
                        entries.add(TBBMod.BEASTBOSS_SWORD);
                        entries.add(TBBMod.BEASTBOSS_PICKAXE);
                        entries.add(TBBMod.BEASTBOSS_AXE);
                        entries.add(TBBMod.BEASTBOSS_SHOVEL);
                        entries.add(TBBMod.BEASTBOSS_HOE);
                        entries.add(TBBMod.BEASTBOSS_HELMET);
                        entries.add(TBBMod.BEASTBOSS_CHESTPLATE);
                        entries.add(TBBMod.BEASTBOSS_LEGGINGS);
                        entries.add(TBBMod.BEASTBOSS_BOOTS);
                    }).build());
    public static void registerItemGroups() {
        TBBMod.LOGGER.info("Registering Item Groups for " + TBBMod.MOD_ID);
    }
}
