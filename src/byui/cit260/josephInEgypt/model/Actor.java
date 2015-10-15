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
public class Actor implements Serializable{
 
 //class instance variables
 private String actorLocation;
 private String actorTasks;
 private double timeSpent;

 public Actor() {
 }
 
 

 public String getActorLocation() {
  return actorLocation;
 }

 public void setActorLocation(String actorLocation) {
  this.actorLocation = actorLocation;
 }

 public String getActorTasks() {
  return actorTasks;
 }

 public void setActorTasks(String actorTasks) {
  this.actorTasks = actorTasks;
 }

 public double getTimeSpent() {
  return timeSpent;
 }

 public void setTimeSpent(double timeSpent) {
  this.timeSpent = timeSpent;
 }

 @Override
 public int hashCode() {
  int hash = 7;
  hash = 53 * hash + Objects.hashCode(this.actorLocation);
  hash = 53 * hash + Objects.hashCode(this.actorTasks);
  hash = 53 * hash + (int) (Double.doubleToLongBits(this.timeSpent) ^ (Double.doubleToLongBits(this.timeSpent) >>> 32));
  return hash;
 }

 @Override
 public String toString() {
  return "Actor{" + "actorLocation=" + actorLocation + ", actorTasks=" + actorTasks + ", timeSpent=" + timeSpent + '}';
 }
 
 

 @Override
 public boolean equals(Object obj) {
  if (obj == null) {
   return false;
  }
  if (getClass() != obj.getClass()) {
   return false;
  }
  final Actor other = (Actor) obj;
  if (!Objects.equals(this.actorLocation, other.actorLocation)) {
   return false;
  }
  if (!Objects.equals(this.actorTasks, other.actorTasks)) {
   return false;
  }
  if (Double.doubleToLongBits(this.timeSpent) != Double.doubleToLongBits(other.timeSpent)) {
   return false;
  }
  return true;
 }

 public void setActorTask(String count_Inventory) {
  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
 }
 
 
 
}
