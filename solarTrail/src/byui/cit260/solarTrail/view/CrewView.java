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
public class CrewView extends View
{
    public CrewView()
    {
    super("\n\n\n"
            + "A - Add Crew Member\n"
            + "H - Heal Status\n"
            + "Q - Exit Menu");
}
    @Override
    public boolean doAction(Object obj)
    {
        String value = (String) obj;

        value = value.toUpperCase(); //convert to all upper case
        char choice = value.charAt(0); //get first character entered

        switch (value)
        {
            case "A": //Add Crew Member 
                System.out.println("addMember function");
                break;
            case "H": //Heal Status 
                System.out.println("healStatus function");
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
}
