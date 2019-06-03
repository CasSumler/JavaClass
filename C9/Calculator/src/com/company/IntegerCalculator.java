package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class IntegerCalculator
{
    private long answer = 0;
    private ArrayList<String> history = new ArrayList<>();

    public void run()
    {
        Scanner input = new Scanner(System.in);

        boolean keepRunning = true;

        do
        {
            String action = input.next().toUpperCase();

            switch (action)
            {
                case "ADD":
                case "A":
                    long value = Long.parseLong(input.next());
                    add(value);
                    break;
                case "SUBTRACT":
                case "S":
                    value = Long.parseLong(input.next());
                    subtract(value);
                    break;
                case "MULTIPLY":
                case "M":
                    value = Long.parseLong(input.next());
                    multiply(value);
                    break;
                case "DIVIDE":
                case "D":
                    value = Long.parseLong(input.next());
                    divide(value);
                    break;
                case "CLEAR":
                case "C":
                    reset();
                    break;
                case "HISTORY":
                case "H":
                    printHistory();
                case "EXIT":
                case "E":
                    keepRunning = false;
                    break;
                default:
                    System.out.println("Does not compute.");
            }

            System.out.println("Answer: " + answer);

        } while(keepRunning);

    }

    private void add(long value)
    {
        answer += value;
        history.add("Add " + value);
    }

    private void subtract(long value)
    {
        answer -= value;
        history.add("Subtract " + value);
    }

    private void multiply(long value)
    {
        answer *= value;
        history.add("Multiply " + value);
    }

    private void divide(long value)
    {
        answer /= value;
        history.add("Divide " + value);
    }

    private void reset()
    {
        answer = 0;
        history.clear();
    }

    private void printHistory()
    {
        for (String action : history)
        {
            System.out.println(action);
        }
    }
}
