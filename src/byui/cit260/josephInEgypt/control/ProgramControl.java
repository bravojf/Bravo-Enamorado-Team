/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.control;

import byui.cit260.josephInEgypt.model.Player;
import josephinegypt.JosephInEgypt;

/**
 *
 * @author jocsan
 */
public class ProgramControl {

    public static Player createPlayer(String name) {
       if(name == null){
           return null;
       }
       
       Player player = new Player();
       player.setPlayerName(name);
       
       JosephInEgypt.setPlayer(player);
       return player;
    }
    
}