/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrail.control;

/**
 *
 * @author BHart
 */
public class ShipControl extends Control{

    public ShipControl()
    {
        super("\t*************"
                + "\t*   Ship    *"
                + "\t*************");
    }
    
    @Override
    public boolean doAction(Object obj)
    {
        String value = (String) obj;

        value = value.toUpperCase(); //convert to all upper case
        char choice = value.charAt(0); //get first character entered

        switch (choice)
        {
            case 'R': //Check Resources 
                System.out.println("viewResources function");
                break;
            case 'C': //Check Crew 
                System.out.println("viewCrew function");
                break;
            case 'S': //Current Score
                System.out.println("getScore function");
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
