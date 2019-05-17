package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int x = 0;
        boolean b1 = x >= 0;
        boolean b2 = x <= 6;
        System.out.println(b1 && b2);

        x = 1;
        b1 = x >= 0;
        b2 = x <= 6;
        System.out.println(b1 && b2);

        x = 4;
        b1 = x >= 0;
        b2 = x <= 6;
        System.out.println(b1 && b2);

        x = 5;
        b1 = x >= 0;
        b2 = x <= 6;
        System.out.println(b1 && b2);

        x = 6;
        b1 = x >= 0;
        b2 = x <= 6;
        System.out.println(b1 && b2);

        x = 10;
        b1 = x >= 0;
        b2 = x <= 6;
        System.out.println(b1 && b2);
    }
}
