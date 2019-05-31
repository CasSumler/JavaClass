package com.company;

public class ArrayUtil
{
    public static void printArray(int[] values)
    {
        int index = 0;
        while (index < values.length)
        {
            System.out.println(values[index]);
            index++;
        }

        /*for (int value : values)          //or use this for method
        {
            System.out.println(value);
        }*/
    }

    public static int arrayTotal(int[] values)
    {
        int total = 0;
        int array = 0;
        while (array < values.length)
        {
            total = total + values[array];
            array++;
        }
        return total;

        /*for (int value : values)          //or use this for while
        {
            total += value;
        }*/
    }

    public static int arrayMax(int[] values)
    {
        int maxSoFar = values[0];
        for (int value : values)
        {
            if (value > maxSoFar)
            {
                maxSoFar = value;
            }
        }
        return maxSoFar;
    }

    public static int arrayMaxIndex(int[] values)
    {
        int maxSoFar = values[0];
        int currentIndex = 0;
        int maxIndex = 0;

        for (int value : values)
        {
            if (value > maxSoFar)
            {
                maxSoFar = value;
                maxIndex = currentIndex;
            }

            currentIndex++;
        }

        return maxIndex;
    }

    public static double arrayAverage(double[] values)
    {
        double total = 0;

        for (double value : values)
        {
            total += value;
        }
        double average = total / values.length;
        return average;
    }

    public static void printArray(String[] values)
    {
        for (String value : values)
        {
            System.out.println(value);
        }
    }

}
