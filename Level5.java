import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level5 extends World
{
    private final float GRAVITY = 0.0667f;
    private final int SPEED = 3;
    private final float JUMP_FORCE = 5.6f;
    private final int MAX_HEALTH = 3;
    private final int MAX_POWERUP = 3;
    private final Class NEXT_LEVEL = Level6.class;
    private final GreenfootSound MUSIC = new GreenfootSound("8bit.mp3");
    
    
    /**
     * Constructor for objects of class BrickWorld.
     * 
     */
    public Level5()
    {    
        // Create a new world with 1200x800 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1, false); 
        prepare();
    }
    
    public void act()
    {
        spawn();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        setPaintOrder(Player.class, Platform.class, Obstacle.class, Collectable.class,Door.class, HUD.class);
        Player player = new Player(SPEED, JUMP_FORCE, GRAVITY, MAX_HEALTH, MAX_POWERUP, NEXT_LEVEL, MUSIC);
        addObject(player,43,760);
        Door door = new Door();
        addObject(door,1178,40);
        Floor floor = new Floor();
        addObject(floor, 600, 800);
        MovingPlatform movingPlatform = new MovingPlatform(false);
        addObject(movingPlatform,562,639);
        MovingPlatform movingPlatform2 = new MovingPlatform(true);
        addObject(movingPlatform2,872,538);
        MovingPlatform movingPlatform3 = new MovingPlatform(true);
        addObject(movingPlatform3,231,409);
        MovingPlatform movingPlatform4 = new MovingPlatform(true);
        addObject(movingPlatform4,720,272);
        MovingPlatform movingPlatform5 = new MovingPlatform(false);
        addObject(movingPlatform5,364,125);
    }
    
    private void spawn()
    {
        if(Math.random() < 0.0025)
        {
            addObject(new Rock(GRAVITY), Greenfoot.getRandomNumber(1200), -30);
        }
    }
}
