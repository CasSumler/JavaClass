package com.company;

public class Main
{

    public static void main(String[] args)
    {
        //Arrays
        int[] practice = new int[3];
        practice[0] = 1;
        practice[1] = 5;
        practice[2] = 9;

        ArrayUtil.printArray(practice);

        //Print Int
        int[] practice2 = new int[5];
        practice2[0] = 5;
        practice2[1] = 2;
        practice2[2] = 9;
        practice2[3] = 8;
        practice2[4] = 0;

        ArrayUtil.printArray(practice2);

        //Total
        System.out.println("Total: ");
        int total = ArrayUtil.arrayTotal(practice);
        System.out.println("The total of this array is: " + total);
        int total2 = ArrayUtil.arrayTotal(practice2);
        System.out.println("The total of this array is: " + total2);

        //Max
        System.out.println("Max: ");
        int max = ArrayUtil.arrayMax(practice);
        System.out.println("The max number of this array is: "+ max);
        int max2 = ArrayUtil.arrayMax(practice2);
        System.out.println("The max number of this array is: " + max2);

        int[] practice3 = {5, 8, 21, 19};       //shorthand of practice and practice2
        int max3 = ArrayUtil.arrayMax(practice3);
        System.out.println("The max number of this array is: " + max3);

        int[] practice4 = {-1, -5, -3};         //shorthand of practice and practice2
        int max4 = ArrayUtil.arrayMax(practice4);
        System.out.println("The max number of this array is: " + max4);

        //Max Index
        System.out.println("Print Max Index: ");
        int[] practice5 = {5, 8, 21, 19, 2};
        int firstMaxIndex = ArrayUtil.arrayMaxIndex(practice5);
        System.out.println("The max index is: " + firstMaxIndex);
        int[] practice6 = {78, 23, 9, 34};
        int secondMaxIndex = ArrayUtil.arrayMaxIndex(practice6);
        System.out.println("The max index is: " + secondMaxIndex);


        //Average
        System.out.println("Print Average: ");
        double[] pratice7 = {34.2, 18.0, 12.5, 13.1};
        double average = ArrayUtil.arrayAverage(pratice7);
        System.out.println("The average is: " + average);

        double[] practice8 = {10.0, 15.0, 20.0};
        double average2 = ArrayUtil.arrayAverage(practice8);
        System.out.println("The average is: " + average2);

        //Print Int Part Deux
        int[] printInt2 = new int[10];
        printInt2[0] = 4;
        printInt2[3] = 2;
        printInt2[9] = 4;

        System.out.println("Print Int Part Deux: ");
        ArrayUtil.printArray(printInt2);

        //Print String
        String[] firstStringArray = new String[10];
        firstStringArray[0] = "Hi";
        firstStringArray[3] = "Hello";
        firstStringArray[9] = "Bye";

        System.out.println("Print String: ");
        ArrayUtil.printArray(firstStringArray);

    }
}
