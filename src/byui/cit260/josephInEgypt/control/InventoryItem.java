/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.control;

/**
 *
 * @author Marvin y Amada
 */
class InventoryItem {
    public enum Item{
        meat,
        ore,
        rock,
        wood,
        grain,
        legume,
        water,
        oil,
        honey,
        salt;
    }

    public static InventoryItem[] createInventoryList(){
        InventoryItem[] inventory =
             new InventoryItem[Constants.NUMBER_OF_INVENTORY_ITEMS];

        InventoryItem meat = new InventoryItem();
        meat.setDescription("Meat");
        meat.setQuantityInStock(0);
        meat.setRequiredAmount(0);
        inventory[Item.meat.ordinal()] = meat;

        InventoryItem ore = new InventoryItem();
        ore.setDescription("Ore");
        ore.setQuantityInStock(0);
        ore.setRequiredAmount(0);
        inventory[Item.ore.ordinal()] = ore;

        InventoryItem rock = new InventoryItem();
        rock.setDescription("Rock");
        rock.setQuantityInStock(0);
        rock.setRequiredAmount(0);
        inventory[Item.rock.ordinal()] = rock;

        InventoryItem wood = new InventoryItem();
        wood.setDescription("Wood");
        wood.setQuantityInStock(0);
        wood.setRequiredAmount(0);
        inventory[Item.wood.ordinal()] = wood;

        InventoryItem grain = new InventoryItem();
        grain.setDescription("Grain");
        grain.setQuantityInStock(0);
        grain.setRequiredAmount(0);
        inventory[Item.grain.ordinal()] = grain;

        InventoryItem legume = new InventoryItem();
        legume.setDescription("Legume");
        legume.setQuantityInStock(0);
        legume.setRequiredAmount(0);
        inventory[Item.legume.ordinal()] = legume;

        InventoryItem water = new InventoryItem();
        water.setDescription("Water");
        water.setQuantityInStock(0);
        water.setRequiredAmount(0);
        inventory[Item.water.ordinal()] = water;

        InventoryItem oil = new InventoryItem();
        oil.setDescription("Oil");
        oil.setQuantityInStock(0);
        oil.setRequiredAmount(0);
        inventory[Item.oil.ordinal()] = oil;

        InventoryItem honey = new InventoryItem();
        honey.setDescription("Honey");
        honey.setQuantityInStock(0);
        honey.setRequiredAmount(0);
        inventory[Item.honey.ordinal()] = honey;

        InventoryItem salt = new InventoryItem();
        salt.setDescription("Salt");
        salt.setQuantityInStock(0);
        salt.setRequiredAmount(0);
        inventory[Item.salt.ordinal()] = salt;

    return inventory;
}
}