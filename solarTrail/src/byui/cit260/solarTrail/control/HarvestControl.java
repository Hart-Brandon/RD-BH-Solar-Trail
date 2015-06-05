/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrail.control;

/**
 *
 * @author BHart & RDunn
 */
public class HarvestControl {
    
    public int huntForResources(int amountAvailable, int amountToHarvest, 
            int numCrew, int actualCrew, int cargoSpaceLeft, int daysLeft) {
        
        if (numCrew > (actualCrew - 1)) {
            return -1;
        }
        
        if (amountAvailable < amountToHarvest) {
            return -1;
        }
        
        if (cargoSpaceLeft < amountToHarvest) {
            return -1;
        }
        
        int timeToHarvest = (int) ((amountToHarvest * 0.5) - 
                ((amountToHarvest * 0.5) * (numCrew -1) * 0.1));
        
        if (timeToHarvest > daysLeft) {
            return -1;
        }
        
        return timeToHarvest;
    }
}
