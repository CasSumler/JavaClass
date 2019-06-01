package com.company;

public class PetNames
{
    public static void receivePetNames()
    {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("How many pets do you have?");
        int numberOfPets = input.nextInt();

        System.out.println("Please enter all of your pets' names:");

        String[] petNames = new String[numberOfPets];
        for (int index = 0; index < petNames.length; index++)
        {
            petNames[index] = input.next();
        }

        for (String petName : petNames)
        {
            System.out.println("The names of your pets are: " + petName);
        }
    }
}
