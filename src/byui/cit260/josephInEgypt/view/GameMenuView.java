/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.view;

import byui.cit260.josephInEgypt.control.GameControl;
import byui.cit260.josephInEgypt.control.TransportControl;
import byui.cit260.josephInEgypt.control.InventoryItem;
import byui.cit260.josephInEgypt.model.Location;
import java.util.Scanner;
import josephinegypt.JosephInEgypt;

/**
 *
 * @author Marvin - Jocsan
 */
public class GameMenuView extends View {
 
 public GameMenuView () {
         super( "\n"
         + "\n-------------------------------------------------------"
         + "\n|  Game Menu                                          |"
         + "\n-------------------------------------------------------"
         + "\nM - Move to a new location"
         + "\nX - Explore a location"
         + "\nH - Calculate the harvest"
         + "\nW - Build warehouse"
         + "\nT - Build tools"
         + "\nC - Build containers"
         + "\nG - Transport goods"
         + "\nD - Deliver goods"
         + "\nM - View game map"
         + "\nI - View inventory"
         + "\nQ - Quit"
         + "\n-------------------------------------------------------");
 }
 
@Override
 public boolean doAction(Object obj) {
  
  String value = (String) obj;
  value = value.toUpperCase();
  char choice = value.charAt(0);
  
  switch (choice) {
   case 'N': // Display the move to a new location
    this.moveToNewLocation();
    break;
   case 'X': // Explore a location
    this.exploreLocation();
    break;
   case 'H': // Calculate harvest
    this.calculateHarvest();
    break;
   case 'W': // Build the warehouse
    this.buildWarehouse();
    break;
   case 'T': // Build tools
    this.buildTools();
    break;
   case 'C': // Build containers
    this.buildContainers();
    break;
   case 'G': // Transport goods
    this.transportGoods();
    break;
   case 'D': // Deliver goods
    this.deliverGoods();
    break;
   case 'M': // View game map
    this.viewGameMap();
    break;
   case 'I': // Show currect inventory
    this.viewInventory();
    break;
   case 'Q': // Quit the game menu
    return true;
   default:
    System.out.println("\n*** Invalid selection *** Try again");
    break;
  
 }
 return false;
}

 private void moveToNewLocation() {
  System.out.println("*** moveToNewLocation function is called ***");
 }

 private void exploreLocation() {
  LocationMenuView locationMenu = new LocationMenuView();
  locationMenu.display();
  
 }

 private void calculateHarvest() {
  System.out.println("*** calculateHarvest function is called ***");
 }

 private void buildWarehouse() {
  System.out.println("*** buildWarehouse function is called ***");
 }

 private void buildTools() {
  System.out.println("*** builTools function is called ***");
 }

 private void buildContainers() {
  System.out.println("*** buildContainers function is called ***");
 }

 private void transportGoods() {
  TransportControl.transportNewGoods(JosephInEgypt.getCurrentGame());
  
  TransportGoodsView transportTime = new TransportGoodsView();
  transportTime.display();
 }

 private void deliverGoods() {
  System.out.println("*** deliverGoods function is called ***");
 }

 public void viewGameMap() {
  Location[][] locations = josephinegypt.JosephInEgypt.getCurrentGame().getMap().getLocations();
  
  System.out.println("\nList of Locations in the Map");
  System.out.println("------------------------------");
  System.out.println("|  0 |  1 |  2 |  3 |  4 |");
  
  for (int row = 0; row < locations.length; row++){
   System.out.println("------------------------------");
   for (int col = 0; col < locations[row].length; col++){
    if (locations[row][col].getScene()!= null)
     System.out.print("| " + locations[row][col].getScene().getMapSymbol() + " ");
    else
    System.out.print("|    ");
   }
   System.out.println("|");
  }
  
 }

 private void viewInventory() {
  
  byui.cit260.josephInEgypt.control.InventoryItem[] inventory = GameControl.getSortedInventoryList();
  
  System.out.println("\nList of Inventory Items");
  System.out.println("Description" + "\t" +
                     "Required" + "\t" +
                     "In Stock");
  
  for (byui.cit260.josephInEgypt.control.InventoryItem inventoryItem : inventory) {
   System.out.println(inventoryItem.getDescription()+ "\t   " +
                      inventoryItem.getRequiredAmount() + "\t    " +
                      inventoryItem.getQuantityInStock());
  }
  
 }

 private static class InventoryItem {

  public InventoryItem() {
  }
 }

// public static class GameMap {
//  String description;
//
//  public GameMap() {
//  }
//
////  public String getDescription() {
////   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
////  }
////
////  private String getRequiredLocations() {
////   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
////  }
////
////  private String getLocations() {
////   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
////  }
// }

}
