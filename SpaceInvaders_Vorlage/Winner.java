import greenfoot.*;
import java.awt.Color;

/**
 * Write a description of class Winner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Winner extends Actor
{

    
    public Winner(int i){
        setWinner(i);
    }
    
    public void act() 
    {
        // Add your action code here.
    }  
    
    public void setWinner(int i){
        if (i == 1){
            setImage(new GreenfootImage("You Lost", 50, Color.BLACK , Color.WHITE, Color.WHITE));
        }
        else{
            setImage(new GreenfootImage("You Win", 50, Color.BLACK , Color.WHITE, Color.WHITE));
        }
    }
}
