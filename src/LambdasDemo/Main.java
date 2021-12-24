package LambdasDemo;

import java.util.List;
import java.util.function.*;

//The Consumer function interface takes one parameter and do not return anything (void). The andThen() consumer
// chaining method is like the then() for asynchronous JavaScript at list it has a similar syntax

//The Lambda expression has to match the signature of the
// Consumer or Supplier interface ...see documentation

public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "c");
        Consumer<String> print = item -> System.out.print(item);
        Consumer<String> printUpperCase = item -> System.out.print(item.toUpperCase());

        //Now looping over the list by chaining the two Consumer interfaces methods

        list.forEach(print.andThen(printUpperCase)); //using the andThen() chaining method //aAbBcC

        /////////////////////////////////////
        ///The Supplier interface takes no parameters but returns a value

        Supplier<Double> getRandom = ()-> Math.random(); //The Lambda expression has to match the signature of the
        // Supplier function ...see documentation

        Double random = getRandom.get();
        System.out.println(random);

        /////////////////////////////////////
        ///The Function interface takes arguments(type and return type) and returns value

        //We call the function with the apply method...

        Function<String, Integer> map = (str) -> str.length(); //we defined the function, bellow we call it...
        Integer length = map.apply("Sky");
        var length1 = map.apply("Sky"); //we can use var as representation of the type of instance object
        System.out.println(length); //3
        System.out.println(length1);//3

        /////////////////////////////////////
        ///Composing functions...
        //"key:value"
        //first: "key=value"
        //second: {key=value}

        Function<String, String> replaceColon = str -> str.replace(":","=");
        Function<String, String> addBraces = str -> "{" + str + "}";

        //Declarative programming, we specify what needs to be done...
        var result = replaceColon
                           .andThen(addBraces)
                           .apply("key:value");

        result = addBraces.compose(replaceColon).apply("key:value");
        System.out.println(result);

        /////////////////////////////////////
        ///Predicate interface...we use it to filter data

        Predicate<String> isLongerThan5 = str -> str.length() > 5;
        var result1 = isLongerThan5.test("Sky");
        System.out.println(result1); //false

        //Combining Predicates
        Predicate<String> hasLeftBrace = str -> str.startsWith("{");
        Predicate<String> hasRightBrace = str -> str.endsWith("}");

        var result2 = hasLeftBrace.and(hasRightBrace).test("{key = value}");
        System.out.println(result2); //true;

        ///Binary Operator
        BinaryOperator<Integer> add = (a, b) -> a + b; //simple binary operator function
        Function<Integer, Integer> square = a -> a * a;

        var result3 = add.andThen(square).apply(2,4);
        System.out.println(result3); //36

        ///Unary Operator

        UnaryOperator<Integer> mySquare = n -> n * n;
        UnaryOperator<Integer> increment = n -> n + 1;

        var result4 = increment.andThen(mySquare).apply(1);
        System.out.println(result4); //4




    }

}
