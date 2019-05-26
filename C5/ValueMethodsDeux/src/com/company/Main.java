package com.company;

public class Main
{

    public static void main(String[] args)
    {
        String myFancyName = getMyFancyName("$$$");

        int total = getTotal(10, 20);
        System.out.println(total);
        total = getTotal(5, 4);
        System.out.println(total);
        total = getTotal(12, 12);
        System.out.println(total);

        int ifHigher = max(50, 30);
        System.out.println(ifHigher);
        ifHigher = max(30, 60);
        System.out.println(ifHigher);
        ifHigher = max(25, 25);
        System.out.println(ifHigher);

        boolean one = isThunderdome(2, 1);
        System.out.println(one);
        one = isThunderdome(1, 2);
        System.out.println(one);
        one = isThunderdome(2, 2);
        System.out.println(one);
    }

    private static String getMyFancyName(String decoration)
    {
        String myName = "Cassi";
        System.out.println(decoration + myName + decoration);
        return myName;
    }

    private static int getTotal(int firstNumber, int secondNumber)
    {
        int sum = firstNumber + secondNumber;
        return sum;
    }

    private static int max(int first, int second)
    {
        if (first > second)
        {
            return first;
        }
        else if (second > first)
        {
            return second;
        }
        else if (first == second)
        {}
        return first;
    }

    private static boolean isThunderdome(int enteredCount, int leavingCount)
    {
        if (enteredCount == 2 && leavingCount == 1)
        {
            return true;
        }
        else
        {}
        return false;
    }
}
