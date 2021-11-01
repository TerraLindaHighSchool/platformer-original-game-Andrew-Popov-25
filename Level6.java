import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level6 extends World
{
    private final float GRAVITY = 0.0467f;
    private final int SPEED = 3;
    private final float JUMP_FORCE = 5.6f;
    private final int MAX_HEALTH = 3;
    private final int MAX_POWERUP = 3;
    private final Class NEXT_LEVEL = Level7.class;
    private final GreenfootSound MUSIC = new GreenfootSound("Glitchy Music.mp3");
    //free to use song: https://www.youtube.com/watch?v=yQnkQpLS5o0
    
    
    /**
     * Constructor for objects of class BrickWorld.
     * 
     */
    public Level6()
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
        addObject(new SmBrickWall5(), 1140, 100);
        addObject(new SmBrickWall5(), 600, 400);
        platformMaker();
    }
    
    private void spawn()
    {
        if(Math.random() < 0.0025)
        {
            addObject(new Rock3(GRAVITY), Greenfoot.getRandomNumber(1200), -30);
        }
    }
    
    private void platformMaker()
    {
        for(int i = 0; i <= 4; i++)
        {
            int[] upperX = {1200, 700, 900, 1000, 400, 200};
            int[] lowerX = {1000, 500, 700, 800, 200, 0};
            int[] upperY = {700, 520, 360, 280, 125};
            int[] lowerY = {640, 480, 320, 268, 100};
            int r = Greenfoot.getRandomNumber(5);
            int x = (int) (Math.random() * (upperX[r] - lowerX[r])) + lowerX[r];
            int y = (int) (Math.random() * (upperY[i] - lowerY[i])) + lowerY[i];
            addObject(new SmBrickWall5(), x, y);
        }
    }
}
