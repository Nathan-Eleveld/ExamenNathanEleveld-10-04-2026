package com.nhlstenden.ontour;

public class Artist
{
    private String name;
    private String genre;

    public Artist(String name, String genre)
    {
        this.setName(name);
        this.setGenre(genre);
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

    public String getGenre()
    {
        return this.genre;
    }

    public void setGenre(String genre)
    {
        if (genre == null || genre == "")
        {
            throw new IllegalArgumentException();
        }

        this.genre = genre;
    }
}
