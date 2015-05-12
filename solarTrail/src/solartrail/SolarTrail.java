/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solartrail;

import byui.cit260.solarTrail.model.Player;
import byui.cit260.solarTrail.model.Ship;
import byui.cit260.solarTrail.model.VisitPlanetScene;

/**
 *
 * @author BHart and RDunn
 */
public class SolarTrail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      //Start Test Player class
      Player playerOne = new Player();
      
      playerOne.setName("Steve Rogers");
      playerOne.setHighscore(1500);
      
      String playerInfo = playerOne.toString();
      System.out.println(playerInfo);
      //End Test
      
      //Start Test Ship class
      Ship theKestral = new Ship();
      
      theKestral.setDescription("A bird of prey");
      theKestral.setActualCrewSize(5);
      theKestral.setCargoCapacity(500);
      theKestral.setStatus("Damaged plenty, but she'll fly true.");
      theKestral.setMaxCrewCapacity(10);
      theKestral.setMinCrewCapacity(1);
      theKestral.setSize(30);
      theKestral.setSpeed(600);
      
      String shipInfo = theKestral.toString();
      System.out.println(shipInfo);
      //End Test
      
      //Start Test VisitPlanetScene class
      VisitPlanetScene sceneOne = new VisitPlanetScene();
      
      sceneOne.setBlocked(true);
      sceneOne.setDescription("Yay scene!");
      sceneOne.setFoodAvailable(10);
      sceneOne.setFuelAvailable(5);
      sceneOne.setSymbol("None");
      sceneOne.setTravelTime(21.5);
      sceneOne.setWaterAvailable(15);
      
      String sceneInfo = sceneOne.toString();
      System.out.println(sceneInfo);
      //End Test
      
      
    }
}
