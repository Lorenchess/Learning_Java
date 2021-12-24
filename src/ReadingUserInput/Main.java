package ReadingUserInput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //The Scanner class that allows us to take "in" user's inputs.

        System.out.println("Enter your year of birth:"); //asking the user's year of birth

        boolean hasNextInt = scanner.hasNextInt(); //validating that the user enters an integer for the birth year

        if(hasNextInt){
            int yearOfBirth = scanner.nextInt(); //storing the user's input in the variable birthYear
            //After reading an input it must be a nextLine() without being store into a variable to retrieve the
            // users input and move on to the nextLine that in this case is the name of the user.
            scanner.nextLine(); //handles next line character

            System.out.println("Enter your name: ");
            boolean hasNextString = scanner.hasNext("[A-Za-z]*"); //validating users name

            if(hasNextString){
                String name = scanner.nextLine(); //storing the user's input in the variable name

                int age = 2021 - yearOfBirth; //calculation to get the user's age

                //Validating users age
                if(age >= 0 && age <= 100){
                    System.out.println("Your name is " + name + ", and you are " + age + " years old!");
                }else {
                    System.out.println("Invalid year of birth");
                }
            } else {
                System.out.println("Please enter a valid string name");
            }

        } else {
            System.out.println("Unable to parse year of birth.");
        }
        scanner.close();
        //If you do not close the Scanner then Java will not garbage collect the Scanner object, and you will have a
        // memory leak in your program: void close(): closes the Scanner and allows Java to reclaim the Scanner's
        // memory. You cannot re-use a Scanner, so you should get rid of it as soon as you exhaust its input.
    }
}
