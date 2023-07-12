package com.thebeastboss.thebeastbossmod;

import com.thebeastboss.thebeastbossmod.block.ModBlocks;
import com.thebeastboss.thebeastbossmod.item.*;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TBBMod implements ModInitializer {
	public static final String MOD_ID = "thebeastbossmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	// TheBeastBoss Mod Items:
	public static final Item BEASTBOSS_GEM =  Registry.register(Registries.ITEM, new Identifier(MOD_ID, "beastboss_gem"),
			new Item(new FabricItemSettings()));
	public static ToolItem BEASTBOSS_SHOVEL = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "beastboss_shovel"),
			new ShovelItem(BeastBossToolMaterial.INSTANCE, 1.5f, -2.0f, new FabricItemSettings().fireproof()));
	public static ToolItem BEASTBOSS_SWORD = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "beastboss_sword"),
			new SwordItem(BeastBossToolMaterial.INSTANCE, 4, -1.0f, new FabricItemSettings().fireproof()));
	public static ToolItem BEASTBOSS_PICKAXE = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "beastboss_pickaxe"),
			new RegularPickaxeItem(BeastBossToolMaterial.INSTANCE, 1, -2.8f, new FabricItemSettings().fireproof()));
	public static ToolItem BEASTBOSS_AXE = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "beastboss_axe"),
			new RegularAxeItem(BeastBossToolMaterial.INSTANCE, 7.0f, -3.2f, new FabricItemSettings().fireproof()));
	public static ToolItem BEASTBOSS_HOE = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "beastboss_hoe"),
			new RegularHoeItem(BeastBossToolMaterial.INSTANCE, 3, -2.8f, new FabricItemSettings().fireproof()));
	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
	}
}