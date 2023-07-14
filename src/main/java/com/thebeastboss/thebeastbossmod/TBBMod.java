package com.thebeastboss.thebeastbossmod;

import com.thebeastboss.thebeastbossmod.block.ModBlocks;
import com.thebeastboss.thebeastbossmod.enchantment.WitheringEnchantment;
import com.thebeastboss.thebeastbossmod.item.*;
import com.thebeastboss.thebeastbossmod.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TBBMod implements ModInitializer {
	public static final String MOD_ID = "thebeastbossmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final RegistryKey<PlacedFeature> BEASTBOSS_ORE_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(MOD_ID, "ore_beastboss"));
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
			new RegularHoeItem(BeastBossToolMaterial.INSTANCE, 1, -2.8f, new FabricItemSettings().fireproof()));
	public static Item BEASTBOSS_HELMET = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "beastboss_helmet"),
			new ArmorItem(BeastBossArmourMaterial.INSTANCE, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof()));
	public static Item BEASTBOSS_CHESTPLATE = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "beastboss_chestplate"),
			new ArmorItem(BeastBossArmourMaterial.INSTANCE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof()));
	public static Item BEASTBOSS_LEGGINGS = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "beastboss_leggings"),
			new ArmorItem(BeastBossArmourMaterial.INSTANCE, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()));
	public static Item BEASTBOSS_BOOTS = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "beastboss_boots"),
			new ArmorItem(BeastBossArmourMaterial.INSTANCE, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof()));
	// TheBeastBoss Mod's Enchantments:
	public static Enchantment WITHERING = Registry.register(Registries.ENCHANTMENT, new Identifier(MOD_ID, "withering"), new WitheringEnchantment());
	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
		ModWorldGeneration.generateModWorldGen();
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, BEASTBOSS_ORE_PLACED_KEY);
		StrippableBlockRegistry.register(ModBlocks.BEASTBOSS_LOG, ModBlocks.STRIPPED_BEASTBOSS_LOG);
		StrippableBlockRegistry.register(ModBlocks.BEASTBOSS_WOOD, ModBlocks.STRIPPED_BEASTBOSS_WOOD);
	}
}