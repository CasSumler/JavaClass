package com.company;

import java.util.ArrayList;

public class SimpleList
{
    public void demo()
    {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Orange");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Blue");

        int index = 0;
        while (index < colors.size())
        {
            System.out.println(colors.get(index));
            index++;
        }

        for (index = 0; index < colors.size(); index++)
        {
            System.out.println(colors.get(index));
        }

        for (String color : colors)
        {
            System.out.println(color);
        }
    }
}
