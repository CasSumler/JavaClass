package com.company;

import java.util.Stack;

public class SimpleStack
{
    public void run()
    {
        Stack<String> myStack = new Stack<>();
        myStack.push("One");
        myStack.push("Two");
        myStack.push("Three");
        myStack.push("Four");
        myStack.push("Five");

        System.out.println("My stack contains: " + myStack);

        String numberPeeked = myStack.peek();
        System.out.println("Number peeked: " + numberPeeked);
        System.out.println("My stack still contains: " + myStack);

        String numberPopped = myStack.pop();
        System.out.println("Number removed: " + numberPopped);
        System.out.println("My stack now contains: " + myStack);

        numberPopped = myStack.pop();
        System.out.println("Number removed: " + numberPopped);
        System.out.println("My stack now contains: " + myStack);

        numberPopped = myStack.pop();
        System.out.println("Number removed: " + numberPopped);
        System.out.println("My stack now contains: " + myStack);

        numberPopped = myStack.pop();
        System.out.println("Number removed: " + numberPopped);
        System.out.println("My stack now contains: " + myStack);

        numberPopped = myStack.pop();
        System.out.println("Number removed: " + numberPopped);
        System.out.println("My stack now contains: " + myStack);
    }
}
