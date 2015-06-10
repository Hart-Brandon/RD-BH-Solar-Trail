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
public class InGameView 
{   
    private final String ERROR_MSG = "The value entered is invalid.";
    
    //Used when player wants to harvest items
    public int harvestAmount()
    {
        int harvestValue = 0;
        Scanner scanner = new Scanner(System.in);
        boolean valid = false;
        
        //Loops until user inputs valid int value
        while (valid == false)
        {
            System.out.println("How many resources would you like to harvest? (max: 30)");
        
            //Checks whether the input is a valid int between 0 and 30
            if(harvestValue < 0 || harvestValue > 30)
            {
                System.out.println(ERROR_MSG);
            break;
            }
            else
            {
                harvestValue = scanner.nextInt();
            }
        }
        return harvestValue;
    } 
    
    //Used when player is at the final stage of the outward journey
    public int artifactDays()
    {
        int artifactTime = 0;
        Scanner scanner = new Scanner(System.in);
        boolean valid = false;
        
        //Loops until user inputs valid int value
        while (valid == false)
        {
            System.out.println("The radiation from the artifact will overwhelm your"
                    + "\n  shields in 60 days.  You cannot stay longer than that."
                    + "\n\n How many days would you like to stay?");
        
            //Checks whether the input is a valid int between 0 and 30
            if(artifactTime < 0 || artifactTime > 60)
            {
                System.out.println(ERROR_MSG);
                break;
            }
            else
            {
                artifactTime = scanner.nextInt();
            }
        }
        return artifactTime;
    } 
}
