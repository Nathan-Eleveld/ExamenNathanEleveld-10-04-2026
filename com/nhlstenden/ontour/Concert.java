package com.nhlstenden.ontour;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Concert
{
    private final int DEFAULT_TICKET_PRICE_IN_EUROS = 50;
    private final int MINIMUM_PRICE = 1;

    private Artist artist;
    private Venue venue;
    private LocalDate date;
    private List<Ticket> soldTickets;
    private int priceInEuro;
    private LocalDate currentDate;

    public Concert(Artist artist, Venue venue, LocalDate date)
    {
        this.setArtist(artist);
        this.setVenue(venue);
        this.setDate(date);

        soldTickets = new ArrayList<>();
    }

    public Artist getArtist()
    {
        return this.artist;
    }

    public void setArtist(Artist artist)
    {
        this.artist = artist;
    }

    public Venue getVenue()
    {
        return this.venue;
    }

    public void setVenue(Venue venue)
    {
        this.venue = venue;
    }

    public LocalDate getDate()
    {
        return this.date;
    }

    public void setDate(LocalDate date)
    {
        this.date = date;
    }

    public List<Ticket> getSoldTickets()
    {
        return this.soldTickets;
    }

    public void setSoldTickets(List<Ticket> soldTickets)
    {
        this.soldTickets = soldTickets;
    }

    public int getPriceInEuro()
    {
        return this.priceInEuro;
    }

    public void setPriceInEuro(int priceInEuro)
    {
        if (priceInEuro < 0)
        {
            throw new IllegalArgumentException();
        }

        this.priceInEuro = priceInEuro;
    }

    public boolean hasOccured()
    {
        return getDate().isAfter(currentDate);
    }

    public void addTicket(Ticket ticket)
    {
        soldTickets.add(ticket);
    }

    public void removeTicket(Ticket ticket)
    {
        soldTickets.remove(ticket);
    }

    public int getAmountOfTickets()
    {
        return soldTickets.size();
    }

    public double getRevenueInEuro()
    {
        return soldTickets.size() * getPriceInEuro();
    }

    public boolean isSoldOut()
    {
        if (soldTickets.size() >= venue.getMaxCapacity())
        {
            return true;
        }

        return false;
    }
}
