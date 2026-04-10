package com.nhlstenden.ontour;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TourManager
{
    private String name;
    private int maxAmountOfArtists;
    private List<Artist> artists;
    private List<Venue> venues;
    private List<Concert> concerts;

    public TourManager(String name, int maxAmountOfArtists)
    {
        this.setName(name);
        this.setMaxAmountOfArtists(maxAmountOfArtists);

        artists = new ArrayList<>();
        venues = new ArrayList<>();
        concerts = new ArrayList<>();
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

    public int getMaxAmountOfArtists()
    {
        return this.maxAmountOfArtists;
    }

    public void setMaxAmountOfArtists(int maxAmountOfArtists)
    {
        this.maxAmountOfArtists = maxAmountOfArtists;
    }

    public List<Artist> getArtists()
    {
        return this.artists;
    }

    public void setArtists(List<Artist> artists)
    {
        if (artists.isEmpty() || artists.size() > getMaxAmountOfArtists())
        {
            throw new IllegalArgumentException();
        }

        this.artists = artists;
    }

    public List<Venue> getVenues()
    {
        return this.venues;
    }

    public void setVenues(List<Venue> venues)
    {
        if (venues == null)
        {
            throw new IllegalArgumentException();
        }

        this.venues = venues;
    }

    public List<Concert> getConcerts()
    {
        return this.concerts;
    }

    public void setConcerts(List<Concert> concerts)
    {
        if (concerts == null)
        {
            throw new IllegalArgumentException();
        }

        this.concerts = concerts;
    }

    public void addArtist(Artist artist)
    {
        artists.add(artist);
    }

    public void addVenue(Venue venue)
    {
        venues.add(venue);
    }

    public void addConcert(Concert concert)
    {
        concerts.add(concert);
    }

}
