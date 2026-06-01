package com.SprintXXL.primitiveoregen.library.registry;

import com.SprintXXL.primitiveoregen.library.data.DepositDefinition;
import com.SprintXXL.primitiveoregen.library.defaults.ModDeposits;

import java.util.*;

public final class DepositRegistry {

    private DepositRegistry() {}

    private static final Map<String, DepositDefinition> DEPOSITS =
            new HashMap<>();

    private static final List<DepositDefinition> ALL_DEPOSITS =
            new ArrayList<>();

    public static List<DepositDefinition> getAllDeposits() {
        return Collections.unmodifiableList(ALL_DEPOSITS);
    }

    public static DepositDefinition getDeposit(String id) {
        return DEPOSITS.get(id);
    }

    public static DepositDefinition getRandomDeposit(Random random) {

        int totalWeight = 0;

        for (DepositDefinition deposit : ALL_DEPOSITS) {
            totalWeight += deposit.getWeight().getWeight();
        }

        int roll = random.nextInt(totalWeight);

        for (DepositDefinition deposit : ALL_DEPOSITS) {

            roll -= deposit.getWeight().getWeight();

            if (roll < 0) {
                return deposit;
            }
        }

        return ALL_DEPOSITS.get(0);
    }

    public static void register(DepositDefinition deposit) {
        DEPOSITS.put(deposit.getID(), deposit);
        ALL_DEPOSITS.add(deposit);
    }

    public static void init() {

        register(ModDeposits.MAGNETITE_DEPOSIT);
        register(ModDeposits.CHALCOPYRITE_DEPOSIT);
        register(ModDeposits.CASSITERITE_DEPOSIT);
        register(ModDeposits.COAL_DEPOSIT);
        register(ModDeposits.REDSTONE_DEPOSIT);

    }
}