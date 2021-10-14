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
    private final Class NEXT_LEVEL = WinSplash.class;
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
        Bomb bomb = new Bomb(GRAVITY);
        addObject(bomb, 56, 56);
        BrickWall brickWall = new BrickWall();
        addObject(brickWall,961,97);
        TrapDoor trapDoor = new TrapDoor(GRAVITY);
        addObject(trapDoor,975,100);
        SmBrickWall smBrickWall = new SmBrickWall();
        addObject(smBrickWall,1004,272);
        BrickWall brickWall2 = new BrickWall();
        addObject(brickWall2,840,438);
        BrickWall brickWall3 = new BrickWall();
        addObject(brickWall3,960,646);
        removeObject(brickWall2);
        addObject(brickWall2,769,367);
        removeObject(smBrickWall);
        addObject(smBrickWall,974,215);
        SmBrickWall smBrickWall2 = new SmBrickWall();
        addObject(smBrickWall2,57,470);
        BrickWall brickWall4 = new BrickWall();
        addObject(brickWall4,408,528);
        removeObject(smBrickWall2);
        addObject(smBrickWall2,59,435);
        SmBrickWall smBrickWall3 = new SmBrickWall();
        addObject(smBrickWall3,353,228);
        removeObject(bomb);
        addObject(bomb,698,765);
        Bomb bomb2 = new Bomb(GRAVITY);
        addObject(bomb2,390,182);
        Powerup powerup = new Powerup();
        addObject(powerup,936,180);
        Powerup powerup2 = new Powerup();
        addObject(powerup2,1012,180);
        Powerup powerup3 = new Powerup();
        addObject(powerup3,975,180);
        removeObject(brickWall);
        SmBrickWall smBrickWall4 = new SmBrickWall();
        addObject(smBrickWall4,1140,100);
        trapDoor.setLocation(1029,97);
        removeObject(smBrickWall4);
        BrickWall brickWall5 = new BrickWall();
        addObject(brickWall5,1179,100);
        removeObject(trapDoor);
        removeObject(brickWall5);
        BrickWall brickWall6 = new BrickWall();
        addObject(brickWall6,1195,99);
        removeObject(powerup);
        removeObject(powerup3);
        Powerup powerup4 = new Powerup();
        addObject(powerup4,1178,607);
        Powerup powerup5 = new Powerup();
        addObject(powerup5,308,187);
        removeObject(powerup5);
        Powerup powerup6 = new Powerup();
        addObject(powerup6,305,189);
    }
    
    private void spawn()
    {
        if(Math.random() < 0.0025)
        {
            addObject(new Rock(GRAVITY), Greenfoot.getRandomNumber(1200), -30);
        }
    }
}
