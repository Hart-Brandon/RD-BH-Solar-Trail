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
public class ShipMenuView extends View
{

    ShipMenuView()
    {
        super("\n"
                + "\n\n  A - The Falcon"
                + "\n  A huge dreadnought, capable of carrying a "
                + "\n  large crew and many supplies (4-7 crew, Easy mode)  "
                + "\n\n  B - The Sparrow"
                + "\n  A mid-size cruiser, which carries a medium "
                + "\n  sized crew and supplies (3-5 crew, Normal mode)"
                + "\n\n  C - The Grasshopper"
                + "\n  A small but fast scouting ship, which can only support"
                + "\n  a tiny crew and few supplies (2-3 crew, Hard Mode)"
                + "\n\n Or press Q to Quit");
    }

    @Override
    public boolean doAction(Object obj)
    {
        int difficulty;
        
        String value = (String) obj;

        value = value.toUpperCase(); //convert to all upper case
        char choice = value.charAt(0); //get first character entered
        
        switch (choice)
        {
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
                System.exit(0);
                break;
            default:
                System.out.println("\n***Invalid Selection.  Try Again.***");
                break;
        }
        return true;
    }
}
