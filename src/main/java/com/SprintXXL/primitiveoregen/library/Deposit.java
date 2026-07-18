package com.SprintXXL.primitiveoregen.library;

import com.SprintXXL.primitiveoregen.library.util.DepositShape;
import com.SprintXXL.primitiveoregen.library.util.DepositWeight;
import com.SprintXXL.primitiveoregen.library.util.DepositRange;
import com.sprintxxl.ascenthub.definitions.AscentDefinition;
import com.sprintxxl.ascentresourcerecipeindex.resources.AscentResource;

public class Deposit implements AscentDefinition {

    private final String id;
    private final DepositShape shape;
    private final DepositWeight weight;
    private final DepositRange range;
    private final AscentResource primaryOre;
    private final AscentResource secondaryOre;
    private final AscentResource traceOre;

    public Deposit(
            String id,
            DepositShape shape,
            DepositWeight weight,
            DepositRange range,
            AscentResource primaryOre,
            AscentResource secondaryOre,
            AscentResource traceOre
    ) {
        this.id = id;
        this.shape = shape;
        this.weight = weight;
        this.range = range;
        this.primaryOre = primaryOre;
        this.secondaryOre = secondaryOre;
        this.traceOre = traceOre;
    }

    @Override
    public String getID() {
        return id;
    }

    public DepositShape getShape() {
        return shape;
    }

    public DepositWeight getWeight() {
        return weight;
    }

    public DepositRange getRange() {
        return range;
    }

    public AscentResource getPrimaryOre() {
        return primaryOre;
    }

    public AscentResource getSecondaryOre() {
        return secondaryOre;
    }

    public AscentResource getTraceOre() {
        return traceOre;
    }
}