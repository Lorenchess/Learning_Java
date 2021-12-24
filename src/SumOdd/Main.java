package SumOdd;

public class Main {
    public static void main(String[] args) {
        sumOdd(1,10);

    }
    public static boolean isOdd(int number){
        if(number < 0){
            return false;
        }
        else if(number % 2 != 0){
            return true;
        }
        return false;
    }

    public static int sumOdd(int start, int end) {
        if (start <= end && start > 0 && end > 0) {
            int sum = 0;
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    System.out.println("The number is " + i);
                    sum += i;
                }
            }
            System.out.println("The sum is " + sum);
            return sum;
        }
        return -1;
    }
}
