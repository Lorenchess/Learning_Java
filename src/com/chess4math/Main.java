package com.chess4math;

public class Main {

    public static void main(String[] args) {
       int score = 800;
       int levelCompleted = 5;
       int bonus = 100;
       boolean isGameOver = true;

       if(isGameOver){
           int finalScore = score + (levelCompleted * bonus);
           System.out.println("Your final score is: " + finalScore + ".");
       }
    }
}
