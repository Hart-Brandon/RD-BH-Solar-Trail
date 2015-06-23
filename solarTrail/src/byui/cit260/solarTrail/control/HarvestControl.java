/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrail.control;

import java.util.Scanner;

/**
 *
 * @author BHart & RDunn
 */
public class HarvestControl
{
private final String ERROR_MSG = "The value entered is invalid.";
    
    public int huntForResources(int amountAvailable, int amountToHarvest,
            int numCrew, int actualCrew, int cargoSpaceLeft, int daysLeft)
    {

        if (numCrew > (actualCrew - 1))
        {
            return -1;
        }

        if (amountAvailable < amountToHarvest)
        {
            return -1;
        }

        if (cargoSpaceLeft < amountToHarvest)
        {
            return -1;
        }

        int timeToHarvest = (int) ((amountToHarvest * 0.5)
                - ((amountToHarvest * 0.5) * (numCrew - 1) * 0.1));

        if (timeToHarvest > daysLeft)
        {
            return -1;
        }

        return timeToHarvest;
    }
    
    //Used when player wants to harvest items
    public int harvestAmount() {
        int harvestValue = 0;
        Scanner scanner = new Scanner(System.in);
        boolean valid = false;

        //Loops until user inputs valid int value
        while (valid == false) {
            System.out.println("How many resources would you like to harvest? (max: 30)");

            //Checks whether the input is a valid int between 0 and 30
            if (harvestValue < 0 || harvestValue > 30) {
                System.out.println(ERROR_MSG);
                break;
            } else {
                harvestValue = scanner.nextInt();
            }
        }
        return harvestValue;
    }
}
