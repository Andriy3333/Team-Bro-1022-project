import java.util.concurrent.ThreadLocalRandom;

public class GuessTheNumber {
    private int randomNumber;
    private int lives;
    private int guessed;

    public int getRandomNumber(int min, int max){
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public int getEasyNumber(){
        randomNumber = getRandomNumber(0, 10);
        lives = 8;
        guessed = 0;
        return randomNumber;
    }

    public int getMediumNumber(){
        randomNumber = getRandomNumber(0,30);
        lives = 5;
        guessed = 0;
        return randomNumber;
    }

    public int getHardNumber(){
        randomNumber = getRandomNumber(0, 100);
        lives = 3;
        guessed = 0;
        return randomNumber;
    }

    public boolean checkGuess(int guess){
         if(guess == randomNumber){
             guessed++;
             return true;
         }
         else{
             lives--;
             return false;
         }
    }
}
