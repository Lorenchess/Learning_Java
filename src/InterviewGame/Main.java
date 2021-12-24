package InterviewGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, stranger, what is your name? : ");
        boolean hasString = scanner.hasNext("[A-Za-z]*");

        if(hasString){
            String name = scanner.nextLine();
            System.out.println("Hi " + name + "! What year you were born?");
            boolean hasInt = scanner.hasNextInt();

            if(hasInt){
                int userBirthYear = scanner.nextInt();
                int userAge = age(userBirthYear);
                if(userAge >= 0 && userAge <= 100){
                   System.out.println("So you are " + userAge + " years old.");
                } else{
                    System.out.println("Mmmmm, that's impossible. You are provably not " + userAge);
                }
                System.out.println("Do you like to play chess?");
                scanner.nextLine();

                boolean hasStr = scanner.hasNext("[A-Za-z]*");
                if(hasStr){
                    String answer = scanner.nextLine();
                    String positive = "yes";
                    if(answer.equalsIgnoreCase(positive)){
                        System.out.println("Hey good choice! What is your rating? Give me a number...");

                        boolean hasNumber = scanner.hasNextInt();
                        if(hasNumber){
                           int elo = scanner.nextInt();
                           if(elo >= 1000 && elo <= 2000){
                               System.out.println("Ahhh, you are a beginner! Keep practicing...Bye");
                           } else if(elo > 2000 && elo < 2100){
                               System.out.println("Good candidate master, " + name + "!");
                           } else if(elo >= 2100 && elo < 2250){
                               System.out.println("Good job WF " + name);
                           } else if(elo >= 2250 && elo < 2300){
                               System.out.println("Ohhh you are a NM " + name);
                           } else if(elo >= 2300 && elo < 2400){
                               System.out.println("Ohhh you are a FM " + name);
                           } else if(elo >= 2400 && elo < 2500){
                               System.out.println("Ohhh you are a IM " + name);
                           } else if(elo >= 2500 && elo < 2830){
                               System.out.println("Ohhh you are a GM " + name);
                           } else {
                               System.out.println("Ohhh you are Magnus Carlsen");
                           }
                        } else{
                            System.out.println("I asked you for a number, bobo! Bye");
                        }
                    } else{
                        System.out.println("Alright, no everyone can be smart lol...Bye");
                    }
                }
                else{
                    System.out.println("Ok no nice...bye");
                }

            } else{
                System.out.println("Mmmmmm, you are not playing nice. Do you understand English? Bye");
            }
        }
        else{
            System.out.println("Mmmm, you don't understand English, do you? So, good bye");
        }

        scanner.close();
    }
   public static int age(int birthYear){

       final int userAge = 2021 - birthYear;
       return userAge;
   }
}
