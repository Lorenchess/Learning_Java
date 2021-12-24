package MinimumElementArray;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        findMin(readIntegers(4));
    }
    private static int[] readIntegers(int count){
        System.out.println("Enter " + count + " integers \n");
        int[] values = new int[count];
        for(int i =0; i < values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }
    private static int findMin(int[]arr){
        int min = arr[0];
        for(int i : arr){
            if(i < min){
                min = i;
            }
        }
        System.out.println("The minimum value is " + min);
        return min;
    }
}
