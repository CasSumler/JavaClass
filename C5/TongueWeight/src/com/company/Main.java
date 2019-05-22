package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userInput = new java.util.Scanner(System.in);

        System.out.println("Please enter the trailer weight: " );
        double trailerWeight = userInput.nextDouble();

        System.out.println("Please enter the cargo weight: ");
        double cargoWeight = userInput.nextDouble();

        printRange(trailerWeight, cargoWeight);
    }

    private static void printRange(double trailerWeight, double cargoWeight)
    {
        double totalWeight = trailerWeight + cargoWeight;
        double minTongueWeight = totalWeight * 0.09;
        double maxTongueWeight = totalWeight * 0.15;

        System.out.println("The minimum tongue weight allowed is: " + minTongueWeight + " pounds.");
        System.out.println("The maximum tongue weight allowed is: " + maxTongueWeight + " pounds.");
    }


}
