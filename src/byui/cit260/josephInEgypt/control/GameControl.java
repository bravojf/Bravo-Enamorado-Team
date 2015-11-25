/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.control;

import byui.cit260.josephInEgypt.model.Game;
import byui.cit260.josephInEgypt.model.Map;
import byui.cit260.josephInEgypt.model.Player;
import byui.cit260.josephInEgypt.model.Transport;
import josephinegypt.JosephInEgypt;

/**
 *
 * @author Marvin y Amada
 */
public class GameControl {

 public static void createNewGame(Player player) {
  Game game = new Game(); // create new game
  JosephInEgypt.setCurrentGame(game); // save in JosephInEgypt
  
  game.setPlayer(player); // save player in game
  
  // create the inventory list and save in the game
  InventoryItem[] inventoryList = GameControl.createInventoryList();
  game.setInventory(inventoryList);
  
  Transport transport = new Transport();
  game.setTransport(transport);
  
  Map map = MapControl.createMap(); // create and initialize new map
  game.setMap(map); // save map in game
  
  // move actors to starting position in the map
  MapControl.moveActorsToStartingLocation(map);
 }

 private static InventoryItem[] createInventoryList() {
  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
 }
 
}
