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

    public static Player CreatePlayer(String playersName) {
       if(playersName == null){
           return null;
       }
       
       Player player = new Player();
       player.setName(playersName);
       
       JosephInEgypt.setPlayer(player);
       return player;
    }
    
}