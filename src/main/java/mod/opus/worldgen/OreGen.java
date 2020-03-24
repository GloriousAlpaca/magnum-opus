package mod.opus.worldgen;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.IPlacementConfig;
import net.minecraftforge.registries.ForgeRegistries;

public class OreGen {

    public static void generateOre(){

        Biome biome = (Biome) ForgeRegistries.BIOMES;
        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.place());
    }
}
