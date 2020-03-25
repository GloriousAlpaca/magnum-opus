package mod.opus.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BasicOre {

    public static Block ore(String name){
        return new Block(Block.Properties.create(Material.ROCK)
                .lightValue(0)
                .hardnessAndResistance(3,15)
                .harvestLevel(1)
                .harvestTool(net.minecraftforge.common.ToolType.PICKAXE)).setRegistryName(name);
    }
}

