package ReadingUserInputChallenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0; //variables we need
        int sum = 0;
        while(true){
            int userType = counter + 1; //instead of counter++ we do not add one to counter itself we use counter to sum
            // one each time so in the console is printed the next number for the user to type. If we use counter++
            // it will increase the counter itself, but eventually we need to increase the counter itself so on each
            // iteration will do it twice and that's not what we want. The value of variable order will be the one that
            // asks the user for the value it needs to type.

            System.out.println("Enter number # " + userType + ":"); //The instruction for the user that is generated
            // multiple times due the while loop and the userType variable.

            boolean isAnInt = scanner.hasNextInt(); //validating the user type
            if(isAnInt){
              int number = scanner.nextInt(); //storing the userType into a number variable
              counter++; //increasing the counter each iteration that will help us later to brake the loop
              sum += number; //adding each number together
              if(counter == 10){
                  break; //Exiting the loop thanks to variable count.
              }
            } else {
                System.out.println("Not a valid number");
            }
            scanner.nextLine(); //handle end of line (enter key) it could it being done inside the if statement after
            // the int number = scanner.nextInt()
        }
        System.out.println("The sum of all numbers is " + sum);
        scanner.close(); //important after we are done with the Scanner.
    }
}
