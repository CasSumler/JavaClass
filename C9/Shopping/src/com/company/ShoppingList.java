package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ShoppingList
{
    private ArrayList<String> list = new ArrayList<>();

    public void run()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Add to, Print, Remove item numbers, Clear, Sort, or Exit the Shopping List.");

        boolean keepRunning = true;

        do
        {
            String action = input.next();

            switch (action)
            {
                case "Add":
                case "add":
                    list.add(input.next());
                    break;
                case "Print":
                case "print":
                    printList(list);
                    break;
                case "Remove":
                case "remove":
                    list.remove(input.nextInt());
                    break;
                case "Clear":
                case "clear":
                    list.clear();
                    System.out.println("There is nothing in the list.");
                    break;
                case "Sort":
                case "sort":
                    Collections.sort(list);
                    printList(list);
                    break;
                case "Exit":
                case "exit":
                    keepRunning = false;
                    break;
                default:
                    System.out.println("That doesn't compute. Try again.");
            }
        } while (keepRunning);
    }

    public static void printList(ArrayList<String> list)
    {
        for (String item : list)
        {
            System.out.println(list.indexOf(item) + " : " + item);
        }
    }
}
