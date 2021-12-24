package com.chess4math;

public class MethodChallenge {
    public static void main(String[] args) {
      int ramonFinalPosition = calculateHighScorePosition(50);
        int michaelFinalPosition = calculateHighScorePosition(1550);
        int isandraFinalPosition = calculateHighScorePosition(550);
        int dajiFinalPosition = calculateHighScorePosition(150);
      displayHighScorePosition("Ramon", ramonFinalPosition);
        displayHighScorePosition("Michael", michaelFinalPosition);
        displayHighScorePosition("Isandra", isandraFinalPosition);
        displayHighScorePosition("Daji", dajiFinalPosition);
    }
    public static int calculateHighScorePosition(int score){
        if(score >= 1000){
            return 1;
        } else if(score >= 500 && score < 1000){
            return 2;
        } else if(score >= 100 && score < 500){
            return 3;
        } else {
            return 4;
        }
    }

    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " managed to get to position " + position + " on the high score table.");
    }
}
