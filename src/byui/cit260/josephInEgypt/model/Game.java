/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.model;


import byui.cit260.josephInEgypt.control.Scene;
import byui.cit260.josephInEgypt.control.InventoryItem;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author jocsan
 */
public class  Game implements Serializable {
    
    private double timeStatus;
    private Player player;
    private InventoryItem[] inventory;
    private String[] actor;
    private Warehouse warehouse;
    private Container container;
    private Map map;
    private Location[][] locations;
    private Scene[] scenes;

 public void setLocations(Location[][] locations) {
  this.locations = locations;
 }

 public void setScenes(Scene[] scenes) {
  this.scenes = scenes;
 }

 public Location[][] getLocations() {
  return locations;
 }

 public Scene[] getScenes() {
  return scenes;
 }

 public double getTimeStatus() {
  return timeStatus;
 }

 public Player getPlayer() {
  return player;
 }

 public InventoryItem[] getInventory() {
  return inventory;
 }

 public String[] getActor() {
  return actor;
 }

 public Warehouse getWarehouse() {
  return warehouse;
 }

 public Container getContainer() {
  return container;
 }

 public Map getMap() {
  return map;
 }

 public void setTimeStatus(double timeStatus) {
  this.timeStatus = timeStatus;
 }

 public void setPlayer(Player player) {
  this.player = player;
 }

 public void setInventory(InventoryItem[] inventory) {
  this.inventory = inventory;
 }

 public void setActor(String[] actor) {
  this.actor = actor;
 }

 public void setWarehouse(Warehouse warehouse) {
  this.warehouse = warehouse;
 }

 public void setContainer(Container container) {
  this.container = container;
 }

 public void setMap(Map map) {
  this.map = map;
 }    

// public void setInventory(byui.cit260.josephInEgypt.control.InventoryItem[] inventoryList) {
//  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
// }

}