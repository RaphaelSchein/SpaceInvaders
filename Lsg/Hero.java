import greenfoot.*;

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    private boolean reloaded;
    private boolean alive;
    private int enemies;
    
    public Hero(){
        reloaded = true;
        alive = true;
        enemies = 90;
    }
    
    public void act(){
        if (!alive)return;
        if (Greenfoot.isKeyDown("f")){
            if(reloaded){
            reloaded = false;
            fire();
            return;
        }
        }
        moving();
    }    
    
    public void moving(){
        if (Greenfoot.isKeyDown("a"))setLocation(getX()-20,getY());
        if (Greenfoot.isKeyDown("d"))setLocation(getX()+20,getY());
    }
    

    public void fire(){
        Fire f = new Fire(this);
        getWorld().addObject(f, getX(),getY()-20);
    }
    
    public void firecheck(){
        reloaded = true;
    }
    
    
    public void enemykilled(){
        enemies--;
        if (enemies == 0){
            getWorld().addObject(new Winner(0), 450, 300);
        }
    }
    
}
