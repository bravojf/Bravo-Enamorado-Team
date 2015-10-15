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
 * @author jocsan
 */
public class  Game implements Serializable {
    
    private double timeStatus;
    private String player;

    public Game() {
    }
    
    

    public double getTimeStatus() {
        return timeStatus;
    }

    public void setTimeStatus(double timeStatus) {
        this.timeStatus = timeStatus;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
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
    
    
}
