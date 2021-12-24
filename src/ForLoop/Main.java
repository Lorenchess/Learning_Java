package ForLoop;

public class Main {
    public static void main(String[] args) {
        ForLoop.printCalculateInterest();
        ForLoop.printCalculateInterestBackwards();

        int count = 0;
        for (int i = 0; i < 100; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a Prime Number");
                if (count == 3) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
        System.out.println("**************************");
        //For loop challenge
        int countHere = 0;
        int sum = 0;

        for (int i = 1; i < 1000; i++) {
           if((i % 3 == 0) && (i % 5 == 0)) {
               countHere++;
               System.out.println("Found number " + i);
               sum += i;
               if (countHere == 5) {
                   System.out.println("Exiting the loop");
                   break;
               }
           }
        }
        System.out.println("Sum = " + sum);

    }

    public static boolean isPrime(int number) {
        if (number == 1 || number <= 0) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
