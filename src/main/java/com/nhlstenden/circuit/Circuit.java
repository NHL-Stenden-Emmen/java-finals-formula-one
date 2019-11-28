package com.nhlstenden.circuit;

import com.nhlstenden.Identifiable;

public abstract class Circuit implements Identifiable
{
    protected String circuitName;
    private String location;
    private int length; // In meters

    public Circuit(String circuitName, String location, int length)
    {
        this.circuitName = circuitName;
        this.location = location;
        this.length = length;
    }

    public String getCircuitName()
    {
        return circuitName;
    }

    public void setCircuitName(String circuitName)
    {
        this.circuitName = circuitName;
    }

    public String getLocation()
    {
        return location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    public int getLength()
    {
        return length;
    }

    public void setLength(int length)
    {
        this.length = length;
    }

    @Override
    public String getIdentifier()
    {
        return this.circuitName;
    }

    public abstract String getTrackInformation();
}
