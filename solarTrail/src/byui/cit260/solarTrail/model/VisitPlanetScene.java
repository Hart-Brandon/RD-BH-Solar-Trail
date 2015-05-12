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
 * @author rdunn42
 */
public class VisitPlanetScene implements Serializable{
    
    //Class instance variables
    private String description;
    private double travelTime;
    private boolean blocked;
    private String symbol;
    private int fuelAvailable;
    private int waterAvailable;
    private int foodAvailable;
            
        public VisitPlanetScene() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getFuelAvailable() {
        return fuelAvailable;
    }

    public void setFuelAvailable(int fuelAvailable) {
        this.fuelAvailable = fuelAvailable;
    }

    public int getWaterAvailable() {
        return waterAvailable;
    }

    public void setWaterAvailable(int waterAvailable) {
        this.waterAvailable = waterAvailable;
    }

    public int getFoodAvailable() {
        return foodAvailable;
    }

    public void setFoodAvailable(int foodAvailable) {
        this.foodAvailable = foodAvailable;
    }

    @Override
    public String toString() {
        return "VisitPlanetScene{" + "description=" + description + ", travelTime=" + travelTime + ", blocked=" + blocked + ", symbol=" + symbol + ", fuelAvailable=" + fuelAvailable + ", waterAvailable=" + waterAvailable + ", foodAvailable=" + foodAvailable + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.description);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.travelTime) ^ (Double.doubleToLongBits(this.travelTime) >>> 32));
        hash = 97 * hash + (this.blocked ? 1 : 0);
        hash = 97 * hash + Objects.hashCode(this.symbol);
        hash = 97 * hash + this.fuelAvailable;
        hash = 97 * hash + this.waterAvailable;
        hash = 97 * hash + this.foodAvailable;
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
        final VisitPlanetScene other = (VisitPlanetScene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (Double.doubleToLongBits(this.travelTime) != Double.doubleToLongBits(other.travelTime)) {
            return false;
        }
        if (this.blocked != other.blocked) {
            return false;
        }
        if (!Objects.equals(this.symbol, other.symbol)) {
            return false;
        }
        if (this.fuelAvailable != other.fuelAvailable) {
            return false;
        }
        if (this.waterAvailable != other.waterAvailable) {
            return false;
        }
        if (this.foodAvailable != other.foodAvailable) {
            return false;
        }
        return true;
    }

            
    
}
