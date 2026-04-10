package com.nhlstenden.ontour;

public class Ticket
{
    private String code;

    public Ticket(String code)
    {
        this.setCode(code);
    }

    public String getCode()
    {
        return this.code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }
}
