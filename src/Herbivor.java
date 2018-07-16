/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wildlife;

/**
 *
 * @author Speedbug & Lulu
 */
abstract class Herbivor extends Animal 
{
    
    /*
     * Constructeur
     */
    public Herbivor(GameMap gm, long dateDeNaissance)
    {
        super(gm, dateDeNaissance);
    }
    
    public Herbivor(GameMap gm, long dateDeNaissance, Animal Pere, Animal Mere)
    {
        super(gm, dateDeNaissance,Pere,Mere);
    }
    
    
}
