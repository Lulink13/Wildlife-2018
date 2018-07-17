/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Speedbug & Lulu
 */
public class WildLife 
{
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // Création du jeu
        WildLifeGame theGame = new WildLifeGame(15,WildLifeGame.MODE_WINDOW);
        theGame.runGame();
        //theGame.endGame();
        theGame = null;
        System.exit(0);
    }
}
