package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int x = 1;

        while (x <= 200)
        {
            if (x % 11 == 0)
            System.out.println("The number " + x + " is evenly divisible by 11.");
            x++;
        }
    }
}
