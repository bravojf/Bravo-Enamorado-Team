/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.view;

import byui.cit260.josephInEgypt.control.GameControl;
import byui.cit260.josephInEgypt.control.TransportControl;
import java.util.Scanner;
import josephinegypt.JosephInEgypt;

/**
 *
 * @author Marvin y Amada
 */
public class GameMenuView {
 
 private final String GAME_MENU = "\n"
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
         + "\nI - Show current inventory"
         + "\nQ - Quit"
         + "\n-------------------------------------------------------";

 void displayMenu() {
  char selection = ' ';
  do{
   
   System.out.println(GAME_MENU);
   
   String input = this.getInput();
   selection = input.charAt(0);
   this.doAction(selection);
   
  } while (selection != 'Q'); 
 }
 
 private String getInput() {
  boolean valid = false; // indicates if the option has been retrieved
   String input = null;
   Scanner keyboard = new Scanner(System.in); // keyboard input stream
        
   while(!valid){ // while a valid name has not been retrieved
         
    // prompt for the player's name
    System.out.println("Enter the option below:");
            
    // get the name from the keyboard and trim off the blanks
    input = keyboard.nextLine();
    input = input.trim();
            
    // if the name is invalid (less than two characters in length)
    if(input.length() < 1 ){
     System.out.println("Invalid name - the name must not be blank");
     continue; // and repeat again
    }
    break; // out of the (exit) the repetition
   }
   return input; // return option
 }

 private void doAction(char choice) {
  
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
    this.showCurrentInventory();
    break;
   case 'Q': // Quit the game menu
    return;
   default:
    System.out.println("\n*** Invalid selection *** Try again");
    break;
  
 }
 
}

 private void moveToNewLocation() {
  System.out.println("*** moveToNewLocation function is called ***");
 }

 private void exploreLocation() {
  LocationMenuView locationMenu = new LocationMenuView();
  locationMenu.displayLocationMenu();
  
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
  transportTime.displayTransport();
 }

 private void deliverGoods() {
  System.out.println("*** deliverGoods function is called ***");
 }

 private void viewGameMap() {
  System.out.println("*** viewGameMap function is called ***");
 }

 private void showCurrentInventory() {
  System.out.println("*** showCurrentInventory function is called ***");
 }

}
