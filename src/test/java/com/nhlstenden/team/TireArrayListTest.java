package com.nhlstenden.team;

import com.nhlstenden.tire.IntermediateTire;
import com.nhlstenden.tire.MediumTire;
import com.nhlstenden.tire.SoftTire;
import com.nhlstenden.tire.WetTire;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TireArrayListTest
{
    private TireArrayList tires;

    @BeforeEach
    void setup()
    {
        this.tires = new TireArrayList();
    }

    @Test
    void addSingleTire_shouldAddTireToList()
    {
        assertTrue(this.tires.add(new MediumTire()));
    }

    @Test
    void addFiveTires_shouldNotAddFifthTire()
    {
        for (int i = 0; i < 4; i++)
        {
            assertTrue(this.tires.add(new WetTire()));
        }

        assertFalse(this.tires.add(new WetTire()));
    }

    @Test
    void addTwoDifferentTires_shouldNotAddSecondTire()
    {
        assertTrue(this.tires.add(new SoftTire()));
        assertFalse(this.tires.add(new IntermediateTire()));
    }
}