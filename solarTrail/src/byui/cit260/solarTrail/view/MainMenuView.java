/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrail.view;

/**
 *
 * @author BHart and RDunn
 */
public class MainMenuView extends View
{

    public MainMenuView()
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

        switch (value)
        {
            case "N": //New Game
                this.newGame();
                break;
            case "L": //Load Game
                this.loadGame();
                break;
            case "H": //Help Menu
                this.helpMenu();
                break;
            case "Q": //Quit
                System.exit(0);
                break;
            default:
                System.out.println("\n***Invalid Selection.  Try Again.***");
                break;
        }
        return true;
    }

    private void newGame()
    {
        System.out.println("***newGame funtion called***");
    }

    private void loadGame()
    {
        System.out.println("***loadGame funtion called***");
    }

    private void helpMenu()
    {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }
}
