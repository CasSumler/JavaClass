package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int outerNumber = 1;

        while (outerNumber <= 5)
        {
            int innerNumber = 1;
            while (innerNumber <= outerNumber)
            {
                System.out.print(innerNumber + " ");
                innerNumber++;
            }

            System.out.println();
            outerNumber++;
        }
    }
}
