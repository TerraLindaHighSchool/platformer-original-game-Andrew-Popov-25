import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rock3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rock3 extends Obstacle
{
    private float yVelocity;
    private final float GRAVITY;
    
    public Rock3(float gravity)
    {
        GRAVITY = gravity;
    }
    
    public void act()
    {
        fall();
        glitch();
    }
    
    protected void fall()
    {
        if(!isOnGround())
            {
                yVelocity += GRAVITY;
                setLocation(getX(), getY() + (int) yVelocity);
            }
    }
    
    private void glitch()
    {
        if(Math.random() < 0.02)
        {
            if(Math.random() <0.5)
            {    
                setLocation(getX(), getY() - 50 );
                yVelocity = 0;
            }   
        }
    }
}
