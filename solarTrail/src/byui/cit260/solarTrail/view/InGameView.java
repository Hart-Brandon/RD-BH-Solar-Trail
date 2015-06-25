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
                + "\t\t\t\tM - Map\n"
                + "\t\t\t\tI - Inventory\n"
                + "\t\t\t\tC - Crew\n"
                + "\t\t\t\tR - Repair Ship\n"                
                + "\t\t\t\tT - Travel Onward\n"
                + "\t\t\t\tS - Save Game\n"
                + "\t\t\t\tL - Load Game\n"
                + "\t\t\t\tH - Help Menu\n"
                + "\t\t\t\tQ - Quit\n");
    }
    
    @Override
    public boolean doAction(Object obj)
    {
        String value = (String) obj;

        value = value.toUpperCase(); //convert to all upper case
        char choice = value.charAt(0); //get first character entered
        
        Location[][] locations = new Location[2][13];
        
        for (int row = 0; row < 2; row++)
        {   
            for (int col = 0; col < 13; col++)
            {   
                locations[row][col] = new Location(row, col);
            }
        }

        switch (choice)
        {
            case 'M':
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
        System.out.println("\t\t _____ _               _____                      \n"
                         + "\t\t/  ___| |             |  _  |                     \n"
                         + "\t\t\\ `--.| |_ __ _ _ __  | | | | ___ ___  __ _ _ __  \n"
                         + "\t\t `--. \\ __/ _` | '__| | | | |/ __/ _ \\/ _` | '_ \\ \n"
                         + "\t\t/\\__/ / || (_| | |    \\ \\_/ / (_|  __/ (_| | | | |\n"
                         + "\t\t\\____/ \\__\\__,_|_|     \\___/ \\___\\___|\\__,_|_| |_|\n"
                         + "\t\t                                                  ");
        
        System.out.println("| Earth |   *   |   *   | Mars  |   *   |   *   |Jupiter|   *   |   *   |Saturn |   *   |   *   |Uranus |");
        System.out.println("|_______|_______|_______|_______|_______|_______|_______|_______|_______|_______|_______|_______|_______|");
        for (int row = 0; row < 2; row++)
        {
            for (int col = 0; col < 13; col++)
            {   
                System.out.printf("|");
                
                if (locations[row][col].isVisited() == true)
                {
                    System.out.printf("   X   ");
                }
                else
                {
                    System.out.printf("       ");
                }
                
                if (row == 0 && col == 12)
                {
                    System.out.printf("|\n|_______|_______|_______|_______|_______|_______|_______|_______|_______|_______|_______|_______|");
                    if (locations[row][col].isVisited() == true)
                    {
                        System.out.println("   X   |");
                    }
                    else
                    {
                        System.out.println("       |");
                    };
                }
            }
        }
        System.out.println("|\n|_______|_______|_______|_______|_______|_______|_______|_______|_______|_______|_______|_______|_______|");
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
