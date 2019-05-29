package com.company;

public class Date
{
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay()
    {
        return day;
    }

    public int getMonth()
    {
        return month;
    }

    public int getYear()
    {
        return year;
    }

    public String getFormattedDate()
    {
        if (month < 10 && day < 10)
        {
            return year + "-" + "0" + month + "-" + "0" + day;
        }
        else if (month < 10)
        {
            return year + "-" + "0" + month + "-" + day;
        }
        else if (day < 10)
        {
            return year + "-" + month + "-" + "0" + day;
        }

        return year + "-" + month + "-" + day;
    }
}
