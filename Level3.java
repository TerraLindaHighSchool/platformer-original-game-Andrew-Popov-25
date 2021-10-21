import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends World
{
    private final float GRAVITY = 0.0667f;
    private final int SPEED = 3;
    private final float JUMP_FORCE = 5.6f;
    private final int MAX_HEALTH = 3;
    private final int MAX_POWERUP = 3;
    private final Class NEXT_LEVEL = WinSplash.class;
    private final GreenfootSound MUSIC = new GreenfootSound("incompetech_tribal.mp3");

    
    
    /**
     * Constructor for objects of class BrickWorld.
     * 
     */
    public Level3()
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
        TrapDoor3 trapDoor = new TrapDoor3(GRAVITY);
        addObject(trapDoor,60,688);
        SmBrickWall3 smBrickWall = new SmBrickWall3();
        addObject(smBrickWall,180,688);
        BrickWall3 brickWall = new BrickWall3();
        addObject(brickWall,480,688);
        SmBrickWall3 smBrickWall2 = new SmBrickWall3();
        addObject(smBrickWall2,779,688);
        SmBrickWall3 smBrickWall3 = new SmBrickWall3();
        addObject(smBrickWall3,899,688);
        SmBrickWall3 smBrickWall4 = new SmBrickWall3();
        addObject(smBrickWall4,1019,688);
        SmBrickWall3 smBrickWall5 = new SmBrickWall3();
        addObject(smBrickWall5,588,569);
        SmBrickWall3 smBrickWall6 = new SmBrickWall3();
        addObject(smBrickWall6,809,370);
        SmBrickWall3 smBrickWall7 = new SmBrickWall3();
        addObject(smBrickWall7,534,165);
        SmBrickWall3 smBrickWall8 = new SmBrickWall3();
        addObject(smBrickWall8,118,423);
        Powerup powerup = new Powerup();
        addObject(powerup,114,385);
        Powerup powerup2 = new Powerup();
        addObject(powerup2,76,385);
        Powerup powerup3 = new Powerup();
        addObject(powerup3,151,385);
        SmBrickWall3 smBrickWall9 = new SmBrickWall3();
        addObject(smBrickWall9,1140,98);
        Bomb bomb = new Bomb(2);
        addObject(bomb,853,324);
        Bomb bomb2 = new Bomb(2);
        addObject(bomb2,237,641);
        Bomb bomb3 = new Bomb(2);
        addObject(bomb3,487,108);
        SmBrickWall3 smBrickWall10 = new SmBrickWall3();
        addObject(smBrickWall10,820,81);
    }
    
    private void spawn()
    {
        if(Math.random() < 0.0025)
        {
            addObject(new Rock(GRAVITY), Greenfoot.getRandomNumber(1200), -30);
        }
    }
}
