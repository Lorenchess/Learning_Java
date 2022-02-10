package StringPractice;

public class Main {
    public static void main(String[] args) {

       String str = "Hello there this is a test.", sub = "This is another test, category: chess, the net category: " +
               "programming, the next category: java, and this is the end.";

       String word = "lorente", name = "nomar";

        printNoE(str);
        printReverse(word);
        printReverse(name);
        printReverse(str);
        printSub(sub);
    }

    public static String printNoE(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'e') {
                result = result + str.charAt(i);
            }
        }
        System.out.println(result);
        return result;
    }

    public static String printReverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result = result + str.charAt(i);
        }
        System.out.println(result);
        return result;
    }

    public static String printSub(String str) {
        String category = "";
        int catInx = 0;
        int start = 0;
        int end = 0;
        int i = 0;
        while (true) {
            catInx = str.indexOf("category:", i);
            if (catInx == -1) break;
            start = catInx + 10;
            end = str.indexOf(",", start);
            category = str.substring(start, end);
            System.out.println(category);
            i = end + 1;
        }
        return category;

    }
}

























