/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrail.model;

import java.awt.image.BufferedImage;
import java.io.Serializable;
import solartrail.SolarTrail;

/**
 *
 * @author BHart
 */
public class Scene implements Serializable 
{ 
    private static String description;
    private static Object SceneType;
    private static String mapSymbol;
    private static boolean blocked;
    private static double travelTime;

    
    
    public static String getMapSymbol()
    {
        return mapSymbol;
    }

    public static void setMapSymbol(String mapSymbol)
    {
        Scene.mapSymbol = mapSymbol;
    }

    public static boolean isBlocked()
    {
        return blocked;
    }

    public static void setBlocked(boolean blocked)
    {
        Scene.blocked = blocked;
    }

    public static double getTravelTime()
    {
        return travelTime;
    }

    public static void setTravelTime(double travelTime)
    {
        Scene.travelTime = travelTime;
    }

    public static String getDescription()
    {
        return description;
    }

    public static void setDescription(String description)
    {
        Scene.description = description;
    }

    public static Object getSceneType()
    {
        return SceneType;
    }

    public static void setSceneType(Object SceneType)
    {
        Scene.SceneType = SceneType;
    }
    
        
    public enum SceneType
    {
        start,
        space,
        planet,
        artifact,
        finish
    }
    
    public static Scene createScenes() //throws MapControlException
    {
        BufferedImage image = null;
        
        Game game = SolarTrail.getCurrentGame();
        
        //Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene startingScene = new Scene();
        startingScene.setDescription("\nYou set off for your space adventure "
                + "amongst cheers, confetti, and the ters of your loved ones. "
                + "Your brave crew is saluted by the presidency of the United "
                + "Earth Alliance, and with the entire world holding it's "
                + "breath, you give the command to disembark.");
        startingScene.setMapSymbol("ST");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(240);
        //ImageIcon startingSceneImage = MapControl.getImage(startingScene, image filepath);
        //startingScene.setIcon(startingSceneImage);
        //scenes[SceneType.start.ordinal[()] = startingScene;
        
        Scene finishScene = new Scene();
        finishScene.setDescription("\nYou arrive home amid cheers and revelry. "
                + "The families of the surviving crew members celebrate a safe "
                + "homecoming, and you take a moment with the families of those "
                + "who fell, to mourn with them. Finally, behind closed doors at "
                + "a United Earth Alliance Senate meeting, you reveal the results "
                + "of your journey to the edge of space.");
        finishScene.setMapSymbol("FN");
        finishScene.setBlocked(false);
        finishScene.setTravelTime(Double.POSITIVE_INFINITY);
        //ImageIcon startingSceneImage = MapControl.getImage(finishScene, image filepath);
        //finishScene.setIcon(finishSceneImage);
        //scenes[SceneType.finish.ordinal[()] = finishScene;
        
        return startingScene;
    }
}
