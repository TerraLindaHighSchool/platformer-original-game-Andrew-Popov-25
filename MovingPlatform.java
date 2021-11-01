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
        glitch();
        imageChanger();
    }
    
    private void glide()
    {
        {
            if(MovingRight == true)
                move(2);
            else
                move(-2);
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
    
    private void glitch()
    {
        if(this.getWorld().getClass() == Level7.class)
        {
            if(Math.random() < 0.005)
            {
                if(MovingRight == true)
                    move(-Greenfoot.getRandomNumber(75));
                else
                    move(Greenfoot.getRandomNumber(75));
            } 
        }
    }
    
    private void imageChanger()
    {    
        if(this.getWorld().getClass() == Level7.class)
        {          
            GreenfootImage dementedVariant;
            dementedVariant = new GreenfootImage("brick_demented2_quarter.png");
            setImage(dementedVariant);
        }
    }
}
