/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.view;

import ControlException.MapControlException;
import byui.cit260.josephInEgypt.control.GameControl;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import josephinegypt.JosephInEgypt;

/**
 *
 * @author Marvin
 */
public class MainMenuView extends View {
 
           

 public MainMenuView() {
  super("\n"
         + "\n-------------------------------------------------------"
         + "\n|  Main Menu                                          |"
         + "\n-------------------------------------------------------"
         + "\nN - Start new game"
         + "\nG - Continue saved game"
         + "\nH - Get help on how to play the game"
         + "\nS - Save game"
         + "\nE - Exit"
         + "\n-------------------------------------------------------");
 }


 @Override
 public boolean doAction(Object obj) {
  
  String value = (String) obj;
  value = value.toUpperCase();
  char choice = value.charAt(0);
  
  switch (choice) {
   case 'N': {
   try {
    // create and start new game
    this.startNewGame();
   } catch (MapControlException ex) {
    Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
   }
  }
    break;
   case 'G': // get and start an existing game
    this.startExistingGame();
    break;
   case 'H': // display the help menu
    this.displayHelpMenu();
    break;
   case 'S': // save game
    this.saveGame();
    break;
   case 'E': // exit the program
    return true;
   default:
    System.out.println("\n*** Invalid selection *** Try again");
    break;
  }
  return false;
 }

 private void startNewGame() throws MapControlException {
  GameControl.createNewGame(JosephInEgypt.getPlayer());
  
  GameMenuView gameMenu = new GameMenuView();
  gameMenu.display();
 }

 private void startExistingGame() {
  System.out.println("*** startExistingGame function called ***");
 }

 private void displayHelpMenu() {
  HelpMenuView helpMenu = new HelpMenuView();
  helpMenu.display();
 }

 private void saveGame() {
  System.out.println("*** saveGame function called ***");
 }
 
}
