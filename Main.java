public class Main 
{
    public static void main(String[] args) 
    {
        Game game = new Game();
        game.play();
        System.out.println("Score from single play: " + game.getScore());
        int highestScore = game.playManyTimes(5);
        System.out.println("Highest score from 5 plays: " + highestScore);
    }
}