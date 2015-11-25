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
public enum Actor implements Serializable{
 
 Joseph("He is the Prophet and second in charge after Pharao"),
 Chief Officer("They coordinate the work done in each territory"),
 Worker("They work under the supervision of the chief officers"),
 Blacksmith("They are in charge of building the necessary tools for the workers");
 
 //class instance variables
 private final String description;
 private final Point coordinates;

 public Actor() {
 }
 
 Actor(String description) {
 this.description = description;
 coordinates = new Point(1,1);
}

 public String getDescription(){
 return description;
}

 public Point getCoordinates(){
 return coordinates;
}

}
