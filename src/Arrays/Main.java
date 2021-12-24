package Arrays;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int [] myIntArray = new int [15];
        myIntArray[5] = 50; //stores 50 in position 6.
        System.out.println(myIntArray[5]); //50

        int [] myIntArray2 = {1,2,3,4,5,6};
        System.out.println(myIntArray2);

        printArray(initializingArray(myIntArray));

       /////////////////////////////////////

       int[] myIntegers = getIntegers(5);
       for(int i=0; i<myIntegers.length; i++){
           System.out.println("Element " + i + ", typed value was "+ myIntegers[i]);
       }

        getAverage(getIntegers(5));

    }
    public static int [] getIntegers(int number){
        System.out.println("Enter " + number + " integer values. \r"); //\r to send the cursor to the line under the ?
        int[] userValues = new int[number]; //creating a new array of int
        for(int i = 0; i < userValues.length; i++){
           userValues[i] = scanner.nextInt(); //to loop each time to update with the numbers type the userValues array
        }
        return userValues;
    }

    public static double getAverage(int[] array){
        double sum = 0;
        double average = 0;
        for(double i =0; i < array.length; i++){
            average = (sum += array[(int) i]) / array.length;
        }
        System.out.println("The total average is: " + average);
        return average;
    }




    public static void printArray(int[] array){
        for(int i=0; i < array.length; i++){
            System.out.println("Element " + i + ", value is " + array[i] + ".");
        }
    }
    public static int[] initializingArray(int[] arr){
        for(int i=0; i < arr.length; i++){
            arr[i] = i * 10;
        }
        return arr;
    }

}
