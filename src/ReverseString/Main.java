package ReverseString;

public class Main {
    public static void main(String[] args) {
        System.out.println(reverse("nomar"));
    }

    public static String reverse(String str) {
        String word = "";
        for (int i = str.length() -1; i >= 0; i--) {
            word += str.charAt(i);
        }
        return word;
    }
}
