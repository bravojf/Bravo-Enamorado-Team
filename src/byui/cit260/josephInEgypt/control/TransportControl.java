/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.control;

/**
 *
 * @author Marvin
 */
public class TransportControl {
 
 /**
  *
  * @param fromLocation
  * @param speed
  * @return
  */
 public double calcTimeInTransit(String fromLocation, double speed){
  
 double distance;
 distance = 0;
 
  if (speed < 1 || speed > 40) {
   return -1;
  }
  if (fromLocation == null) {
   return -1;
  }
  else if (fromLocation == "Riverside") {
   distance = 364;
  }
  else if (fromLocation == "Mountain") {
   distance = 450;
  }
  else if (fromLocation == "Village") {
   distance = 225;
  }
  else if (fromLocation == "City") {
   distance = 200;
  }
  else if (fromLocation == "Mineral") {
   distance = 310;
  }
  else if (fromLocation == "Cattle") {
   distance = 210;
  }

  
  double time = distance/speed;
  return time;
  
 }
 
}
