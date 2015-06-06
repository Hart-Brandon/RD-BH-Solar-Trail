/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrail.control;

import byui.cit260.solarTrail.model.Player;
import solartrail.SolarTrail;

/**
 *
 * @author BHart
 */
public class GameControl {

    public int endGame(double difficultyLvl, int numDays, int totalResources, 
            int daysLeft) {
        if (numDays > daysLeft || numDays < 0)
            return -1;
        
        int resourcesLeft = (int) ((int) totalResources - (1 - (1 * difficultyLvl)) * numDays);
        
        if (resourcesLeft < 0) 
            return -1;
        
        return resourcesLeft;
    }
    
    public double highScore(double difficultyLvl, double crewAlive, double eventsCleared, 
            double artifactScore) {
        if (difficultyLvl > 3)
            return -1;
        if (crewAlive < 0)
            return -1;
        if (artifactScore < 0)
            return -1;
        if (eventsCleared < 0)
            return -1;
        
        double score = (double) (difficultyLvl * .5) * ( 1 + (crewAlive * .25)) * ((eventsCleared*500) + (artifactScore * 1000));
        
        if (score < 0) 
            return -1;
        
        return score;
    }
    
    public static Player createPlayer(String playersName) 
    {
        if (playersName == null)
        {
            return null;
        }
        
        Player player = new Player();
        player.setName(playersName);
        
        SolarTrail.setPlayer(player); //save player
        
        return player;
    }
}
