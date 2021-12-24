package LambdasDemo;

public class LambdaDemo {
    public static void show(){
        //Lambda expression that represents the single method of the functional interface...We do not need to put the
        // type because the Java compiler will check the type from the functional interface
     greet(message -> System.out.println("Hello world"));

     //Method references are when we are passing parameters to an existing method. In this case we are passing the
        // parameter to greet(), the parameter is an instance of the Printer interface. We can use a different syntax
        // to do this action...
        greet(System.out :: println); //Method(Class/Object::method)
    };
    public static void greet(Printer printer){
      printer.print("Hello world");
    }
    //the greet method takes an instance of the Printer as parameter
}
