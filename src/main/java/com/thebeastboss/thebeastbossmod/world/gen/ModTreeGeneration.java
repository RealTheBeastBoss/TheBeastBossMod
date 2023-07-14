package com.thebeastboss.thebeastbossmod.world.gen;

import com.thebeastboss.thebeastbossmod.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class ModTreeGeneration {
    public static void generateTrees() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BIRCH_FOREST, BiomeKeys.TAIGA, BiomeKeys.FLOWER_FOREST, BiomeKeys.FOREST, BiomeKeys.GROVE, BiomeKeys.MEADOW,
                BiomeKeys.OLD_GROWTH_BIRCH_FOREST, BiomeKeys.OLD_GROWTH_PINE_TAIGA, BiomeKeys.OLD_GROWTH_SPRUCE_TAIGA, BiomeKeys.PLAINS, BiomeKeys.SPARSE_JUNGLE,
                BiomeKeys.SUNFLOWER_PLAINS), GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.BEASTBOSS_PLACED_KEY);
    }
}
