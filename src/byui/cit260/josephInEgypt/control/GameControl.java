/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.control;

import ControlException.MapControlException;
import byui.cit260.josephInEgypt.control.InventoryItem.Item;
import byui.cit260.josephInEgypt.control.InventoryItem;
import byui.cit260.josephInEgypt.control.Scene;
import byui.cit260.josephInEgypt.control.SceneType;
import byui.cit260.josephInEgypt.model.Container;
import byui.cit260.josephInEgypt.model.Game;
import byui.cit260.josephInEgypt.model.Location;
import byui.cit260.josephInEgypt.model.Map;
import byui.cit260.josephInEgypt.model.Player;
import byui.cit260.josephInEgypt.model.Warehouse;
import byui.cit260.josephInEgypt.view.GameMenuView;
//import byui.cit260.josephInEgypt.view.GameMenuView.GameMap;
import josephinegypt.JosephInEgypt;

/**
 *
 * @author Marvin y Amada
 */
public class GameControl {
 private static Object JosepthInEgypt;

 public static void createNewGame(Player player) throws MapControlException {
  Game game = new Game(); // create new game
  JosephInEgypt.setCurrentGame(game); // save in JosephInEgypt
  
  game.setPlayer(player); // save player in game
  
  // create the inventory list and save in the game
  InventoryItem[] inventoryList = GameControl.createInventoryList();
  game.setInventory(inventoryList);
  
  Warehouse warehouse = new Warehouse();
  game.setWarehouse(warehouse);
  
  Container container = new Container();
  game.setContainer(container);
  
  Map map = MapControl.createMap(); // create and initialize new map
  game.setMap(map); // save map in game
  
  // move actors to starting position in the map
  try {
  MapControl.moveActorsToStartingLocation(map);
  }
  catch(MapControlException ex){
   System.out.println("Error - " + ex);
   }
 }

public static InventoryItem[] createInventoryList(){
        InventoryItem[] inventory =
            new InventoryItem[Item.last.ordinal()];

        InventoryItem meat = new InventoryItem();
        meat.setDescription("Meat");
        meat.setQuantityInStock(0);
        meat.setRequiredAmount(0);
        inventory[Item.meat.ordinal()] = meat;

        InventoryItem ore = new InventoryItem();
        ore.setDescription("Ore");
        ore.setQuantityInStock(0);
        ore.setRequiredAmount(0);
        inventory[Item.ore.ordinal()] = ore;

        InventoryItem rock = new InventoryItem();
        rock.setDescription("Rock");
        rock.setQuantityInStock(0);
        rock.setRequiredAmount(0);
        inventory[Item.rock.ordinal()] = rock;

        InventoryItem wood = new InventoryItem();
        wood.setDescription("Wood");
        wood.setQuantityInStock(0);
        wood.setRequiredAmount(0);
        inventory[Item.wood.ordinal()] = wood;

        InventoryItem grain = new InventoryItem();
        grain.setDescription("Grain");
        grain.setQuantityInStock(0);
        grain.setRequiredAmount(0);
        inventory[Item.grain.ordinal()] = grain;

        InventoryItem legume = new InventoryItem();
        legume.setDescription("Legume");
        legume.setQuantityInStock(0);
        legume.setRequiredAmount(0);
        inventory[Item.legume.ordinal()] = legume;

        InventoryItem water = new InventoryItem();
        water.setDescription("Water");
        water.setQuantityInStock(0);
        water.setRequiredAmount(0);
        inventory[Item.water.ordinal()] = water;

        InventoryItem oil = new InventoryItem();
        oil.setDescription("Oil");
        oil.setQuantityInStock(0);
        oil.setRequiredAmount(0);
        inventory[Item.oil.ordinal()] = oil;

        InventoryItem honey = new InventoryItem();
        honey.setDescription("Honey");
        honey.setQuantityInStock(0);
        honey.setRequiredAmount(0);
        inventory[Item.honey.ordinal()] = honey;

        InventoryItem salt = new InventoryItem();
        salt.setDescription("Salt");
        salt.setQuantityInStock(0);
        salt.setRequiredAmount(0);
        inventory[Item.salt.ordinal()] = salt;
        
        InventoryItem hammer = new InventoryItem();
        hammer.setDescription("Hammer");
        hammer.setQuantityInStock(0);
        hammer.setRequiredAmount(0);
        inventory[Item.hammer.ordinal()] = hammer;
        
        InventoryItem chisel = new InventoryItem();
        chisel.setDescription("Chisel");
        chisel.setQuantityInStock(0);
        chisel.setRequiredAmount(0);
        inventory[Item.chisel.ordinal()] = chisel;
        
        InventoryItem saw = new InventoryItem();
        saw.setDescription("Saw");
        saw.setQuantityInStock(0);
        saw.setRequiredAmount(0);
        inventory[Item.saw.ordinal()] = saw;
        
        InventoryItem carts = new InventoryItem();
        carts.setDescription("Carts");
        carts.setQuantityInStock(0);
        carts.setRequiredAmount(0);
        inventory[Item.carts.ordinal()] = carts;
        
        InventoryItem barrels= new InventoryItem();
        barrels.setDescription("Barrels");
        barrels.setQuantityInStock(0);
        barrels.setRequiredAmount(0);
        inventory[Item.barrels.ordinal()] = barrels;
        

    return inventory;
}

 public static void assignScenesToLocations(Map map, Scene[] scenes) {
  Location[][] locations = map.getLocations();
  locations[2][3].setScene(scenes[SceneType.cattle.ordinal()]);
  locations[3][4].setScene(scenes[SceneType.grain.ordinal()]);
  locations[1][2].setScene(scenes[SceneType.mountain.ordinal()]);
  JosephInEgypt.getCurrentGame().setScenes(scenes);
  JosephInEgypt.getCurrentGame().setMap(map);
  JosephInEgypt.getCurrentGame().setLocations(locations);
 }
 

 public static byui.cit260.josephInEgypt.control.InventoryItem[] getSortedInventoryList() {
  byui.cit260.josephInEgypt.control.InventoryItem[] originalInventoryList =
          JosephInEgypt.getCurrentGame().getInventory();
  
  byui.cit260.josephInEgypt.control.InventoryItem[] inventoryList = originalInventoryList.clone();
  
  byui.cit260.josephInEgypt.control.InventoryItem tempInventoryItem;
  for (int i = 0; i < inventoryList.length -1; i++) {
   for (int j = 0; j < inventoryList.length-1-i; j++) {
    if (inventoryList[j].getDescription().compareToIgnoreCase(inventoryList[j + 1].getDescription()) > 0) {
       tempInventoryItem = inventoryList[j];
       inventoryList[j] = inventoryList[j+1];
       inventoryList[j+1] = tempInventoryItem;
    }
   }
  }
  return inventoryList;
 }

// public static GameMenuView.GameMap[] getSortedGameMap() {
//  Map originalGameMap =
//          JosephInEgypt.getCurrentGame().getMap();
//  GameMap[] gameMap = (GameMap[]) originalGameMap.;
//  GameMap tempGameMap;
//  for (int i = 0; i < gameMap.length-1; i++) {
//   for (int j = 0; j < gameMap.length-1-i; j++) {
//    if (gameMap[j].getDescription().compareToIgnoreCase(gameMap[j + 1].getDescription()) > 0){
//     tempGameMap = gameMap[j];
//    gameMap[j] = gameMap[j+1];
//    gameMap[j+1] = tempGameMap;
//   }
//   }
//  }
//   return gameMap;
// }



 
 private static class Constants {
  private static int NUMBER_OF_INVENTORY_ITEMS;

  public Constants() {
  }
 }


}