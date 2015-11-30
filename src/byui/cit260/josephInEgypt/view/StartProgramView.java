/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.view;

import byui.cit260.josephInEgypt.control.ProgramControl;
import byui.cit260.josephInEgypt.model.Player;
import java.util.Scanner;

/**
 *
 * @author jocsan
 */
public class StartProgramView {
    
    public StartProgramView(){
    }
    public void startProgram(){
    
     // display the banner screen
     this.displayBanner();
     
     // prompt the player to enter their name Retrieve the name of the player  
     String playersName = this.getPlayersName();
     
     // create and save the player object
     Player player = ProgramControl.createPlayer(playersName);
     
     // display a personalized welcome message
     this.displayWelcomeMessage(player);
     
     // display the main menu
     MainMenuView mainMenu = new MainMenuView();
     mainMenu.display();
     
    }

    private void displayBanner() {
        System.out.println("\n\n****************************************************");
        System.out.println("*                                                      *"
                + "\n* This is the game Joseph In Egypt                            *"
                + "\n* In this game you will help Joseph to save Egypt from famine *"
                + "\n* by saving and mannaging the many resources Egypt has during *"
                + "\n* the seven years of abundance.                               *");
        System.out.println("*                                                      *"
                + "\n* You and the chief officers of the seven territories will    *"
                + "\n* cooperate to coordinate the people to work the land and     *"
                + "\n* prepare every needful thing for the harsh season.           *"
                + "\n* As the major officer in Egypt you (Joseph) will administer  *"
                + "\n* all the preparations for the seven harsh years of drought.  *");
         System.out.println("*                                                     *"
                 + "\n* Good luck and have fun in this adventure.                  *"
                 + "\n*                                                            *");
         System.out.println("*******************************************************");
    }

    private String getPlayersName() {
        
        boolean valid = false; // indicates if the name has been retrieved
        String playersName = null;
        Scanner keyboard = new Scanner(System.in); // keyboard input stream
        
        while(!valid){ // while a valid name has not been retrieved
         
            // prompt for the player's name
            System.out.println("Enter the player's name below:");
            
            // get the name from the keyboard and trim off the blanks
            playersName = keyboard.nextLine();
            playersName = playersName.trim();
            
            // if the name is invalid (less than two characters in length)
            if(playersName.length() < 2 ){
              System.out.println("Invalid name - the name must not be blank");
              continue; // and repeat again
            }
            break; // out of the (exit) the repetition
        }
        return playersName; // return the name
    }

    private void displayWelcomeMessage(Player player) {
       System.out.println("\n\n=================================================");
       System.out.println("\tWelcome to the game " + player.getName());
       System.out.println("\tWe hope you have a lot of fun!");
       System.out.println("=====================================================");
    }

 public void display() {
  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
 }
}
