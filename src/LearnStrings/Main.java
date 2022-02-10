package LearnStrings;

public class Main {
    public static void main(String[] args) {
        String text = """
                    Hello world, this    is a text    
                          example  .
                """;
        System.out.println(strip(text));

        String text1 = "apple", text2 = "APPLE";
        compareToIgnoreCase(text1, text2);
    }
    public static String strip(String str) {
        return str.replace(" ", "");
    }

    public static int compareToIgnoreCase(String text1, String text2) {
        String text1Lower = text1.toLowerCase();
        String text2Lower = text2.toLowerCase();
        int result = text1Lower.compareTo(text2Lower);
        if (result >= 1) System.out.println(text1 + " comes alphabetically after " + text2);
        if (result < 0) System.out.println(text1 + " comes alphabetically before " + text2);
        if (result == 0) System.out.println(text1 + " is equally placed alphabetically respect to " + text2);
        return result;
    }
}
