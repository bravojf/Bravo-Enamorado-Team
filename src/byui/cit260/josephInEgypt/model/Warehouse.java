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
public class Warehouse implements Serializable{
 
 // class instance variables
 private double warehouseSize;
 private String inventoryDescription;

 public Warehouse() {
 }
 

 public double getWarehouseSize() {
  return warehouseSize;
 }

 public void setWarehouseSize(double warehouseSize) {
  this.warehouseSize = warehouseSize;
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
  hash = 89 * hash + (int) (Double.doubleToLongBits(this.warehouseSize) ^ (Double.doubleToLongBits(this.warehouseSize) >>> 32));
  hash = 89 * hash + Objects.hashCode(this.inventoryDescription);
  return hash;
 }

 @Override
 public String toString() {
  return "Warehouse{" + "warehouseSize=" + warehouseSize + ", inventoryDescription=" + inventoryDescription + '}';
 }


 @Override
 public boolean equals(Object obj) {
  if (obj == null) {
   return false;
  }
  if (getClass() != obj.getClass()) {
   return false;
  }
  final Warehouse other = (Warehouse) obj;
  if (Double.doubleToLongBits(this.warehouseSize) != Double.doubleToLongBits(other.warehouseSize)) {
   return false;
  }
  if (!Objects.equals(this.inventoryDescription, other.inventoryDescription)) {
   return false;
  }
  return true;
 }
 
 
 
}