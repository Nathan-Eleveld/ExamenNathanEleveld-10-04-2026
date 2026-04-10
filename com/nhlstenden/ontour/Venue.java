package com.nhlstenden.ontour;

public class Venue
{
    private final int MINIMUM_CAPACITY = 0;

    private String name;
    private String city;
    private int maxCapacity;

    public Venue(String name, String city, int maxCapacity)
    {
        this.setName(name);
        this.setCity(city);
        this.setMaxCapacity(maxCapacity);
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        if (name == null || name == "")
        {
            throw new IllegalArgumentException();
        }

        this.name = name;
    }

    public String getCity()
    {
        return this.city;
    }

    public void setCity(String city)
    {
        if (city == null || city == "")
        {
            throw new IllegalArgumentException();
        }

        this.city = city;
    }

    public int getMaxCapacity()
    {
        return this.maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity)
    {
        if (maxCapacity < 0)
        {
            throw new IllegalArgumentException();
        }

        this.maxCapacity = maxCapacity;
    }
}
