package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        String[] words = new String[] {"hello", "program", "chess"};

        List<String> myList = new ArrayList<>(Arrays.asList(words));


        int[] numbers = {1, 2, 3, 4, 5};

        /*
        the way to convert an array-int to ArrayList-Integers
        */
        List<Integer> numberList = new ArrayList<>(numbers.length); //

        //populate the ArrayList
        for (int i : numbers) {
            numberList.add(i);
        }
        //looping over
        for (int i = 0; i < numberList.size(); i++) {
            System.out.print(numberList.get(i));
        }

        System.out.println(searchList(numberList, 5));

        System.out.println(search(numbers, 5));

        System.out.println("---------------------");

        int[] test = new int[] {1,2,3,4,5,6};

        System.out.println(binarySearch(test,5));

    }

    public static int binarySearch(int[] nums, int target) {

            int pivot, left = 0, right = nums.length - 1;
            pivot = left + (right - left) / 2;
            while (left <= right) {
                if (nums[pivot] == target) return pivot;
                if (target < nums[pivot]) right = pivot - 1;
                else left = pivot + 1;
            }
                return left;
        }

    public static int searchList(List<Integer>numberList, int target) {
        System.out.println(numberList);
        return numberList.indexOf(target); //indexOf only for Lists or String but does not work with int. Extra library
    }

    public static int search(int[] nums, int target) {
        int ret = -1;
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                ret = i;
                break; //to optimize a bit more
            }
        }
        return ret;
    }
}
