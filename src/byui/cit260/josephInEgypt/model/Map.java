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
public class Map implements Serializable{
 
 //class instance variables
 private String actualLocation;

 private int noOfRows;
 private int noOfColumns;  
 private Location[][] locations;

 public Map() {
 }

 public Map(int noOfRows, int noOfColumns) {
    if(noOfRows < 1 || noOfColumns < 1){
     System.out.println("The number of rows and columns must be > zero");
     return;
 }
    this.noOfRows = noOfRows;
    this.noOfColumns = noOfColumns;
    
    
    this.locations = new Location[noOfRows][noOfColumns];
    
    for(int row=0; row< noOfRows; row++){
        for(int column =0; column < noOfColumns; column++){
            Location location = new location();
            location.setColumn(column);
            location.setRow(row);
            location.setVisited(false);
            
            locations[row][column] = location;
                 
        }
    }
}

 public Location[][] getLocations() {
  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
 }

 private static class location extends Location {

  public location() {
  }
 }

}
