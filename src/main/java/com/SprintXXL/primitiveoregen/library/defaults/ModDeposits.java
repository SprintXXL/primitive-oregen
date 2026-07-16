package com.SprintXXL.primitiveoregen.library.defaults;

import com.SprintXXL.primitiveoregen.library.data.DepositDefinition;
import com.SprintXXL.primitiveoregen.library.data.DepositIDs;
import com.SprintXXL.primitiveoregen.library.util.DepositShape;
import com.SprintXXL.primitiveoregen.library.util.DepositWeight;
import com.SprintXXL.primitiveoregen.library.util.DepositRange;
import com.sprintxxl.ascentresourcerecipeindex.resources.definitions.ModResources;

public final class ModDeposits {

    private ModDeposits() {}

    public static final DepositDefinition MAGNETITE_DEPOSIT =
            new DepositDefinition(
                    DepositIDs.MAGNETITE_DEPOSIT,
                    DepositShape.STANDARD,
                    DepositWeight.COMMON,
                    DepositRange.NORMAL,
                    ModResources.MAGNETITE_ORE,
                    ModResources.MAGNETITE_ORE,
                    ModResources.GOLD_ORE
            );

    public static final DepositDefinition CHALCOPYRITE_DEPOSIT =
            new DepositDefinition(
                    DepositIDs.CHALCOPYRITE_DEPOSIT,
                    DepositShape.STANDARD,
                    DepositWeight.COMMON,
                    DepositRange.NORMAL,
                    ModResources.CHALCOPYRITE_ORE,
                    ModResources.CHALCOPYRITE_ORE,
                    ModResources.PYRITE_ORE
            );

    public static final DepositDefinition CASSITERITE_DEPOSIT =
            new DepositDefinition(
                    DepositIDs.CASSITERITE_DEPOSIT,
                    DepositShape.STANDARD,
                    DepositWeight.COMMON,
                    DepositRange.NORMAL,
                    ModResources.CASSITERITE_ORE,
                    ModResources.CASSITERITE_ORE,
                    ModResources.PYRITE_ORE
            );

    public static final DepositDefinition COAL_DEPOSIT =
            new DepositDefinition(
                    DepositIDs.COAL_DEPOSIT,
                    DepositShape.STANDARD,
                    DepositWeight.COMMON,
                    DepositRange.NORMAL,
                    ModResources.COAL_ORE,
                    ModResources.COAL_ORE,
                    ModResources.LIGNITE_COAL_ORE
            );

    public static final DepositDefinition REDSTONE_DEPOSIT =
            new DepositDefinition(
                    DepositIDs.REDSTONE_DEPOSIT,
                    DepositShape.STANDARD,
                    DepositWeight.COMMON,
                    DepositRange.NORMAL,
                    ModResources.REDSTONE_ORE,
                    ModResources.REDSTONE_ORE,
                    ModResources.CINNABAR
            );
}
