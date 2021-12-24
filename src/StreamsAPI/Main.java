package StreamsAPI;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        IntStream.range(1, 10) ///source
                 .forEach((x) -> System.out.print(x)); //terminal operation ...//123456789
        System.out.println();

        //Integer Stream with Skip
        IntStream.range(1,10) ///source
                .skip(5) //intermedia operation...skip 5 elements of the stream
                .forEach(x -> System.out.print(x)); //terminal operation ...// 6789
        System.out.println();

        //Integer Stream with sum

        int val = IntStream.range(1,5) ///source
                .sum(); //terminal operation
        System.out.println(val); //10














    }
}
