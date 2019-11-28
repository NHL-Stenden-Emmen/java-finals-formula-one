package com.nhlstenden.circuit;

public class StreetCircuit extends Circuit
{
    public StreetCircuit(String circuitName, String location, int length)
    {
        super(circuitName, location, length);
    }

    @Override
    public String getTrackInformation()
    {
        return "Straatcircuit " + this.circuitName;
    }
}
