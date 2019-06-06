package com.company;

import java.util.HashSet;

public class SimpleSet
{
    public void run()
    {
        HashSet<Integer> mySet = new HashSet<>();

        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        mySet.add(4);
        mySet.add(5);

        System.out.println(mySet);

        mySet.add(3);
        System.out.println(mySet);
    }
}
