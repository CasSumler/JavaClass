package com.company;

import java.util.ListIterator;
import java.util.Scanner;
import java.util.Stack;

public class EmergencyTracker
{
    Stack<String> myEmergencyTracker = new Stack<>();

    public void run()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a command: ADD, PEEK, REMOVE, HOWMANY, PANIC, LIST, ORDER or EXIT.");

        boolean keepRunning = true;

        do
        {
            String command = input.next().toUpperCase();

            switch (command)
            {
                case "ADD":
                    String emergency = input.next();
                    add(emergency);
                    break;
                case "PEEK":
                    peek();
                    break;
                case "REMOVE":
                    remove();
                    break;
                case "HOWMANY":
                    howMany();
                    break;
                case "PANIC":
                    panic();
                    break;
                case "LIST":
                    list();
                    break;
                case "ORDER":
                    order();
                    break;
                case "EXIT":
                        keepRunning = false;
                        break;
                default:
                    System.out.println("Invalid command!");
            }

        } while (keepRunning);
    }

    private void add(String emergency)
    {
        myEmergencyTracker.push(emergency);
    }

    private void peek()
    {
        String nextEmergency = myEmergencyTracker.peek();
        System.out.println("The next emergency is: " + nextEmergency);
    }

    private void remove()
    {
        String removedEmergency = myEmergencyTracker.pop();
        System.out.println(removedEmergency + " is no longer an emergency.");

        String nextEmergency = myEmergencyTracker.peek();
        System.out.println("The next emergency is: " + nextEmergency);
    }

    private void howMany()
    {
        System.out.println("There are " + myEmergencyTracker.size() + " emergencies.");
    }

    private void panic()
    {
        myEmergencyTracker.clear();
        System.out.println("There are no emergencies to deal with.");
    }

    private void list()
    {
        System.out.println(myEmergencyTracker);
    }

    private void order()
    {
        ListIterator<String> emergenciesListIterator = myEmergencyTracker.listIterator(myEmergencyTracker.size());

        while (emergenciesListIterator.hasPrevious())
        {
            String emergency = emergenciesListIterator.previous();
            System.out.println(emergency);
        }
    }

}
