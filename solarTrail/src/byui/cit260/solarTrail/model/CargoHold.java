/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrail.model;

import java.io.Serializable;

/**
 *
 * @author rdunn42
 */
public class CargoHold implements Serializable{
    
    //Class instance variables
    private int maxQuantity;

    public CargoHold() {
    }

    public int getMaxQuantity() {
        return maxQuantity;
    }

    public void setMaxQuantity(int maxQuantity) {
        this.maxQuantity = maxQuantity;
    }

    @Override
    public String toString() {
        return "CargoHold{" + "maxQuantity=" + maxQuantity + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + this.maxQuantity;
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
        final CargoHold other = (CargoHold) obj;
        if (this.maxQuantity != other.maxQuantity) {
            return false;
        }
        return true;
    }
}
