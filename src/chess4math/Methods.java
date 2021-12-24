package chess4math;

public class Methods {

    public static void main(String[] args) {
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        boolean isGameOver = true;

        int highScore = calculateScore(score,levelCompleted,bonus,isGameOver);
        System.out.println("Your final score is: " + highScore + "!");

        highScore = calculateScore(500,6,100,true);
        System.out.println("Your final score is: " + highScore + "!");
    }
    public static int calculateScore(int score,int levelCompleted,int bonus,boolean isGameOver){
        if(isGameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }

}
