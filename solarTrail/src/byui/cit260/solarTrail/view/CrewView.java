/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrail.view;

import java.util.Scanner;

/**
 *
 * @author BHart
 */
public class CrewView {

    private final String CREW_MENU = "\n\n\n"
            + "A - Add Crew Member\n"
            + "H - Heal Status\n"
            + "Q - Exit Menu";

    public void displayCrewMenu() {
        char selection = ' ';
        do {
            System.out.println(CREW_MENU);

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
            System.out.println("Choose an option:");

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
        switch (ship) {
            case 'A': //Add Crew Member 
                System.out.println("addMember function");
                break;
            case 'H': //Heal Status 
                System.out.println("healStatus function");
                break;
            case 'Q': //Quit
                return;
            default:
                System.out.println("\n***Invalid Selection.  Try Again.***");
                break;
        }
    }
}
