package com.SprintXXL.primitiveoregen.library.registry;

import com.SprintXXL.primitiveoregen.library.Deposit;

import java.util.*;

import static com.SprintXXL.primitiveoregen.library.definitions.ModDeposits.initDepositDefinitions;

public final class DepositRegistry {

    private DepositRegistry() {}

    private static final Map<String, Deposit> DEPOSITS =
            new HashMap<>();

    private static final List<Deposit> ALL_DEPOSITS =
            new ArrayList<>();

    public static List<Deposit> getAllDeposits() {
        return Collections.unmodifiableList(ALL_DEPOSITS);
    }

    public static Deposit getDeposit(String id) {
        return DEPOSITS.get(id);
    }

    public static Deposit getRandomDeposit(Random random) {

        int totalWeight = 0;

        for (Deposit deposit : ALL_DEPOSITS) {
            totalWeight += deposit.getWeight().getWeight();
        }

        int roll = random.nextInt(totalWeight);

        for (Deposit deposit : ALL_DEPOSITS) {

            roll -= deposit.getWeight().getWeight();

            if (roll < 0) {
                return deposit;
            }
        }

        return ALL_DEPOSITS.get(0);
    }

    public static void register(Deposit deposit) {
        DEPOSITS.put(deposit.getID(), deposit);
        ALL_DEPOSITS.add(deposit);
    }

    public static void initDepositRegistry() {

        initDepositDefinitions(DepositRegistry::register);
    }
}