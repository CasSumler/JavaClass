package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int count = 0;

        while (count <= 100)
        {
            System.out.println(count);
            count = count + 10;
        }

        count = 100;
        while (count >= 0)
        {
            System.out.println(count);
            count = count - 10;
        }
    }
}
