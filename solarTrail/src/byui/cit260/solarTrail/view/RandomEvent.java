/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrail.view;

import java.util.Random;

/**
 *
 * @author retro
 */
public final class RandomEvent
{

    public static final void main(String... aArgs)
    {
        int START = 1;
        int END = 50;
        Random random = new Random();
        {
            showRandomInteger(START, END, random);
        }
    }

    public static int showRandomInteger(int aStart, int aEnd, Random aRandom)
    {
        if (aStart > aEnd)
        {
            throw new IllegalArgumentException("Start cannot exceed End.");
        }
        //get the range, casting to long to avoid overflow problems
        long range = (long) aEnd - (long) aStart + 1;
        // compute a fraction of the range, 0 <= frac < range
        long fraction = (long) (range * aRandom.nextDouble());
        int randomNumber = (int) (fraction + aStart);
        log("Generated : " + randomNumber);
        return randomNumber;
    }

    private static void log(String aMessage)
    {
        System.out.println(aMessage);
    }
    
    
}