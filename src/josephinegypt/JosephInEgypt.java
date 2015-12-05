package josephinegypt;

import byui.cit260.josephInEgypt.model.Game;
import byui.cit260.josephInEgypt.model.Player;
import byui.cit260.josephInEgypt.model.Transport;
import byui.cit260.josephInEgypt.view.StartProgramView;
//import byui.cit260.josephInEgypt.model.PrintWriter;

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
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    public static void main(String[] args) {
        
        JosephInEgypt.inFile = 
                new BufferedReader(new InputStreamReader(System.in));
        JosephInEgypt.outFile = new PrintWriter(System.out, true);

     StartProgramView startProgramView = new StartProgramView();
     try {
      startProgramView.display();
      return;
      
     } catch(Throwable te) {
        System.out.println(te.getMessage());
         te.printStackTrace();
         startProgramView.display();
     }
     
     finally{
         try{
             if (JosephInEgypt.inFile !=null)
                 JosephInEgypt.inFile.close();
             
             if (JosephInEgypt.outFile !=null)
                 JosephInEgypt.outFile.close();
         
     } catch (IOException ex){
         Logger.getLogger(JosephInEgypt.class.getName()).log(level.S)
     }
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
 
 private static PrintWriter getOutFile(){
     return outFile;
 }
 
 private static void setOutFile(PrintWriter outFile){
     JosephInEgypt.outFile = outFile;
 }
 
 private static BufferedReader getInFile(){
     return inFile;
 }
 
 public static void setInFile(BufferedReader inFile){
     JosephInEgypt.inFile = inFile;
 }
 
}
