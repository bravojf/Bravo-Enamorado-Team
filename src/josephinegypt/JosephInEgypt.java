/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package josephinegypt;

import byui.cit260.josephInEgypt.model.Cattle;
import byui.cit260.josephInEgypt.model.City;
import byui.cit260.josephInEgypt.model.Game;
import byui.cit260.josephInEgypt.model.Location;
import byui.cit260.josephInEgypt.model.Mineral;
import byui.cit260.josephInEgypt.model.Mountain;
import byui.cit260.josephInEgypt.model.Riverside;
import byui.cit260.josephInEgypt.model.Village;

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
        
        
        Village villageOne = new Village();
        
        villageOne.setNumberOfWorkers(450);
        villageOne.setStatusOfSource("good");
        
        String villageInfo = villageOne.toString();
        System.out.println(villageInfo);
        
        
        Riverside riversideOne = new Riverside();
        
        riversideOne.setNumberOfWorkers(400);
        riversideOne.setStatusOfSource("good");
        
        String riversideInfo = riversideOne.toString();
        System.out.println(riversideInfo);
        
        
        
        Mineral mineralOne = new Mineral();
        
        mineralOne.setNumberOfWorkers(400);
        mineralOne.setStatusOfSource("good");
        
        String mineralInfo = mineralOne.toString();
        System.out.println(mineralInfo);
        
        
        
        City cityOne = new City();
        
        cityOne.setNumberOfWorkers(300);
        cityOne.setStatusOfSource("good");
        
        String cityInfo = cityOne.toString();
        System.out.println(cityInfo);
        
    }

    @Override
    public String toString() {
        return "JosephInEgypt{" + '}';
    }
    
}
