package com.nhlstenden.tire;

import com.nhlstenden.Identifiable;

public abstract class Tire implements Identifiable
{
    protected int kmDriven;

    /**
     * Lifespan in KM.
     */
    protected int lifeSpan;

    public Tire()
    {
        this.kmDriven = 0;
    }

    @Override
    public String getIdentifier()
    {
        return this.getClass().getName();
    }

    public boolean needsReplacement()
    {
        return this.kmDriven >= this.lifeSpan;
    }

    // TODO: Compare tires
}
