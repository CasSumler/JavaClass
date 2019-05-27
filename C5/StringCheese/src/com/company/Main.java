package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner input = new java.util.Scanner(System.in);

        boolean keepRunning = true;

        do
        {
            System.out.println("Which cheese would the customer like to buy?");
            int cheese = input.nextInt();

            System.out.println("How many yards would the customer like to buy?");
            int yards = input.nextInt();

            switch(cheese)
            {
                case 1:
                    calculateOrder(cheese, yards);
                    break;
                case 2:
                    calculateOrder(cheese, yards);
                    break;
                case 3:
                    calculateOrder(cheese, yards);
                    break;
                default:
                    System.out.println("That order is too crazy!");
            }

        } while (keepRunning);

    }

    private static int calculateOrder(int cheese, int yards)
    {
        java.util.Scanner input = new java.util.Scanner(System.in);

        int costCheese;
        int shippingCharge;

        if (cheese == 1)
        {
            costCheese = 2;
            shippingCharge = 2;
            if (yards > 50)
            {
                shippingCharge = 0;
            }
            int orderTotal = ((costCheese * yards) + (shippingCharge * yards) + 5);
            System.out.println("The total of the order is: $" + orderTotal + ".");
        }
        else if (cheese == 2)
        {
            costCheese = 4;
            shippingCharge = 2;
            if (yards > 75)
            {
                shippingCharge = 0;
            }
            int orderTotal = ((costCheese * yards) + (shippingCharge * yards) + 5);
            System.out.println("The total of the order is: $" + orderTotal + ".");
        }
        else if (cheese == 3)
        {
            costCheese = 6;
            shippingCharge = 4;
            if (yards > 25)
            {
                shippingCharge = 0;
            }
            int orderTotal = ((costCheese * yards) + (shippingCharge * yards) + 5);
            System.out.println("The total of the order is: $" + orderTotal + ".");
        }

        return yards;
    }
}
