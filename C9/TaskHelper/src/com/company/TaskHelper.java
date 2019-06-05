package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TaskHelper
{
    private Queue<String> taskQueue = new LinkedList<>();

    public void run()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Type Add, Peek, Remove, HowMany, List, Flee, or Exit.");

        boolean keepRunning = true;

        do
        {
            String command = input.next().toUpperCase();

            switch (command)
            {
                case "ADD":
                    String task = input.next();
                    add(task);
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
                case "LIST":
                    list();
                    break;
                case "FLEE":
                    flee();
                    break;
                case "EXIT":
                    keepRunning = false;
                    break;
                default:
                    System.out.println("Invalid Command!");
            }

        } while (keepRunning);
    }

    private void add(String task)
    {
        taskQueue.add(task);
    }

    private void peek()
    {
        String nextTask = taskQueue.peek();
        System.out.println("The next task is: " + nextTask);
    }

    private void remove()
    {
        String removedTask = taskQueue.poll();
        System.out.println("The task " + removedTask + " has been completed.");

        String nextTask = taskQueue.peek();
        System.out.println("The next task is " + nextTask + ".");
    }

    private void howMany()
    {
        System.out.println("There are " + taskQueue.size() + " tasks to do.");
    }

    private void list()
    {
        System.out.println(taskQueue);
    }

    private void flee()
    {
        taskQueue.clear();
        System.out.println("The list has been cleared.");
        list();
    }

}
