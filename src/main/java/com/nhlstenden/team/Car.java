package com.nhlstenden.team;

import com.nhlstenden.Identifiable;
import com.nhlstenden.tire.HardTire;

public class Car implements Identifiable
{
    private int carNumber;
    private TireArrayList tires;

    public Car(int carNumber)
    {
        this.carNumber = carNumber;
        this.tires = new TireArrayList();

        for (int i = 0; i < 4; i++)
        {
            this.tires.add(new HardTire());
        }
    }

    /**
     * Replace the tires of the car.
     * @param newTires The new tires to put on the car.
     * @return The tires that are removed from the car.
     */
    public TireArrayList changeTires(TireArrayList newTires)
    {
        TireArrayList oldTires = this.tires;
        this.tires = newTires;

        return oldTires;
    }

    @Override
    public String getIdentifier()
    {
        return String.valueOf(this.carNumber);
    }
}
