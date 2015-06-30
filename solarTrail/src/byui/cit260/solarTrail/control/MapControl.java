/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrail.control;

import byui.cit260.solarTrail.exceptions.MapControlException;
import byui.cit260.solarTrail.model.Actor;
import byui.cit260.solarTrail.model.Location;
import byui.cit260.solarTrail.model.Map;
import solartrail.SolarTrail;

/**
 *
 * @author BHart
 */
public class MapControl extends Control
{

    public MapControl()
    {
        super("\t*************"
                + "\t*    Map    *"
                + "\t*************");
    }

    public static void moveActorsToLocation(Actor actor, Location coordinates)
            throws MapControlException
    {

        Map map = SolarTrail.getCurrentGame().getMap();
        int newRow = coordinates.getRow()-1;
        int newColumn = coordinates.getColumn()-1;

        if (newRow < 0 || newRow >= map.getRowCount()
        || newColumn < 0 || newColumn >= map.getColumnCount())
        {
            throw new MapControlException("Can not move actor to location "
                    + coordinates.getRow() + ", " + coordinates.getColumn()
                    + " because that location is outside "
                    + " the bounds of the map.");
        }
    }        
 
    public static void moveActorsToStartingLocation(Map map)
                throws MapControlException
        {
         // for every actor
            Actor[] actors = Actor.values();
            
            for (Actor actor : actors) 
            {
                Location coordinates = actor.getCoordinates();
                MapControl.moveActorsToLocation(actor, coordinates);
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
            case 'T': //Travel 
                System.out.println("selectItem function");
                break;
            case 'H': //Harvest Resources 
                System.out.println("healStatus function");
                break;
            case 'S': //Ship Menu
                System.out.println("shipControl function");
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
}
