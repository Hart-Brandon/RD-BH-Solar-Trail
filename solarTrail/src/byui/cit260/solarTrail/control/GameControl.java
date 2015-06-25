/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrail.control;

import byui.cit260.solarTrail.model.Game;
import byui.cit260.solarTrail.model.InventoryItem;
import byui.cit260.solarTrail.model.Location;
import byui.cit260.solarTrail.model.Map;
import byui.cit260.solarTrail.model.Player;
import byui.cit260.solarTrail.model.Scene;
import byui.cit260.solarTrail.model.Scene.SceneType;
import byui.cit260.solarTrail.model.Ship;
import java.util.Scanner;
import solartrail.SolarTrail;

/**
 *
 * @author BHart
 */
public class GameControl
{
    private final String ERROR_MSG = "The value entered is invalid.";

    public static InventoryItem[] getSortedInventoryList()
    {
        InventoryItem[] originalInventoryList = SolarTrail.getCurrentGame().getInventory();
        
        //make a copy
        InventoryItem[] inventoryList = originalInventoryList.clone();
        
        //Using a bubblesort to sort inventoryList by name
        InventoryItem tempInventoryItem;
        for (int i = 0; i < inventoryList.length-1; i++)
        {
            for (int j = 0; j < inventoryList.length-1-i; j++)
            {
                if (inventoryList[j].getDescription().compareToIgnoreCase(inventoryList[j + 1].getDescription()) > 0)
                {
                    tempInventoryItem = inventoryList[j];
                    inventoryList[j] = inventoryList[j + 1];
                    inventoryList[j + 1] = tempInventoryItem;
                }
            }
        }
        
        return inventoryList;
    }

    public static void assignScenesToLocations(Map map, Scene[] scenes)
    {
        Location[][] locations = map.getLocations();

        locations[0][0].setScene(scenes[SceneType.start.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.space.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.space.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.planet.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.space.ordinal()]);
        locations[0][5].setScene(scenes[SceneType.space.ordinal()]);
        locations[0][6].setScene(scenes[SceneType.planet.ordinal()]);
        locations[0][7].setScene(scenes[SceneType.space.ordinal()]);
        locations[0][8].setScene(scenes[SceneType.space.ordinal()]);
        locations[0][9].setScene(scenes[SceneType.planet.ordinal()]);
        locations[0][10].setScene(scenes[SceneType.space.ordinal()]);
        locations[0][11].setScene(scenes[SceneType.space.ordinal()]);
        locations[0][12].setScene(scenes[SceneType.artifact.ordinal()]);
        locations[1][12].setScene(scenes[SceneType.space.ordinal()]);
        locations[1][11].setScene(scenes[SceneType.space.ordinal()]);
        locations[1][10].setScene(scenes[SceneType.planet.ordinal()]);
        locations[1][9].setScene(scenes[SceneType.space.ordinal()]);
        locations[1][8].setScene(scenes[SceneType.space.ordinal()]);
        locations[1][7].setScene(scenes[SceneType.planet.ordinal()]);
        locations[1][6].setScene(scenes[SceneType.space.ordinal()]);
        locations[1][5].setScene(scenes[SceneType.space.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.planet.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.space.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.space.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.space.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.finish.ordinal()]);
    }

    public enum Item
    {

        food,
        fuel,
        water;
    }

    private static InventoryItem[] createInventoryList()
    {
        InventoryItem[] inventory = new InventoryItem[14];

        InventoryItem food = new InventoryItem();
        food.setDescription("Food");
        food.setQuantityInStock(0);
        food.setRequiredAmount(0);
        inventory[Item.food.ordinal()] = food;

        InventoryItem fuel = new InventoryItem();
        fuel.setDescription("Fuel");
        fuel.setQuantityInStock(0);
        fuel.setRequiredAmount(0);
        inventory[Item.fuel.ordinal()] = fuel;

        InventoryItem water = new InventoryItem();
        water.setDescription("Water");
        water.setQuantityInStock(0);
        water.setRequiredAmount(0);
        inventory[Item.water.ordinal()] = water;

        return inventory;
    }

    public static void createNewGame(Player player)
    {
        Game game = new Game();
        SolarTrail.setCurrentGame(game);
        /**
         * game.setPlayer(player);
         *
         * InventoryItem[] inventoryList = GameControl.createInventoryList();
         * game.setInventory(inventoryList);
         *
         * Ship ship = new Ship(); game.setShip(ship);
         *
         * Map map = MapControl.createMap(); game.setMap(map);
         *
         * MapControl.moveActorsToStartingLocation(map); 
        *
         */
    }

    public static void saveGame()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int endGame(double difficultyLvl, int numDays, int totalResources,
            int daysLeft)
    {
        if (numDays > daysLeft || numDays < 0)
        {
            return -1;
        }

        int resourcesLeft = (int) ((int) totalResources - (1 - (1 * difficultyLvl)) * numDays);

        if (resourcesLeft < 0)
        {
            return -1;
        }

        return resourcesLeft;
    }

    public double highScore(double difficultyLvl, double crewAlive, double eventsCleared,
            double artifactScore)
    {
        if (difficultyLvl > 3)
        {
            return -1;
        }
        if (crewAlive < 0)
        {
            return -1;
        }
        if (artifactScore < 0)
        {
            return -1;
        }
        if (eventsCleared < 0)
        {
            return -1;
        }

        double score = (double) (difficultyLvl * .5) * (1 + (crewAlive * .25)) * ((eventsCleared * 500) + (artifactScore * 1000));

        if (score < 0)
        {
            return -1;
        }

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
            if (artifactTime < 0 || artifactTime > 60)
            {
                System.out.println(ERROR_MSG);
                break;
            } else
            {
                artifactTime = scanner.nextInt();
            }
        }
        return artifactTime;
    }
}
