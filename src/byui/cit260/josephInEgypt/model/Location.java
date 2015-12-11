/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
//import javafx.scene.Scene;
import byui.cit260.josephInEgypt.control.Scene;
/**
 *
 * @author jocsan
 */
public class Location implements Serializable{
    
    private int row;
    private int column;
    private boolean visited;
    private Scene scene;

 
    private ArrayList<Actor> actors;

    public Location() {
    }
    
    

    public boolean getVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
    
   public Scene getScene() {
   return scene;
  }

  public void setScene(Scene scene) {
   this.scene = scene;
  }

 @Override
 public int hashCode() {
  int hash = 7;
  hash = 59 * hash + this.row;
  hash = 59 * hash + this.column;
  hash = 59 * hash + (this.visited ? 1 : 0);
  hash = 59 * hash + Objects.hashCode(this.scene);
  hash = 59 * hash + Objects.hashCode(this.actors);
  return hash;
 }

 @Override
 public boolean equals(Object obj) {
  if (obj == null) {
   return false;
  }
  if (getClass() != obj.getClass()) {
   return false;
  }
  final Location other = (Location) obj;
  if (this.row != other.row) {
   return false;
  }
  if (this.column != other.column) {
   return false;
  }
  if (this.visited != other.visited) {
   return false;
  }
  if (!Objects.equals(this.scene, other.scene)) {
   return false;
  }
  if (!Objects.equals(this.actors, other.actors)) {
   return false;
  }
  return true;
 }

 @Override
 public String toString() {
  return "Location{" + "row=" + row + ", column=" + column + ", visited=" + visited + ", scene=" + scene + ", actors=" + actors + '}';
 }

  
  
 void setColumn(int column) {
  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
 }


 void setRow(int row) {
  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
 }
    
    
    
}
