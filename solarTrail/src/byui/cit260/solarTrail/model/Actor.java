/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrail.model;

import java.io.Serializable;

/**
 *
 * @author BHart
 */
public enum Actor implements Serializable
{

    //Game Crew and NPCs
    Gimli("Has the axe"),
    Aragorn("Has the swords"),
    Frodo("Has the ring"),
    Gandalf("Wizard"),
    Merry("Short #1"),
    Pippin("Short #2"),
    Smaug("Dragon");

    //Class instance variables
    private final String description;
    private final Location coordinates;

    Actor(String description)
    {
        this.description = description;
        coordinates = new Location(1, 1);
    }

    public String getDescription()
    {
        return description;
    }

    public Location getCoordinates()
    {
        return coordinates;
    }
    /**
     * @Override public String toString() { return "Actor{" + "name=" + name +
     * ", description=" + description + ", coordinates=" + coordinates + '}'; }
*
     */
}
