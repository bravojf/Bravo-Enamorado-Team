/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.view;

import byui.cit260.josephInEgypt.control.GameControl;
import java.util.Scanner;
import josephinegypt.JosephInEgypt;

/**
 *
 * @author Marvin y Amada
 */
public class HelpMenuView {
 
 private final String HELP_MENU = "\n"
         + "\n-------------------------------------------------------"
         + "\n|  Help Menu                                          |"
         + "\n-------------------------------------------------------"
         + "\nG - Game Objectives?"
         + "\nM - How to move"
         + "\nE - Estimating the amount of resources"
         + "\nH - Harvesting resources"
         + "\nD - Delivering resources"
         + "\nQ - Quit"
         + "\n-------------------------------------------------------";

 void displayHelpMenu() {
  char selection = ' ';
  do {
   
   System.out.println(HELP_MENU); // display the main menu
   
   String input = this.getInput(); // get the user's selection
   selection = input.charAt(0); // get first character of string
   
   this.doAction(selection); // do action based on selection
   
  } while (selection != 'Q'); // an selection is not "Quit"
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
   case 'G': // Display the game objectives
    this.gameObjectives();
    break;
   case 'M': // Display how to move
    this.howToMove();
    break;
   case 'E': // display the estimate resources needed
    this.estimateResources();
    break;
   case 'H': // Display the harvesting resources help
    this.harvestingResources();
    break;
   case 'D': // Display the delivering resources help
    this.deliveringResources();
    break;
   case 'Q': // Quit the help menu
    return;
   default:
    System.out.println("\n*** Invalid selection *** Try again");
    break;
  }
  
 }

 private void gameObjectives() {
  System.out.println("*** gameObjectives function called ***");
 }

 private void howToMove() {
  System.out.println("*** howToMove function called ***");
 }

 private void estimateResources() {
  System.out.println("*** estimateResources function called ***");
 }

 private void harvestingResources() {
  System.out.println("*** harvestingResources function called ***");
 }

 private void deliveringResources() {
  System.out.println("*** deliveringResources function called ***");
 }
}
 
