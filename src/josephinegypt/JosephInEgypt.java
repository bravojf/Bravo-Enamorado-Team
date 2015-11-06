package josephinegypt;

import byui.cit260.josephInEgypt.model.Game;
import byui.cit260.josephInEgypt.model.Player;
import byui.cit260.josephInEgypt.model.Transport;
import byui.cit260.josephInEgypt.view.StartProgramView;

/**
 *
 * @author jocsan
 */
public class JosephInEgypt {
                                    
    /**
     * @param args the command line arguments
     */
    private static Game currentGame = null;
    private static Player player = null;
    private static Transport transport = null;
    
    public static void main(String[] args) {

     StartProgramView startProgramView = new StartProgramView();
     startProgramView.startProgram();
     
    }

 public static void setPlayer(Player player) {
  JosephInEgypt.player = player;
 }

 public static Game getCurrentGame() {
  return currentGame;
 }

 public static Player getPlayer() {
  return player;
 }

 public static void setCurrentGame(Game currentGame) {
  JosephInEgypt.currentGame = currentGame;
 }

 public static Transport getTransport() {
  return transport;
 }

 public static void setTransport(Transport transport) {
  JosephInEgypt.transport = transport;
 }
 
}
