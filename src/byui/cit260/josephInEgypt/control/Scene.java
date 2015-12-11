/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.control;

import java.io.Serializable;

/**
 *
 * @author Marvin y Amada
 */


public class Scene implements Serializable {
 
 static int sceneTypeCount=3;
  private String description;
   private String mapSymbol;
   private boolean blocked;
   private int travelTime;


  
 public Scene() {
  }

 public static int getSceneTypeCount() {
  return sceneTypeCount;
 }

 public String getDescription() {
  return description;
 }

 public String getMapSymbol() {
  return mapSymbol;
 }

 public boolean isBlocked() {
  return blocked;
 }

 public int getTravelTime() {
  return travelTime;
 }

 public static void setSceneTypeCount(int sceneTypeCount) {
  Scene.sceneTypeCount = sceneTypeCount;
 }

 public void setDescription(String description) {
  this.description = description;
 }

 public void setMapSymbol(String mapSymbol) {
  this.mapSymbol = mapSymbol;
 }

 public void setBlocked(boolean blocked) {
  this.blocked = blocked;
 }

 public void setTravelTime(int travelTime) {
  this.travelTime = travelTime;
 }
 
 
}
