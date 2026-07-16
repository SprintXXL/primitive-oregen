package com.SprintXXL.primitiveoregen.library.data;

import com.SprintXXL.primitiveoregen.library.util.DepositShape;
import com.SprintXXL.primitiveoregen.library.util.DepositWeight;
import com.SprintXXL.primitiveoregen.library.util.DepositRange;
import com.sprintxxl.ascentresourcerecipeindex.resources.Resource;

public class DepositDefinition {

    private final String id;
    private final DepositShape shape;
    private final DepositWeight weight;
    private final DepositRange range;
    private final Resource primaryOre;
    private final Resource secondaryOre;
    private final Resource traceOre;

    public DepositDefinition(
            String id,
            DepositShape shape,
            DepositWeight weight,
            DepositRange range,
            Resource primaryOre,
            Resource secondaryOre,
            Resource traceOre
    ) {
        this.id = id;
        this.shape = shape;
        this.weight = weight;
        this.range = range;
        this.primaryOre = primaryOre;
        this.secondaryOre = secondaryOre;
        this.traceOre = traceOre;
    }

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

    public Resource getPrimaryOre() {
        return primaryOre;
    }

    public Resource getSecondaryOre() {
        return secondaryOre;
    }

    public Resource getTraceOre() {
        return traceOre;
    }
}