/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrail.view;

import java.util.Scanner;

/**
 *
 * @author BHart
 */
public abstract class View implements ViewInterface
{

    private String promptMessage;

    public String getPromptMessage()
    {
        return promptMessage;
    }

    public void setPromptMessage(String promptMessage)
    {
        this.promptMessage = promptMessage;
    }

    public View(String promptMessage) 
    {
        this.promptMessage = promptMessage;
    }
    
    @Override
    public void display()
    {
        String value = "";
        boolean done = false;

        do
        {
            System.out.println(this.promptMessage); //dispaly prompt message
            value = this.getInput(); //get value end user entered
            done = this.doAction(value); //do action based on value entered
        } while (!done);
    }

    @Override
    public String getInput()
    {
        Scanner keyboard = new Scanner(System.in);
        String value = null;
        boolean valid = false;

        System.out.println("Please enter an option:");
        
        // while a valid name has not been retrieved
        while (!valid)
        {
            // get the value entered from the keyboard
            value = keyboard.nextLine();
            value = value.trim();

            if (value.length() < 1) //blank value entered
            {
                System.out.println("You must enter a value.");
                continue;
            }

            break;
        }
        
        return value;
    }
}
