package com.company;

public class Main
{

    public static void main(String[] args)
    {
        double cargoVolume = getCargoVolume(10.5, 12.5, 15.5, true);
        System.out.println("The cargo volume is: " + cargoVolume);
    }

    private static double getCargoVolume(double height, double length, double depth, boolean heavyDuty)
    {
        double materialThickness = 0.25;

        if (heavyDuty)
        {
            materialThickness = materialThickness * 2;
        }

        double interiorVolume = (height - (materialThickness * 2)) * (length - (materialThickness * 2)) * (depth - (materialThickness * 2));

        return interiorVolume;
    }
}
