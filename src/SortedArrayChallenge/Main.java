package SortedArrayChallenge;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
     int[] myArray = getIntegers(5);
     printArray(sortedArray(myArray, myArray.length));

    }
    public static int[] getIntegers(int number){
        System.out.println("Type " + number + " integers.");
        int[] arrayOfIntegers = new int[number]; //creating the new array with a total of default values/space: 'number'
        for(int i = 0; i < arrayOfIntegers.length; i++){
           arrayOfIntegers[i] = scanner.nextInt(); //assigning the scanner to the new array each time for iteration
        }
        return arrayOfIntegers;
    }
    public static void printArray(int[]arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println("Element " + i + " contents " + arr[i]);
        }
    }
    public static int[] sortedArray(int[]arr, int n){
        Arrays.sort(arr); //sorting by default will be ascending
        int i, t;
        for (i = 0; i < n / 2; i++) { //the next process is to reverse the array to make it sort descending ...
            t = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = t;
            //This code is not easy to read by creating a List of Object array we can use the method
            // Collections.reverse() see example ReverseArrayChallenge
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
