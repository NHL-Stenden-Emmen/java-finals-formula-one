package com.nhlstenden.team;

import com.nhlstenden.tire.Tire;

import java.util.ArrayList;

public class TireArrayList extends ArrayList<Tire>
{
    // TODO: Make a unit test
    // Only four
    // Same tire type

    @Override
    public boolean add(Tire tire)
    {
        // We only accept four tires
        if (this.size() >= 4)
        {
            return false;
        }

        return super.add(tire);
    }

    private boolean hasTires()
    {
        // Check if there are tires
        // Yes: check if types are equal
        // No: Just add the tire

        return !this.isEmpty();
    }

    private boolean areTiresOfEqualType()
    {
        // TODO: Finish compare method, then finish this method
        return false;
    }
}
