package com.SprintXXL.primitiveoregen.library.definitions;

import com.SprintXXL.primitiveoregen.library.Deposit;
import com.SprintXXL.primitiveoregen.library.util.DepositShape;
import com.SprintXXL.primitiveoregen.library.util.DepositWeight;
import com.SprintXXL.primitiveoregen.library.util.DepositRange;
import com.sprintxxl.ascenthub.definitions.DefinitionRegistrar;

import static com.sprintxxl.ascentresourcerecipeindex.resources.definitions.ResourceCatalog.*;

public final class ModDeposits {

    private ModDeposits() {}

    public static void initDepositDefinitions(DefinitionRegistrar<Deposit> registrar) {

        registrar.register(MAGNETITE_DEPOSIT);
        registrar.register(CHALCOPYRITE_DEPOSIT);
        registrar.register(CASSITERITE_DEPOSIT);
        registrar.register(COAL_DEPOSIT);
        registrar.register(REDSTONE_DEPOSIT);
    }

    public static final Deposit MAGNETITE_DEPOSIT =
            new Deposit(
                    DepositIDs.MAGNETITE_DEPOSIT,
                    DepositShape.STANDARD,
                    DepositWeight.COMMON,
                    DepositRange.NORMAL,
                    MAGNETITE_ORE,
                    MAGNETITE_ORE,
                    GOLD_ORE
            );

    public static final Deposit CHALCOPYRITE_DEPOSIT =
            new Deposit(
                    DepositIDs.CHALCOPYRITE_DEPOSIT,
                    DepositShape.STANDARD,
                    DepositWeight.COMMON,
                    DepositRange.NORMAL,
                    CHALCOPYRITE_ORE,
                    CHALCOPYRITE_ORE,
                    PYRITE_ORE
            );

    public static final Deposit CASSITERITE_DEPOSIT =
            new Deposit(
                    DepositIDs.CASSITERITE_DEPOSIT,
                    DepositShape.STANDARD,
                    DepositWeight.COMMON,
                    DepositRange.NORMAL,
                    CASSITERITE_ORE,
                    CASSITERITE_ORE,
                    PYRITE_ORE
            );

    public static final Deposit COAL_DEPOSIT =
            new Deposit(
                    DepositIDs.COAL_DEPOSIT,
                    DepositShape.STANDARD,
                    DepositWeight.COMMON,
                    DepositRange.NORMAL,
                    COAL_ORE,
                    COAL_ORE,
                    LIGNITE_COAL_ORE
            );

    public static final Deposit REDSTONE_DEPOSIT =
            new Deposit(
                    DepositIDs.REDSTONE_DEPOSIT,
                    DepositShape.STANDARD,
                    DepositWeight.COMMON,
                    DepositRange.NORMAL,
                    REDSTONE_ORE,
                    REDSTONE_ORE,
                    CINNABAR
            );
}
