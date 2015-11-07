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
public class BuildContainersView {
   
    private final String BUILD_CONTAINERS_MENU = "\n"
         + "\n-------------------------------------------------------"
         + "\n|  Build Containers                                   |"
         + "\n-------------------------------------------------------"
         + "\nM - Max Weigth on Container"
         + "\nN - Containers Needed"
         + "\nV - Volume Of Container"
         + "\nQ - Quit"
         + "\n-------------------------------------------------------";

     void displayLocationMenu() {
       
    char selection = ' ';
    do{
   
        System.out.println(BUILD_CONTAINERS_MENU);
   
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
            case 'M': // Display the move to a new location
                this.calcMaxWeightOfContainer();
                break;
            case 'N': // Explore a location
                this.calcContainersNeeded();
                break;
            case 'V': // Calculate harvest
                this.calcVolumeOfContainer();
                break;
            case 'Q': // Quit the game menu
                return;
            default:
            System.out.println("\n*** Invalid selection *** Try again");
        break;
    }
}

    private void calcMaxWeightOfContainer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void calcContainersNeeded() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void calcVolumeOfContainer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
