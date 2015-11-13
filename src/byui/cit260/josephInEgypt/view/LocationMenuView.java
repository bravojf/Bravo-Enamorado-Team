/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.view;

import java.util.Scanner;

/**
 *
 * @author jocsan
 */
public class LocationMenuView extends View {

    public LocationMenuView() {
     
     super("\n"
         + "\n-------------------------------------------------------"
         + "\n|  Explore Location                                          |"
         + "\n-------------------------------------------------------"
         + "\nW - Warehouse"
         + "\nR - Riverside"
         + "\nC - Cattle"
         + "\nV - Village"
         + "\nT - City"
         + "\nM - Mountain"
         + "\nL - Mineral"
         + "\nQ - Quit"
         + "\n-------------------------------------------------------");
     
    }
    
    @Override
    public boolean doAction(Object obj) {
     
     String value = (String) obj;
     value = value.toUpperCase();
     char choice = value.charAt(0);
     
        switch (choice) {
            case 'W': // Display the move to a new location
                this.goToWarehouse();
                break;
            case 'R': // Explore a location
                this.goToRiverside();
                break;
            case 'C': // Calculate harvest
                this.goToCattle();
                break;
            case 'V': // Build the warehouse
                this.goToVillage();
                break;
            case 'T': // Build tools
                this.goToCity();
                break;
            case 'M': // Build containers
                this.goToMountain();
                break;
            case 'L': // Transport goods
                this.goToMineral();
                break;
            case 'Q': // Quit the game menu
                return true;
            default:
            System.out.println("\n*** Invalid selection *** Try again");
        break;
    }
  return false;
}

    private void goToWarehouse() {
       System.out.println("*** goToWarehouse stub called ***");
    }

    private void goToRiverside() {
       System.out.println("*** goToRiverside stub called ***");
    }

    private void goToCattle() {
       System.out.println("*** goToCattle stub called ***");
    }

    private void goToVillage() {
        System.out.println("*** goToVillage stub called ***");
    }

    private void goToCity() {
        System.out.println("*** goToCity stub called ***");
    }

    private void goToMountain() {
        System.out.println("*** goToMountain stub called ***");
    }

    private void goToMineral() {
        System.out.println("*** goToMineral stub called ***");
    }
}

