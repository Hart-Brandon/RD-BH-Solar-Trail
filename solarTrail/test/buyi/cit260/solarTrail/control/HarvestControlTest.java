/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.solarTrail.control;

import byui.cit260.solarTrail.control.HarvestControl;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author BHart & RDunn
 */
public class HarvestControlTest {
    
    public HarvestControlTest() {
    }

    /**
     * Test of huntForResources method, of class HarvestControl.
     */
    @Test
    public void testHuntForResources() {
        
        /**********************
         * Test Case #1
         **********************/
        System.out.println("huntForResources Valid Test");
        int amountAvailable = 50;
        int amountToHarvest = 30;
        int numCrew = 3;
        int actualCrew = 4;
        int cargoSpaceLeft = 30;
        int daysLeft = 100;
        HarvestControl instance = new HarvestControl();
        int expResult = 12;
        int result = instance.huntForResources(amountAvailable, amountToHarvest, 
                numCrew, actualCrew, cargoSpaceLeft, daysLeft);
        System.out.println(result);
        assertEquals(expResult, result);
        
        
        /**********************
         * Test Case #2
         **********************/
        System.out.println("huntForResources Invalid Test 1");
        amountAvailable = 1;
        amountToHarvest = 30;
        numCrew = 3;
        actualCrew = 4;
        cargoSpaceLeft = 30;
        daysLeft = 100;
        instance = new HarvestControl();
        expResult = -1;
        result = instance.huntForResources(amountAvailable, amountToHarvest, 
                numCrew, actualCrew, cargoSpaceLeft, daysLeft);
        System.out.println(result);
        assertEquals(expResult, result);
        
        /**********************
         * Test Case #3
         **********************/
        System.out.println("huntForResources Invalid Test 2");
        amountAvailable = 50;
        amountToHarvest = 51;
        numCrew = 3;
        actualCrew = 4;
        cargoSpaceLeft = 30;
        daysLeft = 100;
        instance = new HarvestControl();
        expResult = -1;
        result = instance.huntForResources(amountAvailable, amountToHarvest, 
                numCrew, actualCrew, cargoSpaceLeft, daysLeft);
        System.out.println(result);
        assertEquals(expResult, result);
        
        /**********************
         * Test Case #4
         **********************/
        System.out.println("huntForResources Invalid Test 3");
        amountAvailable = 50;
        amountToHarvest = 30;
        numCrew = 5;
        actualCrew = 4;
        cargoSpaceLeft = 30;
        daysLeft = 100;
        instance = new HarvestControl();
        expResult = -1;
        result = instance.huntForResources(amountAvailable, amountToHarvest, 
                numCrew, actualCrew, cargoSpaceLeft, daysLeft);
        System.out.println(result);
        assertEquals(expResult, result);
        
        /**********************
         * Test Case #5
         **********************/
        System.out.println("huntForResources Invalid Test 4");
        amountAvailable = 50;
        amountToHarvest = 30;
        numCrew = 6;
        actualCrew = 7;
        cargoSpaceLeft = 30;
        daysLeft = 1;
        instance = new HarvestControl();
        expResult = -1;
        result = instance.huntForResources(amountAvailable, amountToHarvest, 
                numCrew, actualCrew, cargoSpaceLeft, daysLeft);
        System.out.println(result);
        assertEquals(expResult, result);
        
        /**********************
         * Test Case #6
         **********************/
        System.out.println("huntForResources Boundry Test 1");
        amountAvailable = 50;
        amountToHarvest = 30;
        numCrew = 1;
        actualCrew = 7;
        cargoSpaceLeft = 30;
        daysLeft = 730;
        instance = new HarvestControl();
        expResult = 15;
        result = instance.huntForResources(amountAvailable, amountToHarvest, 
                numCrew, actualCrew, cargoSpaceLeft, daysLeft);
        System.out.println(result);
        assertEquals(expResult, result);
        
        /**********************
         * Test Case #7
         **********************/
        System.out.println("huntForResources Boundry Test 2");
        amountAvailable = 50;
        amountToHarvest = 1;
        numCrew = 6;
        actualCrew = 7;
        cargoSpaceLeft = 30;
        daysLeft = 730;
        instance = new HarvestControl();
        expResult = 0;
        result = instance.huntForResources(amountAvailable, amountToHarvest, 
                numCrew, actualCrew, cargoSpaceLeft, daysLeft);
        System.out.println(result);
        assertEquals(expResult, result);
    }  
}
