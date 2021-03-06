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
public class Inventory implements Serializable {
 
 //class instance variables
 private String inventoryType;
 private double quantityInStock;
 private double requiredAmount;

 public Inventory() {
 }
 
 

 public String getInventoryType() {
  return inventoryType;
 }

 public void setInventoryType(String inventoryType) {
  this.inventoryType = inventoryType;
 }

 public double getQuantityInStock() {
  return quantityInStock;
 }

 public void setQuantityInStock(double quantityInStock) {
  this.quantityInStock = quantityInStock;
 }

 public double getRequiredAmount() {
  return requiredAmount;
 }

 public void setRequiredAmount(double requiredAmount) {
  this.requiredAmount = requiredAmount;
 }

 @Override
 public int hashCode() {
  int hash = 7;
  hash = 41 * hash + Objects.hashCode(this.inventoryType);
  hash = 41 * hash + (int) (Double.doubleToLongBits(this.quantityInStock) ^ (Double.doubleToLongBits(this.quantityInStock) >>> 32));
  hash = 41 * hash + (int) (Double.doubleToLongBits(this.requiredAmount) ^ (Double.doubleToLongBits(this.requiredAmount) >>> 32));
  return hash;
 }

 @Override
 public String toString() {
  return "Inventory{" + "inventoryType=" + inventoryType + ", quantityInStock=" + quantityInStock + ", requiredAmount=" + requiredAmount + '}';
 }
 
 

 @Override
 public boolean equals(Object obj) {
  if (obj == null) {
   return false;
  }
  if (getClass() != obj.getClass()) {
   return false;
  }
  final Inventory other = (Inventory) obj;
  if (!Objects.equals(this.inventoryType, other.inventoryType)) {
   return false;
  }
  if (Double.doubleToLongBits(this.quantityInStock) != Double.doubleToLongBits(other.quantityInStock)) {
   return false;
  }
  if (Double.doubleToLongBits(this.requiredAmount) != Double.doubleToLongBits(other.requiredAmount)) {
   return false;
  }
  return true;
 }
 
 
 
 
}
