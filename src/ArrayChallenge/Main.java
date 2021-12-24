package ArrayChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        sortIntegers(printArray(getIntegers(5)));
    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values \r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++){ //thanks to new int[number] we have a length value of number
            values[i] = scanner.nextInt(); //storing each iteration the value typed to the values array.
        }
       return values;
    }
    public static int[] printArray(int[] values){
        for(int i = 0; i < values.length; i++)
        System.out.println("The array elements are " + values[i]);
        return values;
    }
    public static void sortIntegers(int[] arr){
        Arrays.sort(arr);
        System.out.println("The sorted array is " + Arrays.toString(arr));;
    }
}
