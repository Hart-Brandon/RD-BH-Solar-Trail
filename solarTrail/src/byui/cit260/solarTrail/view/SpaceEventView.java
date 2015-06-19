/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrail.view;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author BHart and RDunn
 */
public class SpaceEventView extends View
{
    public SpaceEventView()
    {
    super("\nYou have arrived in Sector X");  
    
    //This is currently showing up after the event - fix this later.
    
    Random rand = new Random();
    RandomEvent event = new RandomEvent();
    int spaceevent = event.showRandomInteger(0, 2, rand);
       
    switch (spaceevent)
        {
            case 0: //Asteroid Hit
            System.out.println("An asteroid has hit your ship!"
                    + "\n\n A. Call all hands to go investigate the strike point!"
                    + "\n\n B. Send one engineer to investigate.");
                break;
            case 1: //Alien Attack
            System.out.println("Little Green Men are attacking your ship!"
                    + "\n\n A. Battle Stations! Let's fight them off!"
                    + "\n\n B. Run away! Run Away");
                break;
            case 2: //Space Disease
            System.out.println("A virus has infected the ship, your crew are dying!"
                    + "\n\n A. Let's look for a cure down on the planet!"
                    + "\n\n B. Let the Doctor handle it, he knows what he's doing.");
                break;
            default:
                System.out.println("\n***Invalid Selection.  Try Again.***");
                break;
        }
    
    }
      
       
    @Override
    public boolean doAction(Object obj)
    {
        String value = (String) obj;

        value = value.toUpperCase(); //convert to all upper case
        char choice = value.charAt(0); //get first character entered

        switch (choice)
        {
            case 'A': //Choice A
                System.out.println("\n***Choice A Selected***");
                break;
            case 'B': //Choice B
                System.out.println("\n***Choice B Selected***");
                break;
            default:
                System.out.println("\n***Invalid Selection.  Try Again.***");
                break;
        }
        return true;
    }

    
}
