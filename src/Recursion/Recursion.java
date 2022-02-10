package Recursion;

public class Recursion {
    public static void main(String[] args) {
        printNumber(4);
        System.out.println(allDollars("hello")); //h$e$l$l$0
        System.out.println(allDollarsRecursive("ramon")); //r$a$m$o$n
    }

    public static int printNumber(int num) {
        if (num == 0) return 0;
        else System.out.println(num);
        return printNumber(num - 1);
    }

    public static String allDollars(String str) {
        char letter;
        String newWord = "";
      if (str == "") System.out.println("The string is empty");
      for (int i = 0; i < str.length(); i++) {
          letter = str.charAt(i);
          newWord += letter + "$";
      }
      return newWord;
    }

    public static String allDollarsRecursive(String str) {

        if (str.length() <= 1) return str; //base case

        return str.charAt(0) + "$" + allDollarsRecursive(str.substring(1)); //we need to substring(1) so it goes up
        // to the parameter 1 character less until reaches str.length() == 1 and breaks the recursion.

    }
}
