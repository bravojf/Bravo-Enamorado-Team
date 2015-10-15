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
public class Container implements Serializable{
 
 // class instance variables
 private double containerSize;
 private String inventoryDescription;

 public Container() {
 }

 public double getContainerSize() {
  return containerSize;
 }

 public void setContainerSize(double containerSize) {
  this.containerSize = containerSize;
 }

 public String getInventoryDescription() {
  return inventoryDescription;
 }

 public void setInventoryDescription(String inventoryDescription) {
  this.inventoryDescription = inventoryDescription;
 }

 @Override
 public int hashCode() {
  int hash = 7;
  hash = 23 * hash + (int) (Double.doubleToLongBits(this.containerSize) ^ (Double.doubleToLongBits(this.containerSize) >>> 32));
  hash = 23 * hash + Objects.hashCode(this.inventoryDescription);
  return hash;
 }

 @Override
 public String toString() {
  return "Container{" + "containerSize=" + containerSize + ", inventoryDescription=" + inventoryDescription + '}';
 }

 @Override
 public boolean equals(Object obj) {
  if (obj == null) {
   return false;
  }
  if (getClass() != obj.getClass()) {
   return false;
  }
  final Container other = (Container) obj;
  if (Double.doubleToLongBits(this.containerSize) != Double.doubleToLongBits(other.containerSize)) {
   return false;
  }
  if (!Objects.equals(this.inventoryDescription, other.inventoryDescription)) {
   return false;
  }
  return true;
 }
 
 
 
 
}
