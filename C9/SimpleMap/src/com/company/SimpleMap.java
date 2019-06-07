package com.company;

import java.util.HashMap;

public class SimpleMap
{
    public void demo()
    {
        HashMap<String, String> countries = new HashMap<>();
        countries.put("USA", "United States");
        countries.put("MEX", "Mexico");
        countries.put("CAN", "Canada");

        String getKey = countries.get("USA");
        System.out.println("USA: " + getKey);

        getKey = countries.get("CAN");
        System.out.println("CAN: " + getKey);

        countries.put("USA", "United States Deux");
        getKey = countries.get("USA");
        System.out.println("USA: " + getKey);

        String removedCountry = countries.remove("USA");
        System.out.println("Removed Country: " + removedCountry);

        System.out.println(countries);


    }

}
