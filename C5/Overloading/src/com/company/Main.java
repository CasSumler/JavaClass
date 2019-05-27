package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int total = absoluteSum(10, -20);
        System.out.println(total);
        total = absoluteSum(0, -1);
        System.out.println(total);
        total = absoluteSum(-12, 12);
        System.out.println(total);

        total = absoluteSum(10, -20, -30);
        System.out.println(total);
        total = absoluteSum(-15, -15, -15);
        System.out.println(total);
        total = absoluteSum(-5, 10, -15);
        System.out.println(total);
    }

    private static int absoluteSum(int a, int b)
    {
        int sum = Math.abs(a) + Math.abs(b);

        return sum;
    }

    private static int absoluteSum(int a, int b, int c)
    {
        int sum = Math.abs(a) + Math.abs(b) + Math.abs(c);

        return sum;
    }
}
