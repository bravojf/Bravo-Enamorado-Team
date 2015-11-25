/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.model;

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
    private InventoryControl[] inventory;
    private String[] actor;
    private Transport transport;
    private Map map;

    public Game() {
    }

 public Player getPlayer() {
  return player;
 }

 public InventoryControl[] getInventory() {
  return inventory;
 }

 public String[] getActor() {
  return actor;
 }

 public Transport getContainer() {
  return container;
 }

 public Map getMap() {
  return map;
 }

 public void setPlayer(Player player) {
  this.player = player;
 }

 public void setInventory(InventoryControl[] inventory) {
  this.inventory = inventory;
 }

 public void setActor(String[] actor) {
  this.actor = actor;
 }

 public void setContainer(Transport container) {
  this.container = container;
 }

 public void setMap(Map map) {
  this.map = map;
 }
    
    

    public double getTimeStatus() {
        return timeStatus;
    }

    public void setTimeStatus(double timeStatus) {
        this.timeStatus = timeStatus;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.timeStatus) ^ (Double.doubleToLongBits(this.timeStatus) >>> 32));
        hash = 11 * hash + Objects.hashCode(this.player);
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "timeStatus=" + timeStatus + ", player=" + player + '}';
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.timeStatus) != Double.doubleToLongBits(other.timeStatus)) {
            return false;
        }
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        return true;
    }    

 public void setTransport(Transport transport) {
  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
 }

 public void setInventory(InventoryItem[] inventoryList) {
  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
 }
    
    
}
