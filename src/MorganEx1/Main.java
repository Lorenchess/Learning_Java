package MorganEx1;

import java.util.Scanner;

public class Main {
    static String word = "";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";
        for (int i = 0; i < 3; i++) {
            System.out.println("Type a word \n");
            input = sc.nextLine();
            printCamelCase(input);
        }
    }

    public static String printCamelCase(String str) {
        String upper = "", lower = "";

        upper =  str.toUpperCase();
        char firstLetter = upper.charAt(0);
        lower = upper.substring(1).toLowerCase();
        word = word + firstLetter + lower;

        System.out.println(word);
        return word;
    }



}
