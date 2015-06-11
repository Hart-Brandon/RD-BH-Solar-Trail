/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrail.view;

import java.util.Scanner;

/**
 *
 * @author BHart and RDunn
 */
public class ShipMenuView {

    private final String SHIPMENU = "\n"
            + "\n\n  A - The Falcon"
            + "\n  A huge dreadnought, capable of carrying a "
            + "\n  large crew and many supplies (4-7 crew, Easy mode)  "
            + "\n\n  B - The Sparrow"
            + "\n  A mid-size cruiser, which carries a medium "
            + "\n  sized crew and supplies (3-5 crew, Normal mode)"
            + "\n\n  C - The Grasshopper"
            + "\n  A small but fast scouting ship, which can only support"
            + "\n  a tiny crew and few supplies (2-3 crew, Hard Mode)"
            + "\n\n Or press Q to Quit";

    public void displayShipMenu() {

        char selection = ' ';
        do {

            System.out.println(SHIPMENU);

            String input = this.getInput();
            selection = input.charAt(0);
            selection = Character.toUpperCase(selection);
            this.doAction(selection);

        } while (selection != 'Q');
    }

    public String getInput() {
        boolean valid = false; //indicates if the name has been retrieved
        String input = null;
        Scanner keyboard = new Scanner(System.in);

        while (!valid) {
            //Prompt for response
            System.out.println("Please choose a ship:");

            //Get response and trim off the blank spaces
            input = keyboard.nextLine();
            input = input.trim();

            //Check if name is valid (-2 character length)
            if (input.length() > 1) {
                System.out.println("Invalid Entry - Please type one letter.");
                continue; //prompt user again
            }
            break; //Exit while loop
        }

        return input;
    }

    public void doAction(char ship) {
        int difficulty;
        switch (ship) {
            case 'A':
                difficulty = 1;
                //Easy Mode
                break;
            case 'B':
                difficulty = 2;
                //Normal Mode
                break;
            case 'C': //Hard
                difficulty = 1;
                //Hard Mode
                break;
            case 'Q': //Quit
                return;
            default:
                System.out.println("\n***Invalid Selection.  Try Again.***");
                break;
        }
    }
}
