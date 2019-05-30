package com.company;

public class StringUtil
{

    public static char getFirstCharacter(String text)
    {
        char firstCharacter = text.charAt(0);
        return firstCharacter;
    }

    public static char getLastCharacter(String text)
    {
        char lastCharacter = text.charAt(text.length() - 1);
        return lastCharacter;
    }

    public static String getFirstTwoCharacters(String text)
    {
        String firstTwo = text.substring(0, 2);
        return firstTwo;
    }

    public static String getLastTwoCharacters(String text)
    {
        String lastTwo = text.substring(text.length() - 2);
        return lastTwo;
    }

    public static String getAllButFirstThreeCharacters(String text)
    {
        String allButFirstThree = text.substring(3);
        return allButFirstThree;
    }

    public static String getEveryOtherCharacter(String text)
    {
        String answer = "";
        int index = 0;

        while (index < text.length())
        {
            char currentChar = text.charAt(index);
            answer += currentChar;
            index += 2;
        }

        return answer;
    }

    public static void printCharacters(String text)
    {
        int index = 0;

        while (index < text.length())
        {
            System.out.println(text.charAt(index) + ":" + index);
            index++;
        }
    }

    public static String printPhoneNumber(String text)
    {
        return "Area Code: " + text.substring(0, 3) + "  Exchange: " + text.substring(4, 7) + "  Line Number: " + text.substring(8, 12);
    }

    public static int findFirstE(String text)
    {
        return text.indexOf('e');
    }

    public static boolean isFinn(String text)
    {
        String text2 = "Finn";

        if (text.equals(text2))
        {
            return true;
        }
        return false;
    }


}
