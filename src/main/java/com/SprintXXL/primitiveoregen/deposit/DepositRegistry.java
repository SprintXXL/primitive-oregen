package com.SprintXXL.primitiveoregen.deposit;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static com.SprintXXL.primitiveoregen.deposit.DepositBlocks.getBlockState;

public class DepositRegistry {

    public static final DepositDefinition IRON_DEPOSIT =
            new DepositDefinition(
                    getBlockState("primitiveores", "iron_ore"), // Ore to Place
                    15,4,15, // Ore Radius X,Y,Z
                    3,3,3, // Cell Dimensions X,Y,Z
                    30,40, // Ore Deposit Min Y, Max Y
                    17, // Ores per Cell
                    10 // Deposit weight
            );

    public static final DepositDefinition COAL_DEPOSIT =
            new DepositDefinition(
                    getBlockState("primitiveores", "coal_ore"),
                    15,4,15,
                    3,3,3,
                    30,40,
                    17,
                    5
            );

    public static final DepositDefinition COPPER_DEPOSIT =
            new DepositDefinition(
                    getBlockState("primitiveores", "copper_ore"),
                    15,4,15,
                    3,3,3,
                    30,40,
                    17,
                    10
            );

    public static final DepositDefinition TIN_DEPOSIT =
            new DepositDefinition(
                    getBlockState("primitiveores", "tin_ore"),
                    15,4,15,
                    3,3,3,
                    30,40,
                    17,
                    5
            );

    public static final List<DepositDefinition> ALL_DEPOSITS =
            Arrays.asList(
                    IRON_DEPOSIT,
                    COAL_DEPOSIT,
                    COPPER_DEPOSIT,
                    TIN_DEPOSIT
            );

    public static DepositDefinition getRandomDeposit(Random random) {

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