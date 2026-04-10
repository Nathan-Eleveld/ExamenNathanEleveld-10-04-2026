package com.nhlstenden.ontour;

public class TicketService
{
    private TourManager tourManager;

    public TicketService(TourManager tourManager)
    {
        this.setTourManager(tourManager);
    }

    public TourManager getTourManager()
    {
        return this.tourManager;
    }

    public void setTourManager(TourManager tourManager)
    {
        if (tourManager == null)
        {
            throw new IllegalArgumentException();
        }

        this.tourManager = tourManager;
    }

    public boolean isExisting(Concert concert)
    {
        if (concert == null)
        {
            return false;
        }

        return true;
    }
}
