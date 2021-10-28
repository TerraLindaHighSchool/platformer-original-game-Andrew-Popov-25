import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MovingPlatform here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MovingPlatform extends Platform
{
    private boolean MovingRight;
    private boolean MovingDecided = false;
    
    /**
     * Act - do whatever the MovingPlatform wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        prepareMovement();
        checkEdge();
        glide();
    }
    
    private void prepareMovement()
    {
        if(MovingDecided = false)
        {
            if(Math.random() < 0.5)
                MovingRight = true;
            else
                MovingRight = false;
                
            MovingDecided = true;
        }
    }
    
    private void glide()
    {
        if(MovingDecided = true)
        {
            if(MovingRight = true)
                move(3);
            else
                move(-3);
        }
    }
    
    private void checkEdge()
    {
        if(isAtEdge())
        {
            if(MovingRight = false)
                MovingRight = false;
            else
                MovingRight = true;
        }
    }
}
