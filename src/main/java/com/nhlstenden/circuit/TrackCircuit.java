package com.nhlstenden.circuit;

public class TrackCircuit extends Circuit
{
    public TrackCircuit(String circuitName, String location, int length)
    {
        super(circuitName, location, length);
    }

    @Override
    public String getTrackInformation()
    {
        return "Track " + this.circuitName;
    }
}
