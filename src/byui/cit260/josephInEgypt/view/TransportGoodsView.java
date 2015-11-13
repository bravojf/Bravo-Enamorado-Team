/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.view;

/**
 *
 * @author Marvin y Amada
 */
public class TransportGoodsView extends View{
 
 

 public TransportGoodsView() {
  
  super( "\n"
         + "\n-------------------------------------------------------"
         + "\n|  Choose The Location                                |"
         + "\n-------------------------------------------------------"
         + "\nW - Warehouse"
         + "\nR - Riverside"
         + "\nC - Cattle"
         + "\nV - Village"
         + "\nT - City"
         + "\nM - Mountain"
         + "\nL - Mineral"
         + "\nQ - Quit"
         + "\n-------------------------------------------------------");
 }

 @Override
 public boolean doAction(Object obj) {
  String value = (String) obj;
  value = value.toUpperCase();
  char choice = value.charAt(0);
     
  switch (choice) {
  case 'W': // Display the move to a new location
   this.calcInTransit();
   break;
  case 'R': // Explore a location
   this.calcInTransit();
   break;
  case 'C': // Calculate harvest
   this.calcInTransit();
   break;
  case 'V': // Build the warehouse
   this.calcInTransit();
   break;
  case 'T': // Build tools
   this.calcInTransit();
   break;
  case 'M': // Build containers
   this.calcInTransit();
   break;
  case 'L': // Transport goods
   this.calcInTransit();
   break;
  case 'Q': // Quit the game menu
  return true;
  default:
  System.out.println("\n*** Invalid selection *** Try again");
  break;
  }
  return false;
 }

 private void calcInTransit() {
  
 }
 
}
