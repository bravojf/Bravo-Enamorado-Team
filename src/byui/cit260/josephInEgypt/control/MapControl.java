/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.control;

import byui.cit260.josephInEgypt.model.Map;

/**
 *
 * @author Marvin y Amada
 */
public class MapControl {
 
 public static Map createMap() {
  // create the map
  Map map = new Map(20, 20);
  
  // create a list of different scenes in the game
  Scene[] scenes = crateScenes();
  
  // assign the different scenes to location in the map
  assignScenesToLocations(map, scenes);
  
  return map;
 }

 static void moveActorsToStartingLocation(Map map) {
  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
 }

 private static Scene[] crateScenes() {
  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
 }

 private static void assignScenesToLocations(Map map, Scene[] scenes) {
  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
 }
 
 private static class Scene {

  public Scene() {
  }
 }
 
}
