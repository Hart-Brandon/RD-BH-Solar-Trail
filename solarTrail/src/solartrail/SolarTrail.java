/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solartrail;

import byui.cit260.solarTrail.model.Player;
import byui.cit260.solarTrail.model.Ship;

/**
 *
 * @author BHart and RDunn
 */
public class SolarTrail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Player playerOne = new Player();
      
      playerOne.setName("Steve Rogers");
      playerOne.setHighscore(1500);
      
      String playerInfo = playerOne.toString();
      System.out.println(playerInfo);
      
      Ship theKestrel = new Ship();
              
      theKestrel.setDescription("A Bird of Prey.");
      theKestrel.setSize(30);
      theKestrel.setStatus("Damaged plenty, but she'll fly true.");
      theKestrel.setMinCrewCapacity(1);
      theKestrel.setMaxCrewCapacity(10);
      theKestrel.setActualCrewSize(5);
      theKestrel.setCargoCapacity(500);
      theKestrel.setSpeed(600);
      
      String shipInfo = theKestrel.toString();
      System.out.println(shipInfo);
                           
    }
    
}
