import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MovingPlatform here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MovingPlatform extends Platform
{
    private boolean MovingRight = false;
    
    public MovingPlatform(boolean movingRight)
    {
        MovingRight = movingRight;
    }
    
    /**
     * Act - do whatever the MovingPlatform wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkEdge();
        glide();
    }
    
    private void glide()
    {
        {
            if(MovingRight == true)
                move(3);
            else
                move(-3);
        }
    }
    
    private void checkEdge()
    {
        if(isAtEdge())
        {
            if(MovingRight == true)
                MovingRight = false;
            else
                MovingRight = true;
        }
    }
}
