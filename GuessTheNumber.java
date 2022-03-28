package com.example.project1022mac;
import java.util.concurrent.ThreadLocalRandom;

public class GuessTheNumber {
    private String username;
    private String points;
    private int randomNumber;
    private int lives;
    private int guessed;
    final static private int lowerLimit = 0;
    private int upperLimit;

    public int getRandomNumber(int min, int max){
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public int getUpperLimit(){
        return upperLimit;
    }
    public void startEasyDifficulty(){
        randomNumber = getRandomNumber(0, 10);
        lives = 10;
        guessed = 0;
        upperLimit = 10;
    }

    public void  startMediumDifficulty(){
        randomNumber = getRandomNumber(0,30);
        lives = 5;
        guessed = 0;
        upperLimit = 30;
    }

    public void startHardDifficulty(){
        randomNumber = getRandomNumber(0, 100);
        lives = 3;
        guessed = 0;
        upperLimit = 100;
    }

    public int getChosenNumber(){
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

    public String higherOrLower(int guess){
        if(getChosenNumber() > guess){
            return  "Higher";
        }
        else{
            return "Lower";
        }
    }
}