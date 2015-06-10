/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrail.view;

import byui.cit260.solarTrail.control.GameControl;
import byui.cit260.solarTrail.model.Player;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author BHart and Rdunn
 */
public class StartProgramView 
{
    
    public StartProgramView() 
    {
        
    }
    
    public void startProgram() 
    {
        
        //Display the game description and banner screen
        this.displayBanner();
        
        //Display the Main Menu
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.displayMenu();
        
        //Prompt user to enter their characters name
        String playersName = this.getPlayersName();
        
        //Create and save the player object
        Player player = GameControl.createPlayer(playersName);
      
        //Display a personalized welcome message
        this.displayWelcomeMessage(player);
        //Move into the ship menu
        ShipMenuView shipMenu = new ShipMenuView();
        shipMenu.displayShipMenu();
    }

    private void displayBanner() 
    {
        System.out.println("\n\n\t\t****************************************"
                           + "\n\t\t*                                      *"
                           + "\n\t\t* In the year 2042, astronomers pick   *"
                           + "\n\t\t* up a strange signal coming from      *"
                           + "\n\t\t* space. After pinpointing the         *"
                           + "\n\t\t* location of the transmission, they   *"
                           + "\n\t\t* found a mysterious object orbiting   *"
                           + "\n\t\t* Uranus.  Both the origin of this     *"
                           + "\n\t\t* object and the signal it is          *"
                           + "\n\t\t* transmitting have stumped Earth’s    *"
                           + "\n\t\t* scientists and researchers.          *"
                           + "\n\t\t*                                      *"
                           + "\n\t\t* You are one of the world’s leading   *"
                           + "\n\t\t* aerospace scientists.  You have      *"
                           + "\n\t\t* bravely signed up for to lead a crew *"
                           + "\n\t\t* on a 2-year mission to travel out to *"
                           + "\n\t\t* Uranus, investigate the object, and  *"
                           + "\n\t\t* then return back to Earth with your  *"
                           + "\n\t\t* findings.                            *"
                           + "\n\t\t*                                      *"
                           + "\n\t\t* What adventures and dangers will you *"
                           + "\n\t\t* find on the edge of space?           *"
                           + "\n\t\t*                                      *"
                           + "\n\t\t****************************************");
        
        System.out.println("\n\nPress any key to continue...");
        
        try 
        {
            System.in.read();
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(StartProgramView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Should clear the screen for Game banner and Main Menu
        try 
        {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows"))
            {
             Runtime.getRuntime().exec("cls");
            }
            else
            {
                Runtime.getRuntime().exec("clear");
            }
        } 
        catch (final Exception e) 
        {
        //  Handle any exceptions.
        }
        
        System.out.println("\n  _________      .__                 ___________             .__.__          "
                         + "\n /   _____/ ____ |  | _____ _______  \\__    ___/___________  |__|  |   ______"
                         + "\n \\_____  \\ /  _ \\|  | \\__  \\\\_  __ \\   |    |  \\_  __ \\__  \\ |  |  |  /  ___/"
                         + "\n /        (  <_> )  |__/ __ \\|  | \\/   |    |   |  | \\// __ \\|  |  |__\\___ \\ "
                         + "\n/_______  /\\____/|____(____  /__|      |____|   |__|  (____  /__|____/____  >"
                         + "\n        \\/                 \\/                              \\/             \\/ ");
    }

    public String getPlayersName() 
    {
        boolean valid = false; //indicates if the name has been retrieved
        String playersName = null;
        Scanner keyboard = new Scanner(System.in);
        
        while (!valid)
        {
            //Prompt for character's name
            System.out.println("Enter the character's name below:");
            
            //Get Character name and trim off the blank spaces
            playersName = keyboard.nextLine();
            playersName = playersName.trim();
            
            //Check if name is valid (2+ character length)
            if (playersName.length() < 2)
            {
                System.out.println("Invalid name - must be longer than 2 characters");
                continue; //prompt user again
            }
            break; //Exit while loop
        }
        
        return playersName;
    }

    private void displayWelcomeMessage(Player player) 
    {
        System.out.println("\n\n========================================"
                         + "\n  Dr. " + player.getName() + ", welcome to the "
                         + "\n  expedition. We have 3 ships you "
                         + "\n  can choose from for your journey.");
                  }
}
