import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bolaplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bolaplay extends Actor
{
    int x=3;
    int y=3;
    /**
     * Act - do whatever the bola wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        gerak();
        kanan();
        kiri();
        atas();
        bawah();
    }    
    public void gerak()
    {
        setLocation(getX()+x,getY()+y);
    }
    public void kanan()
    {
        if(getX()>=getWorld().getWidth()-getImage().getWidth()/2){
            x=x-1;
        }
    }
    public void kiri()
    {
        if(getX()<=getImage().getWidth()/2){
            x=x+1;
        }
    }
    public void atas()
    {
        Actor batamerah=getOneIntersectingObject(bata.class);
        if(getY()<=getImage().getHeight()/2){
            y=y+1;
        }
        if(batamerah !=null){
            
            getWorld().removeObject(batamerah);
        }
    }
    public void bawah()
    {
        
        if(getY()>=getWorld().getHeight()-getImage().getHeight()/2){
            y=y-1;
        }
    }
}