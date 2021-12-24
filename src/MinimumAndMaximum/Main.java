package MinimumAndMaximum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean first = true;

        while(true){
            System.out.println("Enter a number:");
            boolean hasInt = scanner.hasNextInt();
            if(hasInt){
                int number = scanner.nextInt();
                if(number > max){
                    max = number;
                }
                if(number < max){
                    min = number;
                }
                System.out.println("Maximum value is " + max + " and Minimum value is " + min);

            }
            else{
                System.out.println("Exiting the loop");
                break;
            }
            scanner.nextLine();
        }
       scanner.close();
    }
}
