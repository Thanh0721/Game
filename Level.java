import java.util.Random;

public class Level 
{
    private boolean goalReached;
    private int points;

    public void playLevel() 
    {
        Random random = new Random();
        goalReached = random.nextBoolean();
        points = goalReached ? random.nextInt(100) + 1 : 0;
    }

    public boolean goalReached() 
    {
        return goalReached;
    }

    public int getPoints() 
    {
        return points;
    }
}