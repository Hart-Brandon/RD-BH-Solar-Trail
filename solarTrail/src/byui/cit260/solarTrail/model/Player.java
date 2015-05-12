/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrail.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author BHart and rdunn42
 */
public class Player implements Serializable{
    
    // class instance variables
    private String name;
    private double highscore;

    public Player() {
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHighscore() {
        return highscore;
    }

    public void setHighscore(double highscore) {
        this.highscore = highscore;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", highscore=" + highscore + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.highscore) ^ (Double.doubleToLongBits(this.highscore) >>> 32));
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
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (Double.doubleToLongBits(this.highscore) != Double.doubleToLongBits(other.highscore)) {
            return false;
        }
        return true;
    }
    
    
}


