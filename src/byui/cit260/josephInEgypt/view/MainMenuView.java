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
 * @author Marvin
 */
public class MainMenuView {
 
 private final String MENU = "\n"
         + "\n-------------------------------------------------------"
         + "\n|  Main Menu                                          |"
         + "\n-------------------------------------------------------"
         + "\nG - Start game"
         + "\nH - Get help on how to play the game"
         + "\nS - Save game"
         + "\nE - Exit"
         + "\n-------------------------------------------------------";

 void displayMenu() {
  
  char selection = ' ';
  do {
   
   System.out.println(MENU); // display the main menu
   
   String input = this.getInput(); // get the user's selection
   selection = input.charAt(0); // get first character of string
   
   this.doAction(selection); // do action based on selection
   
  } while (selection != 'E'); // an selection is not "Exit"
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
   case 'N': // create and start new game
    this.startNewGame();
    break;
   case 'G': // get and start an existing game
    this.startExistingGame();
    break;
   case 'H': // display the help menu
    this.displayHelpMenu();
    break;
   case 'E': // exit the program
    return;
   default:
    System.out.println("\n*** Invalid selection *** Try again");
    break;
  }
  
 }

 private void startNewGame() {
  GameControl.createNewGame(JosephInEgypt.getPlayer());
  
  GameMenuView gameMenu = new GameMenuView();
  gameMenu.displayMenu();
 }

 private void startExistingGame() {
  System.out.println("*** startExistingGame function called ***");
 }

 private void displayHelpMenu() {
  System.out.println("*** displayHelpMenu function is called ***");
 }
 
}
