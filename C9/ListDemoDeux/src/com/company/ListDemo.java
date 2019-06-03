package com.company;

import java.util.ArrayList;

public class ListDemo
{
    public void execute()
    {
        ArrayList<String> furniture = new ArrayList<>();
        furniture.add("Couch");
        furniture.add("Table");
        furniture.add("Chair");

        printList(furniture);

        furniture.add("Lamp");          //step 9
        System.out.println("");
        printList(furniture);

        furniture.add(0, "Fan");    //step 10
        System.out.println("");
        printList(furniture);

        furniture.add(2, "Bookcase");       //step 11
        System.out.println("");
        printList(furniture);

        furniture.remove(furniture.size() - 1);     //step 12
        System.out.println("");
        printList(furniture);

        furniture.remove(0);        //step 13
        System.out.println("");
        printList(furniture);

        furniture.remove(1);        //step 14
        System.out.println("");
        printList(furniture);
    }

    public static void printList(ArrayList<String> list)
    {
        for (String item : list)
        {
            System.out.print(item + " : ");
        }
    }
}
