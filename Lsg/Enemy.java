import greenfoot.*;

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor{
    private int anzahl;
    private int counter;
    private int direction;
    private boolean lost;

    public Enemy(){direction = 20;}
    /*bewegen():
     * Diese Methode bewegt natürlich das Objekt. Immer einen Schritt in die Richtung und beim nächsten Mal
     * einen Schritt in die Gegenrichtung. Nach vier "Schritten" (gezählt durch das Attribut anzahl), soll 
     * das Objekt einen Schritt nach unten machen.
     */
    /*checkLoss()
     * Wenn das Objekt den Helden isTouching(Hero.class) oder den Rand berührt hat man verloren und erzeugt
     * das Verliereschild: getWorld().addObject(new Winner(1), 450, 300);
     */
    /*act()
     * Das Objekt soll sich bewegen. Damit die Bewegung aber nicht zu schnell ist, wird eine künstliche 
     * Verzögerung eingebaut. Diese funktioniert über das Attribut counter. Bei jedem Aufruf von act wird 
     * dieser erhöht. Bei jedem 40. Mal bewegt sich das Objekt.
     * Nebenbei muss es natürlich ständig prüfen, ob der Held verloren hat.
     */

    public void bewegen(){
        if (anzahl == 4){
            setLocation(getX(),getY()+direction);
            anzahl = 0;
            return;
        }
        anzahl++;
        if (anzahl == 1 ||anzahl == 3)
            move(direction);
        if (anzahl == 2 ||anzahl == 4)
            move(-direction);
    }

    public boolean checkLoss(){
        if (isTouching(Hero.class)){
            Greenfoot.stop();
                        lost = true;
            return true;
        }
        if (isAtEdge()){
                        Greenfoot.stop();
                        lost = true;
            return true;
        }
        return false;
    }

    public void act(){
        if(lost)return;
        if (checkLoss()){
            getWorld().addObject(new Winner(1), 450, 300);

            return;
        }
        if (counter >= 40){
            bewegen();
            counter = 0;
            return;
        }
        counter++;
    }
    

}
