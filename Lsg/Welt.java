import greenfoot.*;

/**
 * Write a description of class Welt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Welt extends World
{

    private int enemies;
    
    /**
     * Constructor for objects of class Welt.
     * 
     */
    public Welt()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
        build();
        enemies = 90;
    }
    
    public void build(){
        int x = 55;
        int y = 55;
        for (int i = 0; i<15; i++){
            for(int j = 0; j<6; j++){
                Enemy enemy = new Enemy();
                addObject(enemy, x*(i+1),y*(j+1));
            }
        }
        Hero hero = new Hero();
        addObject(hero, 450, 550);
    }
    
}
