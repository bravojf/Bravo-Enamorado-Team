/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package josephinegypt;

import byui.cit260.josephInEgypt.model.Game;

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
        
    }
    
}
