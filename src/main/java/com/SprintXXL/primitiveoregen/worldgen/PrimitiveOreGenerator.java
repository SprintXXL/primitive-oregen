package com.SprintXXL.primitiveoregen.worldgen;

import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class PrimitiveOreGenerator implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {

        if (Math.floorMod(chunkX, 3) == 1 && Math.floorMod(chunkZ, 3) == 1) {

            int blockX = chunkX * 16 + 8;
            int blockY = 40;
            int blockZ = chunkZ * 16 + 8;

            for (int offsetX = -10; offsetX <= 10; offsetX++) {
                for (int offsetY = -1; offsetY <= 2; offsetY++) {
                    for (int offsetZ = -10; offsetZ <= 10; offsetZ++) {

                        if (random.nextBoolean()) {
                            world.setBlockState(
                                    new BlockPos(blockX + offsetX, blockY + offsetY, blockZ + offsetZ),
                                    Blocks.IRON_ORE.getDefaultState());
                        }
                        else {
                            world.setBlockState(
                                    new BlockPos(blockX + offsetX, blockY + offsetY, blockZ + offsetZ),
                                    Blocks.STONE.getDefaultState()
                            );
                        }
                    }
                }
            }
        }
    }
}