/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.control;

/**
 *
 * @author Marvin y Amada
 */
public class InventoryItem {

 String description;
 int quantityInStock;
 int requiredAmount;

 public String getDescription() {
  return description;
 }

 public void setDescription(String description) {
  this.description = description;
 }

 public int getQuantityInStock() {
  return quantityInStock;
 }

 public void setQuantityInStock(int quantityInStock) {
  this.quantityInStock = quantityInStock;
 }

 public int getRequiredAmount() {
  return requiredAmount;
 }

 public void setRequiredAmount(int requiredAmount) {
  this.requiredAmount = requiredAmount;
 }
 

  public enum Item{
        meat,
        ore,
        rock,
        wood,
        grain,
        legume,
        water,
        oil,
        honey,
        salt,
        hammer,   
        chisel,  
        saw,
        carts, 
        barrels,
        last;
    }
}
