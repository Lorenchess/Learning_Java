package HashMaps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        //For a HashMap we need to define two data types, because Maps are represented as key value pairs. Like
        // object literals in JavaScript. HashMaps implements the Map interphase not the Collection Interphase.

        HashMap<String, String> dictionary = new HashMap<>();

        dictionary.put("Brave","ready to face and endure danger or pain.");
        dictionary.put("Brilliant","exceptionally clever or talented.");
        dictionary.put("Joy","a feeling of great pleasure and happiness.");
        dictionary.put("Confidence","the stage of feeling certain about the truth of something.");

        for (String word: dictionary.keySet()) {
            System.out.println(word + ": " + dictionary.get(word));

            //It prints the key and value stored in the HashMap but with no order. If we want order we need to use
            // LinkHashMap instead...
        }

        LinkedHashMap<String, Integer> numbers = new LinkedHashMap<>();
        numbers.put("One ", 1);
        numbers.put("Two ", 2);
        numbers.put("Three ", 3);
        numbers.put("Four ", 4);

        for (String number: numbers.keySet()) {
            System.out.println(number + " "+ numbers.get(number)); //using the numbers.get() will show the values...
        }
        //another way to print the key and value pair together we need to use the method entrySet()...
        for (Map.Entry<String, Integer> number : numbers.entrySet()) {
            System.out.println("Iteration using the Map.Entry... " + number);
        }

    ///The ThreeMap...sorts the keys alphabetically

        TreeMap<String,String> movies = new TreeMap<>();
        movies.put("Indiana Jones","very funny and entertaining movie.");
        movies.put("Star War","action movie, fiction.");
        movies.put("Titanic","interesting movie based on true history.");

        for (String movie: movies.keySet()) {
            System.out.println("TreeMap iteration... " + movie + ": " + movies.get(movie));
        }

    }

 //All this data types do not allow you to stored duplicated keys since it does not make sense to have two identical
    // keys ...

}
