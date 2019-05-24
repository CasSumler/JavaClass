package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner input = new java.util.Scanner(System.in);

        boolean keepRunning = true;
        boolean previousSelectionValid = true;

        while (keepRunning)
        {
            displayMenu();
            String selection = input.next();

            switch (selection)
            {
                case "W":
                case "w":
                    System.out.println("Here is your package of Wasteland Wombat Womps.");
                    previousSelectionValid = true;
                    break;
                case "H":
                case "h":
                    System.out.println("Here is your package of Hero not Needed Wafers.");
                    previousSelectionValid = true;
                    break;
                case "G":
                case "g":
                    System.out.println("Here is your package of Gas Running Out Energy Bar.");
                    previousSelectionValid = true;
                    break;
                case "P":
                case "p":
                    System.out.println("Here is your package of Pig Parts Paradise.");
                    previousSelectionValid = true;
                    break;
                case "EXIT":
                case "exit":
                case "Exit":
                    keepRunning = false;
                    break;
                default:
                    if (previousSelectionValid)
                    {
                        System.out.println("Invalid selection. Try that again and it's off to the Perl Dome with you!");
                        previousSelectionValid = false;
                    }
                    else
                    {
                        System.out.println("You were warned. Off to the Perl Dome with you!");
                        previousSelectionValid = true;
                    }
            }
        }

    }

    private static void displayMenu()
    {
        System.out.println("(W) Wasteland Wombat Womps");
        System.out.println("(H) Hero not Needed Wafers");
        System.out.println("(G) Gas Running Out Energy Bar");
        System.out.println("(P) Pig Parts Paradise");

        System.out.println();

        System.out.println("Please Make a Selection: ");
    }
}
