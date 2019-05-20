package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int max = 5;

        System.out.print("   ");

        int columnHeader = 1;
        while(columnHeader <= max)
        {
            System.out.printf("  %2d", columnHeader);
            columnHeader++;
        }
        System.out.println();

        System.out.print("   -");
        columnHeader = 1;
        while (columnHeader <= max)
        {
            System.out.print("----");
            columnHeader++;
        }

        System.out.println();
        int rowNumber = 1;

        while (rowNumber <= max)
        {

            int columnNumber = 1;
            System.out.print(rowNumber + " |");

            while (columnNumber <= max)
            {
                System.out.printf("  %2d", rowNumber * columnNumber);
                columnNumber++;
            }
            System.out.println();
            rowNumber++;
        }
    }
}
