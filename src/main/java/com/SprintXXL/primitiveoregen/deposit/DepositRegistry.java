package com.SprintXXL.primitiveoregen.deposit;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DepositRegistry {

    private static IBlockState getBlockState(String modid, String name) {
        Block block = ForgeRegistries.BLOCKS.getValue(
                new ResourceLocation(modid, name)
        );

        System.out.println("[PrimitiveOreGen] Looking up block" + modid + ":" + name);
        System.out.println("[PrimitiveOreGen] Result: " + block);

        return block.getDefaultState();
    }

    public static final DepositDefinition IRON_DEPOSIT =
            new DepositDefinition(
                    getBlockState("primitiveores", "iron_ore"), // Ore to Place
                    9,4,9, // Ore Radius X,Y,Z
                    3,3,3, // Cell Dimensions X,Y,Z
                    20,30, // Ore Deposit Min Y, Max Y
                    12, // Ores per Cell
                    10 // Deposit weight
            );

    public static final DepositDefinition GOLD_DEPOSIT =
            new DepositDefinition(
                    Blocks.GOLD_ORE.getDefaultState(),
                    9,4,9,
                    3,3,3,
                    40,50,
                    12,
                    10
            );

    public static final List<DepositDefinition> ALL_DEPOSITS =
            Arrays.asList(
                    IRON_DEPOSIT,
                    GOLD_DEPOSIT
            );

    public static DepositDefinition getRandomDeposit(Random random) {

        System.out.println("[PrimitiveOreGen] Selecting Deposit");

        int totalWeight = 0;

        for (DepositDefinition deposit : ALL_DEPOSITS) {
            totalWeight += deposit.weight;
        }

        int roll = random.nextInt(totalWeight);

        for (DepositDefinition deposit : ALL_DEPOSITS) {
            roll -= deposit.weight;

            if (roll < 0) {
                return deposit;
            }
        }

        return IRON_DEPOSIT;
    }
}