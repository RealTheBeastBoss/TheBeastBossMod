package com.thebeastboss.thebeastbossmod.block;

import com.thebeastboss.thebeastbossmod.TBBMod;
import com.thebeastboss.thebeastbossmod.block.custom.*;
import com.thebeastboss.thebeastbossmod.block.entity.ModWoodTypes;
import com.thebeastboss.thebeastbossmod.world.tree.BeastBossSaplingGenerator;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block BEASTBOSS_BLOCK = registerBlock("beastboss_block", new PillarBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_LOG)
            .requiresTool().strength(6.4f, 6.9f).sounds(BlockSoundGroup.METAL).mapColor(MapColor.LAPIS_BLUE)));
    public static final Block BEASTBOSS_ORE = registerBlock("beastboss_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(4.0f)));
    public static final Block DEEPSLATE_BEASTBOSS_ORE = registerBlock("deepslate_beastboss_ore", new ExperienceDroppingBlock(FabricBlockSettings
            .copyOf(Blocks.DEEPSLATE_DIAMOND_ORE).strength(5.0f)));
    public static final Block BEASTBOSS_LOG = registerBlock("beastboss_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4.0f).requiresTool()));
    public static final Block BEASTBOSS_WOOD = registerBlock("beastboss_wood", new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(4.0f).requiresTool()));
    public static final Block STRIPPED_BEASTBOSS_LOG = registerBlock("stripped_beastboss_log", new PillarBlock(FabricBlockSettings
            .copyOf(Blocks.STRIPPED_OAK_LOG).strength(4.0f).requiresTool()));
    public static final Block STRIPPED_BEASTBOSS_WOOD = registerBlock("stripped_beastboss_wood", new PillarBlock(FabricBlockSettings
            .copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4.0f).requiresTool()));
    public static final Block BEASTBOSS_PLANKS = registerBlock("beastboss_planks", new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(4.0f).requiresTool()));
    public static final Block BEASTBOSS_LEAVES = registerBlock("beastboss_leaves", new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(0.4f).requiresTool()));
    public static final Block BEASTBOSS_SAPLING = registerBlock("beastboss_sapling", new SaplingBlock(new BeastBossSaplingGenerator(),
            FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block BEASTBOSS_PRESSURE_PLATE = registerBlock("beastboss_pressure_plate", new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
            FabricBlockSettings.copyOf(Blocks.ACACIA_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block BEASTBOSS_BUTTON = registerBlock("beastboss_button", new ButtonBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_BUTTON), BlockSetType.OAK,
            30, true));
    public static final Block BEASTBOSS_FENCE = registerBlock("beastboss_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).strength(4.0f).requiresTool()));
    public static final Block BEASTBOSS_FENCE_GATE = registerBlock("beastboss_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).strength(4.0f).requiresTool(), ModWoodTypes.BEASTBOSS));
    public static final Block BEASTBOSS_STAIRS = registerBlock("beastboss_stairs", new StairsBlock(ModBlocks.BEASTBOSS_PLANKS.getDefaultState(),
            FabricBlockSettings.copyOf(Blocks.OAK_STAIRS).strength(4.0f).requiresTool()));
    public static final Block BEASTBOSS_SLAB = registerBlock("beastboss_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB).strength(4.0f).requiresTool()));
    public static final Block BEASTBOSS_DOOR = registerBlock("beastboss_door", new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR).strength(4.0f).requiresTool(), BlockSetType.OAK));
    public static final Block BEASTBOSS_TRAPDOOR = registerBlock("beastboss_trapdoor", new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR).strength(4.0f).requiresTool(), BlockSetType.OAK));
    public static final Block BEASTBOSS_SIGN = registerBlockWithoutBlockItem("beastboss_sign", new ModStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN)
            .strength(4.0f).requiresTool(), ModWoodTypes.BEASTBOSS));
    public static final Block BEASTBOSS_WALL_SIGN = registerBlockWithoutBlockItem("beastboss_wall_sign", new ModWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_SIGN)
            .strength(4.0f).requiresTool(), ModWoodTypes.BEASTBOSS));
    public static final Block BEASTBOSS_HANGING_SIGN = registerBlockWithoutBlockItem("beastboss_hanging_sign", new ModHangingSignBlock(FabricBlockSettings
            .copyOf(Blocks.OAK_HANGING_SIGN).strength(4.0f).requiresTool(), ModWoodTypes.BEASTBOSS));
    public static final Block BEASTBOSS_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("beastboss_wall_hanging_sign", new ModWallHangingSignBlock(FabricBlockSettings
            .copyOf(Blocks.OAK_WALL_HANGING_SIGN).strength(4.0f).requiresTool(), ModWoodTypes.BEASTBOSS));
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TBBMod.MOD_ID, name), block);
    }
    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(TBBMod.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(TBBMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        TBBMod.LOGGER.info("Registering Mod Blocks for " + TBBMod.MOD_ID);
    }
}
