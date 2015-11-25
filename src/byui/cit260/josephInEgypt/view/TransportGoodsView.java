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
 
     
  int distance;
  distance = 0;
 
  
  if (choice == ' ') {
   System.out.println("** Please enter a valid choice **");
  }
  else if (choice == 'R') {
   distance = 364;
  }
  else if (choice == 'M') {
   distance = 450;
  }
  else if (choice == 'V') {
   distance = 225;
  }
  else if (choice == 'T') {
   distance = 200;
  }
  else if (choice == 'L') {
   distance = 310;
  }
  else if (choice == 'C') {
   distance = 210;
  }
  int speed = 0;
  
  
  
  double time = distance/speed;
  System.out.println("It will take " + time + " hours to get to the Warehouse");
  return false;
 
}
}