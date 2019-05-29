package com.company;

public class Main
{

    public static void main(String[] args)
    {
        Bookshelf bookshelf = new Bookshelf(125);
        System.out.println("Number of books: " + bookshelf.getBookCount());

        Bookshelf bookshelf2 = new Bookshelf(50);
        System.out.println("Number of books: " + bookshelf2.getBookCount());


    }
}
