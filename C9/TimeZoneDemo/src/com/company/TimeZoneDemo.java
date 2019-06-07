package com.company;

import java.sql.SQLOutput;
import java.util.HashMap;

public class TimeZoneDemo
{
    private HashMap<String, Integer> timeZones = new HashMap<>();

    public void demo()
    {
        timeZones.put("EST", -5);
        timeZones.put("CST", -6);
        timeZones.put("MST", -7);
        timeZones.put("PST", -8);
        timeZones.put("GMT", 0);

        int timeZoneDifference = getTimeDiff("PST", "EST");
        System.out.println("PST and EST difference: " + timeZoneDifference);

        timeZoneDifference = getTimeDiff("PST", "MST");
        System.out.println("PST and MST difference: " + timeZoneDifference);

        timeZoneDifference = getTimeDiff("CST", "PST");
        System.out.println("CST and PST difference: " + timeZoneDifference);

    }

    public int getTimeDiff(String timeZone1, String timeZone2)
    {
        int firstTimeZoneValue = timeZones.get(timeZone1);
        int secondTimeZoneValue = timeZones.get(timeZone2);

        return firstTimeZoneValue - secondTimeZoneValue;
    }
}
