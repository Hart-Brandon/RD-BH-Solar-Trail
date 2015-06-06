/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrail.view;

import java.util.Scanner;

/**
 *
 * @author BHart and RDunn
 */
public class MainMenuView {
    
    private final String MENU = "\n"
           + "\t\t\t\tN - New Game\n" 
           + "\t\t\t\tL - Load Game\n" 
           + "\t\t\t\tH - Help\n" 
           + "\t\t\t\tQ - Quit\n";
    
    public void displayMenu() {
        
        char selection = ' ';
        do 
        {
            
            System.out.println(MENU);
         
            String input = this.getInput();
            selection = input.charAt(0);
            selection = Character.toUpperCase(selection);
            this.doAction(selection);
            
        } 
        while (selection != 'Q');
        }
    
        public String getInput() 
    {
        boolean valid = false; //indicates if the name has been retrieved
        String input = null;
        Scanner keyboard = new Scanner(System.in);
        
        while (!valid)
        {
            //Prompt for response
            System.out.println("Enter your response below:");
            
            //Get response and trim off the blank spaces
            input = keyboard.nextLine();
            input = input.trim();
            
            //Check if name is valid (-2 character length)
            if (input.length() > 1)
            {
                System.out.println("Invalid Entry - Please type one letter.");
                continue; //prompt user again
            }
            break; //Exit while loop
        }
        
        return input;
    }
        
        public void doAction(char choice)
        {
        
            switch (choice) {
            case 'N': //New Game
                this.newGame();
                break;
            case 'L': //Load Game
                this.loadGame();
                break;
            case 'H': //Help Menu
                this.helpMenu();
                break;
            case 'Q': //Quit
                return;
            default:
                System.out.println("\n***Invalid Selection.  Try Again.***");
                break;
        }
        }
        
        private void newGame() {
            System.out.println("***newGame funtion called***");
        }
        
        private void loadGame() {
            System.out.println("***loadGame funtion called***");
        }
                
        private void helpMenu() {
            HelpMenuView helpMenuView = new HelpMenuView();
            helpMenuView.displayHelpMenu();
        }
        
}