package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class SimpleQueue
{
    public void run()
    {
        Queue<String> myQueue = new LinkedList<>();

        myQueue.add("One");
        myQueue.add("Two");
        myQueue.add("Three");
        myQueue.add("Four");
        myQueue.add("Five");

        System.out.println(myQueue);

        myQueue.poll();
        System.out.println(myQueue);

        myQueue.poll();
        System.out.println(myQueue);

        myQueue.poll();
        System.out.println(myQueue);

        myQueue.poll();
        System.out.println(myQueue);

        myQueue.poll();
        System.out.println(myQueue);

        String nextNumber = myQueue.poll();
        System.out.println(nextNumber);

        String peekAhead = myQueue.peek();
        System.out.println(peekAhead);


    }
}
