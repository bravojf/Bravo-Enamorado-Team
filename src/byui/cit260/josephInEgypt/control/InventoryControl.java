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
  
  if (height < 0 || height > 1.83) {
          return -1;
  }
  if (width < 0 || width > 2.35) {
          return -1;
  }
  if (length < 0 || length > 5.89) {
          return -1;
  }
  
  double area = length * width;
  double volume = area * height;
  
  return volume;
  
 }
 
 public double calcMaxWeight ( double volume, double weight){
     if (volume < 0 || volume > 26){
         return -1;
     }
     if (weight < 0 ||weight > 100 ){
         return -1;
     }
     double maxWeight = volume*weight;
     
     return maxWeight;
 }
 
 public double calcContainersNeeded ( double volume, double resource){
     if (volume < 0 || volume > 26){
         return -1;
     }
     if (resource <0 || resource > 1000000){
         return-1;
    }
     double containersNeeded = volume * resource;
     return containersNeeded;

 
}