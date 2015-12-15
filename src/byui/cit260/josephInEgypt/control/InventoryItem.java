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

 void setDescription(String meat) {
  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
 }

 void setQuantityInStock(int i) {
  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
 }

 void setRequiredAmount(int i) {
  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
 }

 Object getDescription() {
  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        barrels;
    }
}
