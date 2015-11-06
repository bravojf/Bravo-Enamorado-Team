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
public class LocationMenuView {
    
    private final String LOCATION_MENU = "\n"
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
         + "\n-------------------------------------------------------";

    void displayLocationMenu() {
       
    char selection = ' ';
    do{
   
        System.out.println(LOCATION_MENU);
   
        String input = this.getInput();
        selection = input.charAt(0);
        this.doAction(selection);
   
        } while (selection != 'Q'); 
    }

    private String getInput() {
        boolean valid = false; // indicates if the option has been retrieved
        String input = null;
        Scanner keyboard = new Scanner(System.in); // keyboard input stream
        
        while(!valid){ // while a valid name has not been retrieved
         
         // prompt for the player's name
        System.out.println("Enter the option below:");
            
        // get the name from the keyboard and trim off the blanks
        input = keyboard.nextLine();
        input = input.trim();
            
        // if the name is invalid (less than two characters in length)
        if(input.length() < 1 ){
        System.out.println("Invalid name - the name must not be blank");
        continue; // and repeat again
        }
        break; // out of the (exit) the repetition
        }
        return input; // return option
    }
    

    private void doAction(char choice) {
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
                return;
            default:
            System.out.println("\n*** Invalid selection *** Try again");
        break;
  
    }
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

