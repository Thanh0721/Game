public class Game 
{
    private Level levelOne;
    private Level levelTwo;
    private Level levelThree;
    private boolean bonusGame;

    public Game() 
    {
        levelOne = new Level();
        levelTwo = new Level();
        levelThree = new Level();
    }

    public boolean isBonus() 
    {
        return bonusGame;
    }

    public void play() 
    {
        levelOne.playLevel();
        levelTwo.playLevel();
        levelThree.playLevel();
        bonusGame = Math.random() > 0.7;
    }

    public int getScore() 
    {
        int score = 0;

        if (levelOne.goalReached()) 
        {
            score += levelOne.getPoints();

            if (levelTwo.goalReached()) 
            {
                score += levelTwo.getPoints();

                if (levelThree.goalReached()) 
                {
                    score += levelThree.getPoints();
                }
            }
        }

        if (isBonus()) 
        {
            score *= 3;
        }

        return score;
    }

    public int playManyTimes(int num) 
    {
        int highestScore = 0;

        for (int i = 0; i < num; i++) 
        {
            play();
            int currentScore = getScore();
            if (currentScore > highestScore) 
            {
                highestScore = currentScore;
            }
        }

        return highestScore;
    }
}