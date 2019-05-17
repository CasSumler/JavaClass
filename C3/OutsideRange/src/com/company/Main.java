package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int x = -1;
        boolean insideRange =  x >= 0 && x <= 11;
        boolean outsideRange = !insideRange;

        System.out.println(outsideRange);

        x = 0;
        insideRange = x >= 0 && x <= 11;
        outsideRange = !insideRange;

        System.out.println(outsideRange);

        x = 1;
        insideRange = x >= 0 && x <= 11;
        outsideRange = !insideRange;

        System.out.println(outsideRange);

        x = 10;
        insideRange = x >= 0 && x <= 11;
        outsideRange = !insideRange;

        System.out.println(outsideRange);

        x = 11;
        insideRange = x >= 0 && x <= 11;
        outsideRange = !insideRange;

        System.out.println(outsideRange);

        x = 12;
        insideRange = x >= 0 && x <= 11;
        outsideRange = !insideRange;

        System.out.println(outsideRange);
    }
}
