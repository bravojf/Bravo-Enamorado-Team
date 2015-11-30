/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.control;

import MapControlException.MapControlException;
import byui.cit260.josephInEgypt.model.Actor;
import byui.cit260.josephInEgypt.model.Game;
import byui.cit260.josephInEgypt.model.Map;
import java.awt.Point;
import josephinegypt.JosephInEgypt;

/**
 *
 * @author Marvin y Amada
 */
public class MapControl {
 private static Object staringScene;
 
 private static Map createMap() {
  // create the map
  Map map = new Map(20, 20);
  
  // create a list of different scenes in the game
  Scene[] scenes = crateScenes();
  
  // assign the different scenes to location in the map
  GameControl.assignScenesToLocations(map, scenes);
  
  return map;
 }

 public static int moveActorsToStartingLocation(Map map)throws MapControlException {
               
  Actor[] actors = Actor.values();
  
  for (Actor actor : actors) {
   Point coordinates = actor.getCoordinates();
   int returnValue = MapControl.moveActorToLocation(actor, coordinates);
  }
  return 0;
 }

 private static Scene[] crateScenes() {
  Game game = JosephInEgypt.getCurrentGame();
  
  Scene[] scenes = new Scene[SceneType.values().length];
  
  Scene startingScene = new Scene();
  startingScene.setDescription(
          "\nNow therefore let Pharaoh look out a man discreet and wise, and set him over the land of"
         +"Egypt. Let Pharaoh do this, and let him appoint officers over the land, and take up the" 
         +"fifth part of the land of Egypt in the seven plenteous years. And let them gather all"
         +"the food of those good years that come, and lay up corn under the hand of Pharaoh, and let"
         +"them keep food in the cities."
         +"\nJoseph has been given power over the land and now he must become the savior of Egypt."
         +"\nAs the major officer in Egypt, Joseph will administer all the preparations for the 7"
         +"harsh years of drought."
   );
  startingScene.setMapSymbol(" ST ");
  startingScene.setBlocked(false);
  startingScene.setTravelTime(240);
  scenes[SceneType.start.ordinal()] = startingScene;
  
    Scene cattleScene = new Scene();
  cattleScene.setDescription(
          "\nNow therefore let Pharaoh look out a man discreet and wise, and set him over the land of"
         +"Egypt. Let Pharaoh do this, and let him appoint officers over the land, and take up the" 
         +"fifth part of the land of Egypt in the seven plenteous years. And let them gather all"
         +"the food of those good years that come, and lay up corn under the hand of Pharaoh, and let"
         +"them keep food in the cities."
         +"\nJoseph has been given power over the land and now he must become the savior of Egypt."
         +"\nAs the major officer in Egypt, Joseph will administer all the preparations for the 7"
         +"harsh years of drought."
   );
  cattleScene.setMapSymbol(" CT ");
  cattleScene.setBlocked(false);
  cattleScene.setTravelTime(240);
  scenes[SceneType.cattle.ordinal()] = cattleScene;
  
  Scene finishScene = new Scene();
  finishScene.setDescription(
          "\nNow therefore let Pharaoh look out a man discreet and wise, and set him over the land of"
         +"Egypt. Let Pharaoh do this, and let him appoint officers over the land, and take up the" 
         +"fifth part of the land of Egypt in the seven plenteous years. And let them gather all"
         +"the food of those good years that come, and lay up corn under the hand of Pharaoh, and let"
         +"them keep food in the cities."
         +"\nJoseph has been given power over the land and now he must become the savior of Egypt."
         +"\nAs the major officer in Egypt, Joseph will administer all the preparations for the 7"
         +"harsh years of drought."
   );
  finishScene.setMapSymbol(" FS ");
  finishScene.setBlocked(false);
  finishScene.setTravelTime(Double.POSITIVE_INFINITY);
  scenes[SceneType.finish.ordinal()] = finishScene;
  
  return scenes;
  
 }

 private static void assignScenesToLocations(Map map, Scene[] scenes) {
  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
 }

 private static int moveActorToLocation(Actor actor, Point coordinates) {
  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
 }
 
 private static class Scene {

  public Scene() {
  }

  private void setDescription(String string) {
   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  private void setMapSymbol(String _st_) {
   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  private void setBlocked(boolean b) {
   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  private void setTravelTime(int i) {
   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  private void setTravelTime(double POSITIVE_INFINITY) {
   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
 }

 private static class SceneType {
  private static Object start;
  private static Object finish;
  private static Object cattle;

  private static Object values() {
   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  public SceneType() {
  }
 }
 
}
