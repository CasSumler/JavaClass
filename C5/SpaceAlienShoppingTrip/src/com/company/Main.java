package com.company;

public class Main
{

    public static void main(String[] args)
    {
        printHello();
        goShopping();
        goShopping();
        goShopping();
        printGoodbye();
    }

    private static void printHello()
    {
        System.out.println("Hello, earthlings!");
    }

    private static void printGoodbye()
    {
        System.out.println("Goodbye, earthlings!");
    }

    private static void goShopping()
    {
        System.out.println("Shopping like it's 1999!");
    }
}
