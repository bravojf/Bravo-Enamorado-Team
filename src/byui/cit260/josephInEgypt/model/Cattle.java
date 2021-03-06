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
public class Cattle implements Serializable {
     private int  numberOfWorkers;
     private String statusOfSource;

    public Cattle() {
    }

     
    public int getNumberOfWorkers() {
        return numberOfWorkers;
    }

    public void setNumberOfWorkers(int numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
    }

    public String getStatusOfSource() {
        return statusOfSource;
    }

    public void setStatusOfSource(String statusOfSource) {
        this.statusOfSource = statusOfSource;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + this.numberOfWorkers;
        hash = 19 * hash + Objects.hashCode(this.statusOfSource);
        return hash;
    }

    @Override
    public String toString() {
        return "Cattle{" + "numberOfWorkers=" + numberOfWorkers + ", statusOfSource=" + statusOfSource + '}';
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cattle other = (Cattle) obj;
        if (this.numberOfWorkers != other.numberOfWorkers) {
            return false;
        }
        if (!Objects.equals(this.statusOfSource, other.statusOfSource)) {
            return false;
        }
        return true;
    }

    
}
