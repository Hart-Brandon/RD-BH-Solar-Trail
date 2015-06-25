/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrail.view;

import java.util.Scanner;
import byui.cit260.solarTrail.control.GameControl;
import byui.cit260.solarTrail.model.InventoryItem;
import byui.cit260.solarTrail.model.Location;
import byui.cit260.solarTrail.model.Map;
import solartrail.SolarTrail;

/**
 *
 * @author BHart
 */
public class InGameView extends View{

    private static Map map = new Map();
    
    public InGameView()
    {
        super("\n"
                + "\t\t\t\tN - New Game\n"
                + "\t\t\t\tL - Load Game\n"
                + "\t\t\t\tH - Help\n"
                + "\t\t\t\tQ - Quit\n");
    }
    
    @Override
    public boolean doAction(Object obj)
    {
        String value = (String) obj;

        value = value.toUpperCase(); //convert to all upper case
        char choice = value.charAt(0); //get first character entered
        
        Location[][] locations = map.getLocations();

        switch (choice)
        {
            case 'V':
                this.displayMap(locations);
                break;
            case 'I': //View Inventory
                this.viewInventory();
                break;
            case 'C': //View Crew
                this.viewCrew();
                break;
            case 'T': //Travel
                this.travel();
                break;
            case 'R': //Repare Ship
                this.repairShip();
                break;
            case 'S': //New Game
                this.saveGame();
                break;
            case 'L': //Load Game
                this.loadGame();
                break;
            case 'H': //Help Menu
                this.helpMenu();
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

    private void saveGame()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void loadGame()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void helpMenu()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayMap(Location[][] locations)
    {
        System.out.println("\t _____ _               _____                      \n"
                         + "\t/  ___| |             |  _  |                     \n"
                         + "\t\\ `--.| |_ __ _ _ __  | | | | ___ ___  __ _ _ __  \n"
                         + "\t `--. \\ __/ _` | '__| | | | |/ __/ _ \\/ _` | '_ \\ \n"
                         + "\t/\\__/ / || (_| | |    \\ \\_/ / (_|  __/ (_| | | | |\n"
                         + "\t\\____/ \\__\\__,_|_|     \\___/ \\___\\___|\\__,_|_| |_|\n"
                         + "\t                                                  ");
        
        System.out.println("| Earth |   *   |   *   | Mars  |   *   |   *   |Jupiter|   *   |   *   |Saturn |   *   |   *   |Uranus |");
        System.out.println("_________________________________________________________________________________________________________");
        for (int row = 0; row < locations.length; row++)
        {   
            System.out.println("|");
            
            for (int col = 0; col < locations.length; col++)
            {   
                if (locations[row][col].isVisited() == true)
                {
                    System.out.println("   X   ");
                }
                else
                {
                    System.out.println((row + 1) + "       ");
                }
                
                if (row == 1 && col == 0)
                {
                    System.out.println("_________________________________________________________________________________________________________");
                }
                
                System.out.println("|");
            }
        }
        System.out.println("_________________________________________________________________________________________________________");
    }

    private void viewInventory()
    {
        //get the sorted list of inventory items for the current game
        InventoryItem[] inventory = GameControl.getSortedInventoryList();
        
        System.out.println("\nList of Inventory Items");
        System.out.println("Description\tRequired\tIn Stock");
        
        //for each inventory item
        for (InventoryItem inventoryItem : inventory)
        {
            //DISPLAY the desc, required amount, amount in stock
            System.out.println(inventoryItem.getDescription() + "\t"
            + inventoryItem.getRequiredAmount() + "\t"
            + inventoryItem.getQuantityInStock());
        }
    }

    private void viewCrew()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void travel()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void repairShip()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
