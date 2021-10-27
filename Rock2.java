import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rock2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rock2 extends Obstacle
{
    private float yVelocity;
    private final float GRAVITY;
    
    public Rock2(float gravity)
    {
        GRAVITY = gravity;
    }
    
    public void act()
    {
        fall();
    }
    
    protected void fall()
    {
        if(!isOnGround())
            {
                yVelocity += GRAVITY;
                setLocation(getX(), getY() + (int) yVelocity);
            }
    }
}
