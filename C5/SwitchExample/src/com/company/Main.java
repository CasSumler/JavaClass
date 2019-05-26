package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("Enter last name here: ");
        String lastName = input.next();

        switch (lastName)
        {
            case "Smith":
            case "Jones":
                System.out.println("Grand Winner!");
                break;
            case "Lazenby":
                System.out.println("Hey, he owes me dinner.");
                break;
            default:
                System.out.println("Sorry, not a winner.");

        }
    }
}
