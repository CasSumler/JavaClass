package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userInput = new java.util.Scanner(System.in);

        System.out.println("Enter number here: ");
        int maxCount = userInput.nextInt();

        System.out.println("Enter increment here: ");
        int step = userInput.nextInt();

        int x = 0;

        while (x <= maxCount)
        {
            System.out.println(x);
            x = x + step;
        }
    }
}
