/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solartrail;

import byui.cit260.solarTrail.model.Player;

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
      
    }
    
}
