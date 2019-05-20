package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int num = 1;

        do
        {
            System.out.println(num);
            num++;
        } while (num <= 10);

        num = 10;

        do
        {
            System.out.println(num);
            num--;
        } while (num >= 1 && num <= 10);
    }
}
