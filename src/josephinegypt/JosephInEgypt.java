/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package josephinegypt;

import byui.cit260.josephInEgypt.model.Cattle;
import byui.cit260.josephInEgypt.model.Game;
import byui.cit260.josephInEgypt.model.Location;
import byui.cit260.josephInEgypt.model.Mountain;

/**
 *
 * @author jocsan
 */
public class JosephInEgypt {
                                    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Game gameOne = new Game();
           
        gameOne.setPlayer("Jose");
        gameOne.setTimeStatus(14.00);
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
        
        
        Location locationOne = new Location();
        
        
        locationOne.setCityName("city");
        locationOne.setVisited("visited");
        
        String locationInfo = locationOne.toString();
        System.out.println(locationInfo);
        
        
        Mountain mountainOne = new Mountain();
        
        mountainOne.setNumberOfWorkers(350);
        mountainOne.setStatusOfSource("good");
        
        String mountainInfo = mountainOne.toString();
        System.out.println(mountainInfo);
        
        
        Cattle cattleOne = new Cattle();
        
        cattleOne.setNumberOfWorkers(400);
        cattleOne.setStatusOfSource("good");
        
        String cattleInfo = cattleOne.toString();
        System.out.println(cattleInfo);
        
    }

    @Override
    public String toString() {
        return "JosephInEgypt{" + '}';
    }
    
}
