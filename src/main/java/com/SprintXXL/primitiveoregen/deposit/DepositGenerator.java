package com.SprintXXL.primitiveoregen.deposit;

import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

import static com.SprintXXL.primitiveoregen.Config.DEBUG_SURFACE_MODE;

public class DepositGenerator {

    public static void generateDeposit(World world, Random random, int centerX, int centerY, int centerZ, DepositDefinition definition) {


        for (int cellX = -definition.radiusX; cellX <= definition.radiusX; cellX += definition.cellSizeX) {
            for (int cellY = -definition.radiusY; cellY <= definition.radiusY; cellY += definition.cellSizeY) {
                for (int cellZ = -definition.radiusZ; cellZ <= definition.radiusZ; cellZ += definition.cellSizeZ) {

                    generateOreCell(world, random, centerX, centerY, centerZ, cellX, cellY, cellZ, definition);
                }
            }
        }
    }

    public static void generateOreCell(World world, Random random, int centerX, int centerY, int centerZ,
                                int cellX, int cellY, int cellZ, DepositDefinition definition) {

        int oresPerCell = definition.oresPerCell;

        for (int i = 0; i < oresPerCell; i++) {


            int localX = random.nextInt(definition.cellSizeX);
            int localY = random.nextInt(definition.cellSizeY);
            int localZ = random.nextInt(definition.cellSizeZ);

            BlockPos pos = new BlockPos(
                    centerX + cellX + localX,
                    centerY + cellY + localY,
                    centerZ + cellZ + localZ
            );

            if (DEBUG_SURFACE_MODE || world.getBlockState(pos).getBlock() == Blocks.STONE) {
                world.setBlockState(pos, definition.blockState);
            }
        }
    }
}