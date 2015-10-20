/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.control;

/**
 *
 * @author Marvin - Jocsan
 */
public class InventoryControl {
 
 public double calcVolumeOfContainer(double height, double width, double length){
  
  if (height<0 || height>1.83) {
          return -1;
  }
  if (width<0 || width>2.35) {
          return -1;
  }
  if (length<0 || length>5.89) {
          return -1; 
  }
  
  double area = length * width;
  double volume = area * height;
  
  return volume;
  
 }
 
}
