package Abstraction_Linkedin;

//Abstraction: in Software development we use abstraction to hide implementation complexity, generalizing the
// features of any system.
//Consider someone that wants to make coffee with a pod. The person knows that needs water, coffee and sugar, but it
// does not know how the pod is made or how it works internally to make our cup of coffee. Somebody else made the pod
// and hide those implementations details, so we just focus on what the pod needs to make the coffee. So we just
// needs a simple interface, provide the inputs, and we get the output.
//Java supports abstract classes and interfaces.

//An Abstract class is almost like a template class where some functionality is not implemented yet, so you cannot
// instantiate the abstract class but other classes can extend the abstract class and implement the appropriate
// functionality.

//An Interface is a set of method signatures for to-be-implemented functionality, like a specification for a set of
// behaviors without hte specification. An interface cannot be instantiated as well.

//It's a commune code pattern to create an interface with methods specifications and later create an abstract class
// that implements that interface with base implementation and some abstract methods and then create a concrete class
// that extends those abstract classes that implements the methods that were abstract in the abstract class.


import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
       DigitsOnlyFileReader digitsOnlyFileReader = new DigitsOnlyFileReader("message.txt");

        System.out.println(digitsOnlyFileReader.readFile());
        System.out.println(digitsOnlyFileReader.getPath());

    }
}
