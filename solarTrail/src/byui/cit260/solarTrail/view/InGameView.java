/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrail.view;

import java.util.Scanner;
import byui.cit260.solarTrail.control.GameControl;
import solartrail.SolarTrail;

/**
 *
 * @author BHart
 */
public class InGameView extends View{

    public InGameView()
    {
        super("\n"
                + "\t\t\t\tN - New Game\n"
                + "\t\t\t\tL - Load Game\n"
                + "\t\t\t\tH - Help\n"
                + "\t\t\t\tQ - Quit\n");
    }
    
    @Override
    public boolean doAction(Object obj)
    {
        String value = (String) obj;

        value = value.toUpperCase(); //convert to all upper case
        char choice = value.charAt(0); //get first character entered

        switch (choice)
        {
            case 'S': //New Game
                this.saveGame();
                break;
            case 'L': //Load Game
                this.loadGame();
                break;
            case 'H': //Help Menu
                this.helpMenu();
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

    private void saveGame()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void loadGame()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void helpMenu()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
