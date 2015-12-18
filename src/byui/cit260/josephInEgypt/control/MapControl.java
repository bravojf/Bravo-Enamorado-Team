/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.control;

import ControlException.MapControlException;
import byui.cit260.josephInEgypt.model.Actor;
import byui.cit260.josephInEgypt.model.Game;
import byui.cit260.josephInEgypt.model.Location;
import byui.cit260.josephInEgypt.model.Map;
import java.awt.Point;
import josephinegypt.JosephInEgypt;

/**
 *
 * @author Marvin y Amada
 */
public class MapControl {
 private static Object startingScene;
 
 static Map createMap() {
  // create the map
  Map map = new Map(5, 5);
  
  // create a list of different scenes in the game
  Scene[] scenes = createScenes();
  
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

 private static Scene[] createScenes() {
  Game game = JosephInEgypt.getCurrentGame();
  
  Scene[] scenes = new Scene[5];
  
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
  startingScene.setMapSymbol("ST");
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
  cattleScene.setMapSymbol("CT");
  cattleScene.setBlocked(false);
  cattleScene.setTravelTime(240);
  scenes[SceneType.cattle.ordinal()] = cattleScene;
  
  Scene grainScene = new Scene();
  grainScene.setDescription(
          "\nNow therefore let Pharaoh look out a man discreet and wise, and set him over the land of"
         +"Egypt. Let Pharaoh do this, and let him appoint officers over the land, and take up the" 
         +"fifth part of the land of Egypt in the seven plenteous years. And let them gather all"
         +"the food of those good years that come, and lay up corn under the hand of Pharaoh, and let"
         +"them keep food in the cities."
         +"\nJoseph has been given power over the land and now he must become the savior of Egypt."
         +"\nAs the major officer in Egypt, Joseph will administer all the preparations for the 7"
         +"harsh years of drought."
   );
  grainScene.setMapSymbol("GR");
  grainScene.setBlocked(false);
  grainScene.setTravelTime(350);
  scenes[SceneType.grain.ordinal()] = grainScene;
  
  Scene mountainScene = new Scene();
  mountainScene.setDescription(
          "\nNow therefore let Pharaoh look out a man discreet and wise, and set him over the land of"
         +"Egypt. Let Pharaoh do this, and let him appoint officers over the land, and take up the" 
         +"fifth part of the land of Egypt in the seven plenteous years. And let them gather all"
         +"the food of those good years that come, and lay up corn under the hand of Pharaoh, and let"
         +"them keep food in the cities."
         +"\nJoseph has been given power over the land and now he must become the savior of Egypt."
         +"\nAs the major officer in Egypt, Joseph will administer all the preparations for the 7"
         +"harsh years of drought."
   );
  mountainScene.setMapSymbol("MT");
  mountainScene.setBlocked(false);
  mountainScene.setTravelTime(140);
  scenes[SceneType.mountain.ordinal()] = mountainScene;
  
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
  finishScene.setMapSymbol("FS");
  finishScene.setBlocked(false);
  finishScene.setTravelTime(0);
  scenes[SceneType.finish.ordinal()] = finishScene;
  
  return scenes;
  
 }

 private static void assignScenesToLocations(Map map, Scene[] scenes) throws MapControlException {
  Location[][] locations = map.getLocations();
  
  locations[2][3].setScene(scenes[SceneType.cattle.ordinal()]);
  locations[3][4].setScene(scenes[SceneType.grain.ordinal()]);
  locations[1][2].setScene(scenes[SceneType.mountain.ordinal()]);
  
 }

 private static int moveActorToLocation(Actor actor, Point coordinates) throws MapControlException {
  Map map = JosephInEgypt.getCurrentGame().getMap();
  int newRow = coordinates.x-1;
  int newColumn = coordinates.y-1;
  
  if(newRow < 0 || newRow >= map.getNoOfRows() ||
          newColumn < 0 ||  newColumn >= map.getNoOfColumns()) {
   throw new MapControlException("Can not move actor to location "
                                 + coordinates.x + ", " + coordinates.y
                                 + " because that location is outside "
                                 + " the bounds of the map.");
  }
  return 0;
 }
 
 
}
