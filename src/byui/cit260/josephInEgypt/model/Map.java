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

 public Map() {
 }
 
 

 public String getActualLocation() {
  return actualLocation;
 }

 public void setActualLocation(String actualLocation) {
  this.actualLocation = actualLocation;
 }

 @Override
 public int hashCode() {
  int hash = 3;
  hash = 41 * hash + Objects.hashCode(this.actualLocation);
  return hash;
 }

 @Override
 public String toString() {
  return "Map{" + "actualLocation=" + actualLocation + '}';
 }
 
 

 @Override
 public boolean equals(Object obj) {
  if (obj == null) {
   return false;
  }
  if (getClass() != obj.getClass()) {
   return false;
  }
  final Map other = (Map) obj;
  if (!Objects.equals(this.actualLocation, other.actualLocation)) {
   return false;
  }
  return true;
 }
 
 
 
}
