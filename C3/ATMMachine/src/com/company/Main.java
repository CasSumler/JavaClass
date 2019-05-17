package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int withdrawal = 137;

        int twentyBills = withdrawal / 20;
        int noTwentyBills = twentyBills * 20;

        int tenBills = (withdrawal - noTwentyBills) / 10;
        int noTenBills = tenBills * 10;

        int fiveBills = (withdrawal - (noTwentyBills + noTenBills)) / 5;
        int noFiveBills = fiveBills * 5;

        int oneBills = (withdrawal - (noTwentyBills + noTenBills + noFiveBills));

        System.out.println("Withdrawing $" + withdrawal + " will result in: + $20(" + twentyBills + "), $10(" + tenBills + "), $5(" + fiveBills + ")," +
                "and $1(" + oneBills + ").");

        int transactionFee = 1;
        double billFee = 0.10 * (twentyBills + tenBills + fiveBills + oneBills);
        double total = transactionFee + billFee;
        System.out.println("The total transaction fee is: $" + total);





        //bronze level
        //int fiveBills = withdrawal / 5;
        //int oneBills = fiveBills % 5;

        //System.out.println("$5" + "(" + fiveBills + ")" + ", $1" + "(" + oneBills + ")");



    }
}
