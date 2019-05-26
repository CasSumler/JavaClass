package com.company;

public class Main
{

    public static void main(String[] args)
    {
        printSum(4, 6);
        printSum(7, 2);
        printSum(1,2,3,4,5);
    }

    private static void printSum(int a, int b)
    {
        int sum = a + b;
        System.out.println("The sum is: " + sum);
    }

    private static void printSum(int a, int b, int c, int d, int e)
    {
        int sum = a + b + c + d + e;
        System.out.println("The sum is: " + sum);
    }
}
