/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrail.view;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author BHart
 */
public class StartProgramView {
    
    public StartProgramView() {
        
    }
    
    public void startProgram() {
        
        //Display the game description and banner screen
        this.displayBanner();
        
        //Display Game Name Banner
        

        //Display Game Menu
        
    }

    private void displayBanner() {
        System.out.println("\n\n****************************************"
                           + "\n*                                      *"
                           + "\n* In the year 2042, astronomers pick   *"
                           + "\n* up a strange signal coming from      *"
                           + "\n* space. After pinpointing the         *"
                           + "\n* location of the transmission, they   *"
                           + "\n* found a mysterious object orbiting   *"
                           + "\n* Uranus.  Both the origin of this     *"
                           + "\n* object and the signal it is          *"
                           + "\n* transmitting have stumped Earth’s    *"
                           + "\n* scientists and researchers.          *"
                           + "\n*                                      *"
                           + "\n* You are one of the world’s leading   *"
                           + "\n* aerospace scientists.  You have      *"
                           + "\n* bravely signed up for to lead a crew *"
                           + "\n* on a 2-year mission to travel out to *"
                           + "\n* Uranus, investigate the object, and  *"
                           + "\n* then return back to Earth with your  *"
                           + "\n* findings.                            *"
                           + "\n*                                      *"
                           + "\n* What adventures and dangers will you *"
                           + "\n* find on the edge of space?           *"
                           + "\n*                                      *"
                           + "\n****************************************");
        
        System.out.println("\n\nPress any key to continue...");
        
        try {
            System.in.read();
        } catch (IOException ex) {
            Logger.getLogger(StartProgramView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows"))
            {
             Runtime.getRuntime().exec("cls");
            }
            else
            {
                Runtime.getRuntime().exec("clear");
            }
        } catch (final Exception e) {
        //  Handle any exceptions.
    }
        
        System.out.println("\n  _________      .__                 ___________             .__.__          "
                         + "\n /   _____/ ____ |  | _____ _______  \\__    ___/___________  |__|  |   ______"
                         + "\n \\_____  \\ /  _ \\|  | \\__  \\\\_  __ \\   |    |  \\_  __ \\__  \\ |  |  |  /  ___/"
                         + "\n /        (  <_> )  |__/ __ \\|  | \\/   |    |   |  | \\// __ \\|  |  |__\\___ \\ "
                         + "\n/_______  /\\____/|____(____  /__|      |____|   |__|  (____  /__|____/____  >"
                         + "\n        \\/                 \\/                              \\/             \\/ ");
    }
}
