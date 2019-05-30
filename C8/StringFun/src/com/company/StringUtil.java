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

    public static void printPhoneNumber(String text)
    {
        String decodedPhoneNumber = decodedPhoneNumber(text);

        int startAreaCodeIndex = 0;
        int startExchangeIndex = 4;
        int startLineIndex = 8;

        if (decodedPhoneNumber.length() == 10)
        {
            startExchangeIndex = 3;
            startLineIndex = 6;
        }

        String areaCode = decodedPhoneNumber.substring(startAreaCodeIndex, startAreaCodeIndex + 3);
        String exchange = decodedPhoneNumber.substring(startExchangeIndex, startExchangeIndex + 3);
        String lineNumber = decodedPhoneNumber.substring(startLineIndex);

        System.out.print("Area Code: " + areaCode + "   ");
        System.out.print("Exchange: " + exchange + "   ");
        System.out.println("Line Number: " + lineNumber);
    }

    public static String decodedPhoneNumber(String text)
    {
        String decodedPhoneNumber = "";

        int index = 0;
        while (index < text.length())
        {
            char digit = text.charAt(index);
            decodedPhoneNumber += decodedPhoneDigit(digit);
            index++;
        }

        return decodedPhoneNumber;
    }

    public static String decodedPhoneDigit(char text)
    {
        String decodedValue;
        switch (text)
        {
            case 'A':
            case 'B':
            case 'C':
                decodedValue = "2";
                break;
            case 'D':
            case 'E':
            case 'F':
                decodedValue = "3";
                break;
            case 'G':
            case 'H':
            case 'I':
                decodedValue = "4";
                break;
            case 'J':
            case 'K':
            case 'L':
                decodedValue = "5";
                break;
            case 'M':
            case 'N':
            case 'O':
                decodedValue = "6";
                break;
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
                decodedValue = "7";
                break;
            case 'T':
            case 'U':
            case 'V':
                decodedValue = "8";
                break;
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                decodedValue = "9";
                break;
            default:
                decodedValue = "" + text;

        }
        return decodedValue;
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
