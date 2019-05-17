package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userInput = new java.util.Scanner(System.in);

        System.out.println("Please enter height here: ");
        int height = userInput.nextInt();

        if (height <= 36)
        {
            System.out.println("Red band");
        }
        else if (height > 36 && height < 54)
        {
            System.out.println("Yellow band");
        }
        else if (height >= 54 && height <= 80)
        {
            System.out.println("Green band");
        }
        else if (height > 80)
        {
            System.out.println("no band");
        }
    }
}
