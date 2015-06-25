/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrail.model;

import java.io.Serializable;
import byui.cit260.solarTrail.control.GameControl;
import byui.cit260.solarTrail.view.StartProgramView;

/**
 *
 * @author rdunn42
 */
public class Game implements Serializable {

    //Class instance variables
    private double totalTime;
    
    private Ship ship;
    private Player player;
    private Map map;
    private InventoryItem[] inventory; //Keep track of in-game items
    private String[] actors; //List of actors (NPCs and Crew)

    public Game() {
        ship = new Ship();
        player = new Player();
        map = new Map();
        inventory = new InventoryItem[]{};
        actors = new String[]{};
    }

    public double getTotalTime()
    {
        return totalTime;
    }

    public void setTotalTime(double totalTime)
    {
        this.totalTime = totalTime;
    }

    public Ship getShip()
    {
        return ship;
    }

    public void setShip(Ship ship)
    {
        this.ship = ship;
    }

    public Player getPlayer()
    {
        return player;
    }

    public void setPlayer(Player player)
    {
        this.player = player;
    }

    public Map getMap()
    {
        return map;
    }

    public void setMap(Map map)
    {
        this.map = map;
    }

    public InventoryItem[] getInventory()
    {
        return inventory;
    }

    public void setInventory(InventoryItem[] inventory)
    {
        this.inventory = inventory;
    }

    public String[] getActors()
    {
        return actors;
    }

    public void setActors(String[] actors)
    {
        this.actors = actors;
    }
/**
    @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.totalTime) ^ (Double.doubleToLongBits(this.totalTime) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        return Double.doubleToLongBits(this.totalTime) == Double.doubleToLongBits(other.totalTime);
    }
  **/
}
