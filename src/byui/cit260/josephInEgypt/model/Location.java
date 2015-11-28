/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
import javafx.scene.Scene;
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
    
    
    private String visited;
    private String cityName;

    public Location() {
    }
    
    

    public String getVisited() {
        return visited;
    }

    public void setVisited(String visited) {
        this.visited = visited;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.visited);
        hash = 71 * hash + Objects.hashCode(this.cityName);
        return hash;
    }

    @Override
    public String toString() {
        return "Location{" + "visited=" + visited + ", cityName=" + cityName + '}';
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
        if (!Objects.equals(this.visited, other.visited)) {
            return false;
        }
        if (!Objects.equals(this.cityName, other.cityName)) {
            return false;
        }
        return true;
    }
    
    
    
}
