/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Marvin
 */
public class Transport implements Serializable{
 
 // class instance variables
 private double timeInTransit;
 private String inventoryDescription;
 
 private String description;
 private double width;
 private double length;
 private double height;
 private double sqFt0Sale;
 private double maxWeighCapacity;
 

 public Transport() {
     this.description = "\nThis is the this of Joseph In Egypt. If you"
             +"\nhave faith, you shall prospere on the land";
     this.width = 0;
     this.length = 0;
     this.height = 0;
     this.maxWeighCapacity = 0;
     this.sqFt0Sale = 0;
 }
 

 public double getTimeInTransit() {
  return timeInTransit;
 }

 public void setTimeInTransit(double timeInTransit) {
  this.timeInTransit = timeInTransit;
 }

 public String getInventoryDescription() {
  return inventoryDescription;
 }

 public void setInventoryDescription(String inventoryDescription) {
  this.inventoryDescription = inventoryDescription;
 }

 @Override
 public int hashCode() {
  int hash = 3;
  hash = 17 * hash + (int) (Double.doubleToLongBits(this.timeInTransit) ^ (Double.doubleToLongBits(this.timeInTransit) >>> 32));
  hash = 17 * hash + Objects.hashCode(this.inventoryDescription);
  return hash;
 }

 @Override
 public String toString() {
  return "Transport{" + "timeInTransit=" + timeInTransit + ", inventoryDescription=" + inventoryDescription + '}';
 }

 @Override
 public boolean equals(Object obj) {
  if (obj == null) {
   return false;
  }
  if (getClass() != obj.getClass()) {
   return false;
  }
  final Transport other = (Transport) obj;
  if (Double.doubleToLongBits(this.timeInTransit) != Double.doubleToLongBits(other.timeInTransit)) {
   return false;
  }
  if (!Objects.equals(this.inventoryDescription, other.inventoryDescription)) {
   return false;
  }
  return true;
 }
 
 
 
}
