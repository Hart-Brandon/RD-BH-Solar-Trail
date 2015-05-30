/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.solarTrail.control;

/**
 *
 * @author BHart
 */
public class GameControl {
    public int endGame(int difficultyLvl, int numDays, int totalResources, 
            int daysLeft) {
        if (numDays > daysLeft)
            return -1;
        
        int resourcesLeft = (int) totalResources - (1 - (1 * difficultyLvl)) * numDays;
        
        if (resourcesLeft < 0) 
            return -1;
        
        return resourcesLeft;
    }
}
