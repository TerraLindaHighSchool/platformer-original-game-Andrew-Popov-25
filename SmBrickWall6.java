import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SmBrickWall6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SmBrickWall6 extends Platform
{
    /**
     * Act - do whatever the SmBrickWall6 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        glitch();
    }
    
    private void glitch()
    {
        if(Math.random() < 0.005)
        {
            if(Math.random() <0.5)
                move(Greenfoot.getRandomNumber(50));
            else
                move(-Greenfoot.getRandomNumber(50));
        }
    }
}
