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
public class Container implements Serializable{
 
 // class instance variables
 private long numberBarrelsLoaded;
 private double maxWeight;
 private double loadedWeight;
 
 public Container() {
  this.numberBarrelsLoaded = 0;
  this.maxWeight = 1000;
  this.loadedWeight = 0;
 }
 
}
