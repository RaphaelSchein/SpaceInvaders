import greenfoot.*;
import java.util.*;

/**
 * Write a description of class Fire here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fire extends Actor
{
    private boolean alive;
    
    public Fire(){
        alive = true;
        setRotation(270);
    }
    
    
    public void act() 
    {
        /*Falls das Objekt "lebt" (alive) fliegt es und prüft auf kollisionen.       
        */
    }    
    
    
    public void fly(){
        //Das Objekt bewegt sich 5 Schritte in Blickrichtung
        
    }
    
    public void kollision(){
        //Nach Erstellung der Beziehung auskommentieren
        /*if(isTouching(Enemy.class)){
            removeTouching(Enemy.class);
            alive = false;
            hero.firecheck();
            hero.enemykilled();
            getWorld().removeObject(this);
            return;
        }               
        if (alive && isAtEdge()){
            hero.firecheck();
            getWorld().removeObject(this);
            return;
        }*/
    }
    
    
}
