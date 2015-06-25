/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrail.model;

import byui.cit260.solarTrail.control.GameControl;
import static byui.cit260.solarTrail.model.Scene.createScenes;
import java.io.Serializable;

/**
 *
 * @author rdunn42
 */
public class Map implements Serializable
{

    //Class instance variables
    private int rowCount;
    private int columnCount;
    private Location[][] locations;

    public Map()
    {
        rowCount = 0;
        columnCount = 0;
    }

    public Map(int numRows, int numCols)
    {
        if (numRows < 1 || numCols < 1)
        {
            System.out.println("The number of rows and columns must be > zero");
            return;
        }

        this.rowCount = numRows;
        this.columnCount = numCols;

        //create 2-D array for Location objects
        this.locations = new Location[numRows][numCols];

        for (int row = 0; row < numRows; rowCount++)
        {
            for (int column = 0; column < numCols; column++)
            {
                //create and initialize new Location object instance
                Location location = new Location(row, column);
                //assign the Location object to the current position in array
                locations[row][column] = location;
            }
        }
    }

    public int getRowCount()
    {
        return rowCount;
    }

    public void setRowCount(int rowCount)
    {
        this.rowCount = rowCount;
    }

    public int getColumnCount()
    {
        return columnCount;
    }

    public void setColumnCount(int columnCount)
    {
        this.columnCount = columnCount;
    }

    public Location[][] getLocations()
    {
        return locations;
    }

    public void setLocations(Location[][] locations)
    {
        this.locations = locations;
    }

    private static Map createMap()
    {
        //Create the map
        Map map = new Map(13, 2);

        //create the scenes for the game
        Scene[] scenes = createScenes();

        //assign scenes to locations
        GameControl.assignScenesToLocations(map, scenes);

        return map;
    }

    @Override
    public String toString()
    {
        return "Map{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + '}';
    }

    @Override
    public int hashCode()
    {
        int hash = 3;
        hash = 97 * hash + this.rowCount;
        hash = 97 * hash + this.columnCount;
        return hash;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        final Map other = (Map) obj;
        if (this.rowCount != other.rowCount)
        {
            return false;
        }
        if (this.columnCount != other.columnCount)
        {
            return false;
        }
        return true;
    }

}
