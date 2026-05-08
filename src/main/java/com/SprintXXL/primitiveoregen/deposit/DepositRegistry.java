package com.SprintXXL.primitiveoregen.deposit;

import net.minecraft.init.Blocks;

import static net.minecraft.init.Blocks.IRON_ORE;

public class DepositRegistry {

    public static final DepositDefinition IRON_DEPOSIT =
            new DepositDefinition(Blocks.IRON_ORE.getDefaultState(),9,4,9,3,3,3,12);
}