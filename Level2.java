import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{
    private final float GRAVITY = 0.0667f;
    private final int SPEED = 3;
    private final float JUMP_FORCE = 5.6f;
    private final int MAX_HEALTH = 3;
    private final int MAX_POWERUP = 3;
    private final Class NEXT_LEVEL = Level3.class;
    private final GreenfootSound MUSIC = new GreenfootSound("incompetech_tribal.mp3");

    
    
    /**
     * Constructor for objects of class BrickWorld.
     * 
     */
    public Level2()
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
        BrickWall2 brickWall = new BrickWall2();
        addObject(brickWall,240,680);
        BrickWall2 brickWall2 = new BrickWall2();
        addObject(brickWall2,960,680);
        SmBrickWall2 smBrickWall = new SmBrickWall2();
        addObject(smBrickWall,540,560);
        SmBrickWall2 smBrickWall2 = new SmBrickWall2();
        addObject(smBrickWall2,660,560);
        Bomb bomb = new Bomb(GRAVITY);
        addObject(bomb,1069,763);
        Powerup powerup = new Powerup();
        addObject(powerup,1156,774);
        BrickWall2 brickWall3 = new BrickWall2();
        addObject(brickWall3,960,430);
        BrickWall2 brickWall4 = new BrickWall2();
        addObject(brickWall4,240,430);
        Bomb bomb2 = new Bomb(GRAVITY);
        addObject(bomb2,79,633);
        Powerup powerup2 = new Powerup();
        addObject(powerup2,24,644);
        Bomb bomb3 = new Bomb(GRAVITY);
        addObject(bomb3,1117,380);
        Powerup powerup3 = new Powerup();
        addObject(powerup3,1180,392);
        SmBrickWall2 smBrickWall4 = new SmBrickWall2();
        addObject(smBrickWall4,58,324);
        SmBrickWall2 smBrickWall5 = new SmBrickWall2();
        addObject(smBrickWall5,604,204);
        SmBrickWall2 smBrickWall6 = new SmBrickWall2();
        addObject(smBrickWall6,1142,98);
        removeObject(powerup2);
        removeObject(powerup3);
        removeObject(powerup);
    }
    
    private void spawn()
    {
        if(Math.random() < 0.0025)
        {
            addObject(new Rock(GRAVITY), Greenfoot.getRandomNumber(1200), -30);
        }
    }
}
