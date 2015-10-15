/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package josephinegypt;

import byui.cit260.josephInEgypt.model.Actor;
import byui.cit260.josephInEgypt.model.Cattle;
import byui.cit260.josephInEgypt.model.City;
import byui.cit260.josephInEgypt.model.Container;
import byui.cit260.josephInEgypt.model.Game;
import byui.cit260.josephInEgypt.model.Inventory;
import byui.cit260.josephInEgypt.model.Location;
import byui.cit260.josephInEgypt.model.Map;
import byui.cit260.josephInEgypt.model.Mineral;
import byui.cit260.josephInEgypt.model.Mountain;
import byui.cit260.josephInEgypt.model.Player;
import byui.cit260.josephInEgypt.model.Riverside;
import byui.cit260.josephInEgypt.model.Transport;
import byui.cit260.josephInEgypt.model.Village;
import byui.cit260.josephInEgypt.model.Warehouse;

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
        
        Map mainMap = new Map();
        
        mainMap.setActualLocation("Mountain");
        
        String mapInfo = mainMap.toString();
        System.out.println(mapInfo);
        
        Actor actorOne = new Actor();
        
        actorOne.setActorLocation("Warehouse");
        actorOne.setActorTasks("Count Inventory");
        actorOne.setTimeSpent(8.00);
        
        String actorInfo = actorOne.toString();
        System.out.println(actorInfo);
        
        Player playerOne = new Player();
        
        playerOne.setPlayerName("Marvin");
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        Inventory mainInventory = new Inventory();
        
        mainInventory.setInventoryType("Flour");
        mainInventory.setQuantityInStock(125);
        mainInventory.setRequiredAmount(400);
        
        String inventoryInfo = mainInventory.toString();
        System.out.println(inventoryInfo);
        
        Warehouse inWarehouse = new Warehouse();
        
        inWarehouse.setWarehouseSize(800);
        inWarehouse.setInventoryDescription("Mineral");
        
        String warehouseInfo = inWarehouse.toString();
        System.out.println(warehouseInfo);
        
        Container containerOne = new Container();
        
        containerOne.setContainerSize(200);
        containerOne.setInventoryDescription("Cattle");
        
        String containerInfo = containerOne.toString();
        System.out.println(containerInfo);
        
        Transport mainTransport = new Transport();
        
        mainTransport.setTimeInTransit(5.00);
        mainTransport.setInventoryDescription("Fruits");
        
        String transportInfo = mainTransport.toString();
        System.out.println(transportInfo);
    }

    @Override
    public String toString() {
        return "JosephInEgypt{" + '}';
    }
    
}
