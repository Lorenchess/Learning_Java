package MethodOverloading;

public class MethodOverloading {
    public static int myOverloadMethod(int number1, int number2){
        int sum = number1 + number2;
        System.out.println("Total sum is " + sum);
        return sum;
    }
    public static int myOverloadMethod(int number1, int number2, int number3){
        int sum = number1 + number2 + number3;
        System.out.println("Total sum is " + sum);
        return sum;
    }
    public static int myOverloadMethod(int number1, int number2, int number3, int number4){
        int sum = number1 + number2 + number3 + number4;
        System.out.println("Total sum is " + sum);
        return sum;
    }
}
