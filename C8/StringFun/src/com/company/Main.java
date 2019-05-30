package com.company;

public class Main
{

    public static void main(String[] args)
    {
        String hello = "Hello";
        String goodbye = "Goodbye";

        //First Character
        System.out.println("First Character: " + StringUtil.getFirstCharacter(hello));
        System.out.println("First Character: " + StringUtil.getFirstCharacter(goodbye));

        //Last Character
        System.out.println("Last Character: " + StringUtil.getLastCharacter(hello));
        System.out.println("Last Character: " + StringUtil.getLastCharacter(goodbye));

        //First Two Characters
        System.out.println("First Two Characters: " + StringUtil.getFirstTwoCharacters(hello));
        System.out.println("First Two Characters: " + StringUtil.getFirstTwoCharacters(goodbye));

        //Last Two Characters
        System.out.println("Last Two Characters: " + StringUtil.getLastTwoCharacters(hello));
        System.out.println("Last Two Characters: " + StringUtil.getLastTwoCharacters(goodbye));

        //All but First Three Characters
        System.out.println("All but First 3 Characters: " + StringUtil.getAllButFirstThreeCharacters(hello));
        System.out.println("All but First 3 Characters: " + StringUtil.getAllButFirstThreeCharacters(goodbye));

        //Every Other Character
        System.out.println("Every other character: " + StringUtil.getEveryOtherCharacter("SEEKCARWEST"));

        //Print Characters
        System.out.println("Print Characters:");
        StringUtil.printCharacters(hello);
        StringUtil.printCharacters(goodbye);

        //Phone Number Bronze and Silver
        StringUtil.printPhoneNumber("501-867-5309");
        StringUtil.printPhoneNumber("5018675309");
        StringUtil.printPhoneNumber("J01TMPKD0W");

        //Find First E
        System.out.println("First E: " + StringUtil.findFirstE(hello));
        System.out.println("First E: " + StringUtil.findFirstE(goodbye));

        //Is Finn
        System.out.println("Finn?: " + StringUtil.isFinn("Finn"));
        System.out.println("Finn?: " + StringUtil.isFinn("Jake"));
        System.out.println("Finn?: " + StringUtil.isFinn("Cassi"));
    }
}
