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

        // Check if car has tires
        if (this.hasTires())
        {
            // We have tires!
            Tire currentTire = this.get(0);

            // Check if tires are compatible
            if (this.areTiresOfEqualType(tire, currentTire))
            {
                // Yes, add them to my collection
                return super.add(tire);
            }

            // Not compatible, so don't add it
            return false;
        }

        // We have no tires, so add them
        return super.add(tire);
    }

    private boolean hasTires()
    {
        // Check if there are tires
        // Yes: check if types are equal
        // No: Just add the tire

        return !this.isEmpty();
    }

    private boolean areTiresOfEqualType(Tire newTire, Tire oldTire)
    {
        return newTire.getIdentifier().contentEquals(oldTire.getIdentifier());
    }
}
