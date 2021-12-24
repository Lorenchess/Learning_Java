package ReverseArrayChallenge;

import java.util.*;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
       Object[] myIntegersArray = getIntegers(4);
        reverse(myIntegersArray);
    }
    private static Object[] getIntegers(int count){
        System.out.println("Enter " + count + " integers \n");
        Object[] values = new Object[count];
        for(int i=0; i<values.length;i++){
            values[i] = scanner.nextInt();
        }
        System.out.println("The array created is " + Arrays.toString(values));
        return values;
    }
    private static void reverse(Object[]arr){
        List<Object> myList = Arrays.asList(arr);
        Collections.reverse(myList);
        System.out.println("The reverse array is " + myList);
    }
}
