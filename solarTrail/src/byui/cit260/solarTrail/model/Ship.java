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
 * @author BHart
 */
public class Ship implements Serializable{
    
    // Class instance variables
    private String description;
    private String status;
    private int size;
    private int minCrewCapacity;
    private int maxCrewCapacity;
    private int actualCrewSize;
    private int cargoCapacity;
    private double speed;

    //Default Constructor
    public Ship() {
    }
    
    //Getters & Setters
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getMinCrewCapacity() {
        return minCrewCapacity;
    }

    public void setMinCrewCapacity(int minCrewCapacity) {
        this.minCrewCapacity = minCrewCapacity;
    }

    public int getMaxCrewCapacity() {
        return maxCrewCapacity;
    }

    public void setMaxCrewCapacity(int maxCrewCapacity) {
        this.maxCrewCapacity = maxCrewCapacity;
    }

    public int getActualCrewSize() {
        return actualCrewSize;
    }

    public void setActualCrewSize(int actualCrewSize) {
        this.actualCrewSize = actualCrewSize;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    //Object Override functions
    @Override
    public String toString() {
        return "Ship{" + "description=" + description + ", status=" + status + ", size=" + size + ", minCrewCapacity=" + minCrewCapacity + ", maxCrewCapacity=" + maxCrewCapacity + ", actualCrewSize=" + actualCrewSize + ", cargoCapacity=" + cargoCapacity + ", speed=" + speed + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.description);
        hash = 53 * hash + Objects.hashCode(this.status);
        hash = 53 * hash + this.size;
        hash = 53 * hash + this.minCrewCapacity;
        hash = 53 * hash + this.maxCrewCapacity;
        hash = 53 * hash + this.actualCrewSize;
        hash = 53 * hash + this.cargoCapacity;
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.speed) ^ (Double.doubleToLongBits(this.speed) >>> 32));
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
        final Ship other = (Ship) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        if (this.size != other.size) {
            return false;
        }
        if (this.minCrewCapacity != other.minCrewCapacity) {
            return false;
        }
        if (this.maxCrewCapacity != other.maxCrewCapacity) {
            return false;
        }
        if (this.actualCrewSize != other.actualCrewSize) {
            return false;
        }
        if (this.cargoCapacity != other.cargoCapacity) {
            return false;
        }
        return Double.doubleToLongBits(this.speed) == Double.doubleToLongBits(other.speed);
    }
    
    
}
