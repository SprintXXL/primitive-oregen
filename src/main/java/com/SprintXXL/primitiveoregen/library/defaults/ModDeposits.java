package com.SprintXXL.primitiveoregen.library.defaults;

import com.SprintXXL.primitiveoregen.library.data.DepositDefinition;
import com.SprintXXL.primitiveoregen.library.data.DepositIDs;
import com.SprintXXL.primitiveoregen.library.util.DepositShape;
import com.SprintXXL.primitiveoregen.library.util.DepositWeight;
import com.SprintXXL.primitiveoregen.library.util.DepositRange;
import com.SprintXXL.primitiveores.library.ModOres;

public final class ModDeposits {

    private ModDeposits() {}

    public static final DepositDefinition MAGNETITE_DEPOSIT =
            new DepositDefinition(
                    DepositIDs.MAGNETITE_DEPOSIT,
                    DepositShape.STANDARD,
                    DepositWeight.COMMON,
                    DepositRange.NORMAL,
                    ModOres.MAGNETITE,
                    ModOres.MAGNETITE,
                    ModOres.GOLD
            );

    public static final DepositDefinition CHALCOPYRITE_DEPOSIT =
            new DepositDefinition(
                    DepositIDs.CHALCOPYRITE_DEPOSIT,
                    DepositShape.STANDARD,
                    DepositWeight.COMMON,
                    DepositRange.NORMAL,
                    ModOres.CHALCOPYRITE,
                    ModOres.CHALCOPYRITE,
                    ModOres.PYRITE
            );

    public static final DepositDefinition CASSITERITE_DEPOSIT =
            new DepositDefinition(
                    DepositIDs.CASSITERITE_DEPOSIT,
                    DepositShape.STANDARD,
                    DepositWeight.COMMON,
                    DepositRange.NORMAL,
                    ModOres.CASSITERITE,
                    ModOres.CASSITERITE,
                    ModOres.PYRITE
            );

    public static final DepositDefinition COAL_DEPOSIT =
            new DepositDefinition(
                    DepositIDs.COAL_DEPOSIT,
                    DepositShape.STANDARD,
                    DepositWeight.COMMON,
                    DepositRange.NORMAL,
                    ModOres.COAL,
                    ModOres.COAL,
                    ModOres.LIGNITE_COAL
            );

    public static final DepositDefinition REDSTONE_DEPOSIT =
            new DepositDefinition(
                    DepositIDs.REDSTONE_DEPOSIT,
                    DepositShape.STANDARD,
                    DepositWeight.COMMON,
                    DepositRange.NORMAL,
                    ModOres.REDSTONE,
                    ModOres.REDSTONE,
                    ModOres.CINNABAR
            );
}
