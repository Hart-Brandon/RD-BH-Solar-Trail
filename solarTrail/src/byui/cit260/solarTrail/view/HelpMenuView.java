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
public class HelpMenuView extends View
{

    public HelpMenuView()
    {
        super("\n"
                + "\t\t\t\tG - What is the Goal of the Game?\n"
                + "\t\t\t\tM - How to Move\n"
                + "\t\t\t\tR - Gathering Resources\n"
                + "\t\t\t\tQ - Quit\n");
    }

    @Override
    public boolean doAction(Object obj)
    {
        String value = (String) obj;

        value = value.toUpperCase(); //convert to all upper case
        char choice = value.charAt(0); //get first character entered

        switch (value)
        {
            case "G": //Game goal
                this.gameGoal();
                break;
            case "M": //How to Move
                this.howToMove();
                break;
            case "R": //Gathering Resources
                this.gatheringResources();
                break;
            case "Q": //Quit
                System.exit(0);
                break;
            default:
                System.out.println("\n***Invalid Selection.  Try Again.***");
                break;
        }
        return true;
    }

    private void gameGoal()
    {
        System.out.println("***You win the game by winning the game.***");
    }

    private void howToMove()
    {
        System.out.println("***Move your character with the keyboard***");
    }

    private void gatheringResources()
    {
        System.out.println("***Pick them up.***");
    }
}
