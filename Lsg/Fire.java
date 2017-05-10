import greenfoot.*;

/**
 * Write a description of class Fire here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fire extends Actor
{
    private boolean alive;
    private Hero hero;
    
    public Fire(Hero hero){
        this.hero = hero;
        alive = true;
        setRotation(270);
    }
    
    
    public void act(){
        if (alive)fly();
        if (alive)fly();
        if (alive)fly();
        if (alive)fly();
        if (alive)fly();
        if (alive)kollision();
    }    
    
    
    public void fly(){
        kollision();
        move(20);
       }
    
    public void kollision(){

        try {
            isAtEdge();
        }catch (IllegalStateException e){
            return;
        }
        if (alive && isAtEdge()){
            hero.firecheck();
            getWorld().removeObject(this);
            return;
        }
        if(isTouching(Enemy.class)){
            removeTouching(Enemy.class);
            alive = false;
            hero.firecheck();
            hero.enemykilled();
            getWorld().removeObject(this);
            return;
        }               
       
        
    }
    
    
}
