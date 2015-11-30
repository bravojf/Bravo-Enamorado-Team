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
 private String description;
 private double width;
 private double length;
 private double height;
 private double volume;

 public Warehouse() {
 
  this.description = "\nThis is the Warehouse of Joseph in Egypt. If you"
                    + "\nhave faith and work had, it will feed all the people";
  this.width = 0;
  this.length = 0;
  this.height = 0;
  this.volume = 0;
  
 }

}
