package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userInput = new java.util.Scanner(System.in);

        System.out.println("Please enter your number: ");
        int number = userInput.nextInt();

        if (number == 1)
        {
            System.out.println("Here is your water.");
        }
        else if (number == 2)
        {
            System.out.println("Here is you cola.");
        }
        else if (number == 3)
        {
            System.out.println("Please enter your age: ");
            int age = userInput.nextInt();

            int years = 21 - age;

            if (age == 20)
            {
                System.out.println("No drink for you! Come back in " + years + " year!");
            }
            else if (age >= 21)
            {
                System.out.println("Here is your Ale.");
            }
            else if (age < 21)
            {
                System.out.println("No drink for you! Come back in " + years + " years!");
            }
        }
    }
}
