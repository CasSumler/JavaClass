package com.company;

public class Main
{

    public static void main(String[] args)
    {
        printHeader();

        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("Enter your birth year: ");
        int birthYear = input.nextInt();

        System.out.println("Enter your first name: ");
        String firstName = input.next();

        System.out.println("Enter your last name: ");
        String lastName = input.next();

        System.out.println("Enter your 5 digit employee number: ");
        int employeeNumber = input.nextInt();

        printName(firstName, lastName);
        printAge(birthYear);
        printEvenOrOdd(employeeNumber);
        printGeneratedSecretPassword(employeeNumber);
    }

    private static void printHeader()
    {
        System.out.println("Welcome to the WallabyTech Employee Application");
        System.out.println("===============================================");
    }

    private static void printName(String firstName, String lastName)
    {
        System.out.println(lastName + ", " + firstName);
    }

    private static void printAge(int birthYear)
    {
        int age = 2019 - birthYear;
        System.out.println("Your age is: " + age);
    }

    private static void printEvenOrOdd(int employeeNumber)
    {
        if (employeeNumber % 2 == 0)
        {
            System.out.println("Employee number is even: true");
        }
        else
        {
            System.out.println("Employee number is even: false");
        }
    }

    private static void printGeneratedSecretPassword(int employeeNumber)
    {
        java.util.Random random = new java.util.Random();
        int randomNumber = random.nextInt(10) + 1;

        int password = (employeeNumber + randomNumber) * 5;

        System.out.println("Employee's random secret password is: " + password);
    }
}