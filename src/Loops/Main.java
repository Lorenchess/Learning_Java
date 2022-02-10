package Loops;

public class Main {
    public static void main(String[] args) {
      String str = "We have a large inventory of things, the category: apperal and the slightly more in demand " +
              "category: makeup along with the category: furniture and ...";

        printCategories(str);
    }

    public static void printCategories(String str) {
        int i = 0;
        while (true) {
           int catIndex = str.indexOf("category:", i);
           if(catIndex == -1) break;
           int start = catIndex + 10; //start index of the word we want to extract
           int end =  str.indexOf(" ", start); //end index of the word we want to extract

           String category = str.substring(start, end); //extracting the word
            System.out.println(category);
            i = end + 1; //since not found it prints -1 breaking out of the loop
        }

    }

//    public static void printCategories(String str) {
//        Boolean keepRunning = true;
//        while (keepRunning) {
//            int categoryIndex = str.indexOf("category:");
//            int start = str.indexOf(categoryIndex + 10);
//            int end = str.indexOf(" ", start);
//            String category = str.substring(start, end);
//            System.out.println(category);
//            keepRunning = false;
//        }
//    }
}
