package com.company;

public class Main
{

    public static void main(String[] args)
    {
        String firstString = "java";
        String secondString = "java";
        String thirdString = new String("java");

        if (firstString == secondString)
        {
            System.out.println("firstString == secondString");
        }

        if (firstString == thirdString)
        {
            System.out.println("firstString == thirdString");
        }

        if (firstString.equals(secondString))
        {
            System.out.println("firstString equals secondString");
        }

        if (firstString.equals(thirdString))
        {
            System.out.println("firstString equals thirdString");
        }
    }
}
