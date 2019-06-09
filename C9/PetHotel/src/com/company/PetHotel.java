package com.company;

import java.util.Scanner;
import java.util.TreeMap;

public class PetHotel
{
    TreeMap<Integer, String> hotel = new TreeMap<>();

    public void run()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter CheckIn, CheckOut, Move, Occupancy, Rooms, CloseForSeason, or Exit.");

        boolean keepRunning = true;

        do
        {
            String command = input.next().toUpperCase();

            switch (command)
            {
                case "CHECKIN":
                    String name = input.next();
                    int number = input.nextInt();
                    checkIn(name, number);
                    break;
                case "CHECKOUT":
                    number = input.nextInt();
                    checkOut(number);
                    break;
                case "MOVE":
                    name = input.next();
                    number = input.nextInt();
                    int number2 = input.nextInt();
                    move(name, number, number2);
                    break;
                case "OCCUPANCY":
                    occupancy();
                    break;
                case "ROOMS":
                    rooms();
                    break;
                case "CLOSEFORSEASON":
                    closeForSeason();
                    break;
                case "EXIT":
                    keepRunning = false;
                    break;
                default:
                    System.out.println("Invalid command! Try again.");
                    break;
            }

        } while (keepRunning);

    }

    private void checkIn(String name, int number)
    {
        if(number >= 100 && number <= 109)
        {
            if(hotel.containsKey(number))
            {
                System.out.println("Room is occupied!");
            }
            else
            {
                hotel.put(number, name);
                System.out.println(name + " has been added to room " + number + ".");
            }
        }
        else
        {
            System.out.println("Not a valid room number!");
        }

        System.out.println("What would you like to do next?");
    }

    private void checkOut(int number)
    {
        hotel.remove(number);
        System.out.println("Your pet has been removed from Room " + number + ".");
        System.out.println("What would you like to do next?");
    }

    private void move(String name, int number, int number2)
    {
        boolean roomNotEmpty = hotel.containsKey(number2);

        if((number >= 100 && number <= 109) && (number2 >= 100 && number2 <= 109))
        {
            if (!roomNotEmpty)
            {
                hotel.remove(number);
                hotel.put(number2, name);
                System.out.println("Your pet has been moved from Room " + number + " to Room " + number2 + ".");
            }
            else
            {
                System.out.println("That room is occupied.");
            }
        }
        else
        {
            System.out.println("Those are not valid room numbers.");
        }

        System.out.println("What would you like to do next?");
    }

    private void occupancy()
    {
        System.out.println(hotel.entrySet());
        System.out.println("What would you like to do next?");
    }

    private void rooms()
    {
        for(int i = 100; i <= 109; i++)
        {
            System.out.println("Room " + i + " : " + hotel.get(i));
        }
        System.out.println("What would you like to do next?");
    }

    private void closeForSeason()
    {
        hotel.clear();
        System.out.println("All the pets have been checked out from the hotel.");
        System.out.println("What would you like to do next?");
    }

}
