package com.SprintXXL.primitiveoregen.worldgen;

import com.SprintXXL.primitiveoregen.library.Deposit;
import com.SprintXXL.primitiveoregen.library.logic.DepositGenerator;
import com.SprintXXL.primitiveoregen.library.registry.DepositRegistry;
import com.SprintXXL.primitiveoregen.util.OreGenHelper;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import java.util.Random;

import static com.SprintXXL.primitiveoregen.util.Config.DEBUG_SURFACE_MODE;

public class PrimitiveOreWorldGenerator implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world,
                         IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {

        if (OreGenHelper.isDepositChunk(chunkX, chunkZ)) {
            int centerX = chunkX * 16 + 8;
            int centerZ = chunkZ * 16 + 8;

            Deposit chosenDeposit = DepositRegistry.getRandomDeposit(random);

            int centerY;

            if (DEBUG_SURFACE_MODE) {
                centerY = 30;
            }
            else {
                centerY = chosenDeposit.getRange().getMinY() + random.nextInt(chosenDeposit.getRange().getMaxY() - chosenDeposit.getRange().getMinY() + 1);
            }

            DepositGenerator.generateDeposit(
                    world,
                    random,
                    centerX,
                    centerY,
                    centerZ,
                    chosenDeposit
            );
        }
    }
}