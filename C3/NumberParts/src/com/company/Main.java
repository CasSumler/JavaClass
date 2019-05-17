package com.company;

public class Main
{

    public static void main(String[] args)
    {
        double a = 3.25;

        int b = (int)a;
        double c = a - b;

        System.out.println("Whole part: " + b);
        System.out.println("Fractional part: " + c);
    }
}
