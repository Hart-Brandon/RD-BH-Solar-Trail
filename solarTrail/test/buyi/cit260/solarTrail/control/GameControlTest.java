/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.solarTrail.control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author retro
 */
public class GameControlTest {
    
    public GameControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    /**
     * Test of endGame method, of class GameControl.
     */
    @Test
    public void testEndGame() {
        System.out.println("endGame");
        int difficultyLvl = 0;
        int numDays = 0;
        int totalResources = 0;
        int daysLeft = 0;
        GameControl instance = new GameControl();
        int expResult = 0;
        int result = instance.endGame(difficultyLvl, numDays, totalResources, daysLeft);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of highScore method, of class GameControl.
     */
    @Test
    public void testHighScore() {
        
        /**********************
         * Test Case #1
         **********************/
        System.out.println("highScore Valid Test");
        double difficultyLvl = 1;
        double crewAlive = 7;
        double eventsCleared = 15;
        double artifactScore = 4;
        GameControl instance = new GameControl();
        double expResult = 15812.50;
        double result = instance.highScore(difficultyLvl, crewAlive, eventsCleared, artifactScore);
        System.out.println(result);
        assertEquals(expResult, result, 0.0);
        
        /**********************
         * Test Case #2
         **********************/
        System.out.println("highScore Inalid Test 1");
        difficultyLvl = 4;
        crewAlive = 4;
        eventsCleared = 16;
        artifactScore = 4;
        instance = new GameControl();
        expResult = -1;
        result = instance.highScore(difficultyLvl, crewAlive, eventsCleared, artifactScore);
        System.out.println(result);
        assertEquals(expResult, result, 0.0);    
        
        /**********************
         * Test Case #3
         **********************/
        System.out.println("highScore Inalid Test 2");
        difficultyLvl = 3;
        crewAlive = -1;
        eventsCleared = 18;
        artifactScore = 2;
        instance = new GameControl();
        expResult = -1;
        result = instance.highScore(difficultyLvl, crewAlive, eventsCleared, artifactScore);
        System.out.println(result);
        assertEquals(expResult, result, 0.0);  
        
        /**********************
         * Test Case #4
         **********************/
        System.out.println("highScore Inalid Test 3");
        difficultyLvl = 1;
        crewAlive = 6;
        eventsCleared = 11;
        artifactScore = -1;
        instance = new GameControl();
        expResult = -1;
        result = instance.highScore(difficultyLvl, crewAlive, eventsCleared, artifactScore);
        System.out.println(result);
        assertEquals(expResult, result, 0.0);          
        
        /**********************
         * Test Case #5
         **********************/
        System.out.println("highScore Boundary Test 1");
        difficultyLvl = 1;
        crewAlive = 7;
        eventsCleared = 20;
        artifactScore = 7;
        instance = new GameControl();
        expResult = 23375;
        result = instance.highScore(difficultyLvl, crewAlive, eventsCleared, artifactScore);
        System.out.println(result);
        assertEquals(expResult, result, 0.0);         
        
        /**********************
         * Test Case #6
         **********************/
        System.out.println("highScore Boundary Test 2");
        difficultyLvl = 2;
        crewAlive = 5;
        eventsCleared = 20;
        artifactScore = 7;
        instance = new GameControl();
        expResult = 38250;
        result = instance.highScore(difficultyLvl, crewAlive, eventsCleared, artifactScore);
        System.out.println(result);
        assertEquals(expResult, result, 0.0);     
        
        /**********************
         * Test Case #7
         **********************/
        System.out.println("highScore Boundary Test 3");
        difficultyLvl = 3;
        crewAlive = 3;
        eventsCleared = 20;
        artifactScore = 7;
        instance = new GameControl();
        expResult = 44625;
        result = instance.highScore(difficultyLvl, crewAlive, eventsCleared, artifactScore);
        System.out.println(result);
        assertEquals(expResult, result, 0.0);          
    }        
    }
    

