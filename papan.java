import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class papan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class papan extends Actor
{
    /**
     * Act - do whatever the papan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        {
        if(Greenfoot.isKeyDown("left")){
            move(-3);
        }
        if(Greenfoot.isKeyDown("right")){
            move(3);
        }
    }      // Add your action code here.
    }    
}
