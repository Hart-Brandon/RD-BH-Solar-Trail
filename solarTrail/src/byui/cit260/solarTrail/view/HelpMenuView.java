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
public class HelpMenuView {

    private final String HELP = "\n"
            + "\t\t\t\tG - What is the Goal of the Game?\n"
            + "\t\t\t\tM - How to Move\n"
            + "\t\t\t\tR - Gathering Resources\n"
            + "\t\t\t\tQ - Quit\n";

    public void displayHelpMenu() {

        char selection = ' ';
        do {

            System.out.println(HELP);

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
            System.out.println("Enter your response below:");

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

    public void doAction(char choice) {

        switch (choice) {
            case 'G': //Game goal
                this.gameGoal();
                break;
            case 'M': //How to Move
                this.howToMove();
                break;
            case 'R': //Gathering Resources
                this.gatheringResources();
                break;
            case 'Q': //Quit
                return;
            default:
                System.out.println("\n***Invalid Selection.  Try Again.***");
                break;
        }
    }

    private void gameGoal() {
        System.out.println("***You win the game by winning the game.***");
    }

    private void howToMove() {
        System.out.println("***Move your character with the keyboard***");
    }

    private void gatheringResources() {
        System.out.println("***Pick them up.***");
    }
}
