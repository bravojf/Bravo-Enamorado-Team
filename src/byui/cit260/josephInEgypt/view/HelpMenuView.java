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
public class HelpMenuView extends View {

 public HelpMenuView() {
  super("\n"
         + "\n-------------------------------------------------------"
         + "\n|  Help Menu                                          |"
         + "\n-------------------------------------------------------"
         + "\nG - Game Objectives?"
         + "\nM - How to move"
         + "\nE - Estimating the amount of resources"
         + "\nH - Harvesting resources"
         + "\nD - Delivering resources"
         + "\nQ - Quit"
         + "\n-------------------------------------------------------");
  
 }

 @Override
 public boolean doAction(Object obj) {
  
  String value = (String) obj;
  value = value.toUpperCase();
  char choice = value.charAt(0);
  
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
    return true;
   default:
    System.out.println("\n*** Invalid selection *** Try again");
    break;
  }
  return false;
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
 
