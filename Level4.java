import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level4 extends World
{
    private final float GRAVITY = 0.0667f;
    private final int SPEED = 3;
    private final float JUMP_FORCE = 5.6f;
    private final int MAX_HEALTH = 3;
    private final int MAX_POWERUP = 3;
    private final Class NEXT_LEVEL = Level5.class;
    private final GreenfootSound MUSIC = new GreenfootSound("Lava Sounds.mp3");

    
    
    /**
     * Constructor for objects of class BrickWorld.
     * 
     */
    public Level4()
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
        SmBrickWall4 smBrickWall4 = new SmBrickWall4();
        addObject(smBrickWall4,320,615);
        SmBrickWall4 smBrickWall42 = new SmBrickWall4();
        addObject(smBrickWall42,952,693);
        SmBrickWall4 smBrickWall44 = new SmBrickWall4();
        addObject(smBrickWall44,333,280);
        SmBrickWall4 smBrickWall45 = new SmBrickWall4();
        addObject(smBrickWall45,1061,336);
        SmBrickWall4 smBrickWall46 = new SmBrickWall4();
        addObject(smBrickWall46,713,171);
        TrapDoor4 trapDoor4 = new TrapDoor4(GRAVITY);
        addObject(trapDoor4,614,399);
        SmBrickWall4 smBrickWall43 = new SmBrickWall4();
        addObject(smBrickWall43,-2,431);
    }
    
    private void spawn()
    {
        if(Math.random() < 0.0025)
        {
            addObject(new Rock2(GRAVITY), Greenfoot.getRandomNumber(1200), -30);
        }
    }
}
