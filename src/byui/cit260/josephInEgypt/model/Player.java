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
public class Player implements Serializable{
 
 //class instance variables
 private String playerName;

 public Player() {
 }
 
 

 public String getPlayerName() {
  return playerName;
 }

 public void setPlayerName(String playerName) {
  this.playerName = playerName;
 }

 @Override
 public int hashCode() {
  int hash = 7;
  hash = 29 * hash + Objects.hashCode(this.playerName);
  return hash;
 }

 @Override
 public String toString() {
  return "Player{" + "playerName=" + playerName + '}';
 }
 
 
 
 @Override
 public boolean equals(Object obj) {
  if (obj == null) {
   return false;
  }
  if (getClass() != obj.getClass()) {
   return false;
  }
  final Player other = (Player) obj;
  if (!Objects.equals(this.playerName, other.playerName)) {
   return false;
  }
  return true;
 } 

 public String getName() {
  System.out.println("\n*** getName function called ***");
  return null;
 }

 public void setName(String name) {
  System.out.println("\n*** setName function called ***");
 }
 
}
