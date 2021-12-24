package SumFirstAndLastDigit;

public class Main {
    public static void main(String[] args) {
        sumFirstAndLastDigit(125);
    }
    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        }else {
            int firstDigit = 0;
            int lastDigit = 0;
        /*Below is the way to calculate the
        Last Digit of a Number*/
            lastDigit = number % 10;

        /*Below is the way to calculate the
        First Digit of a Number*/
            while(number != 0)
            {
                firstDigit = number % 10;
                number = number / 10;
            }
            int result = firstDigit + lastDigit;
            System.out.println(result);
            return result;
        }

    }
}
