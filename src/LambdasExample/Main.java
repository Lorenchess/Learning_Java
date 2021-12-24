package LambdasExample;

import LambdasDemo.CalculateInterface;
import LambdasDemo.MyGenericInterface;
import LambdasDemo.StringWorker;

public class Main {
    public static void main(String[] args) {
       Human tom = new Human();
       walker(tom);

       Robot wale = new Robot();
       walker(wale);

       //Both classes using the same method walker we called it Polymorphism

       //Now using Lambda expression ...It has to have the type as Functional Interface, an interface with only one
        // abstract method...Lambdas are blocks of code that we used to implement methods defined by Functional
        // interfaces. Lambda allows separation of behavior from an object.

       walker(()-> System.out.println("Custom object walking..."));

//       ALambdaInterface aBlockOfCode = () -> {
//           System.out.println("I am walking too...");
//       };

        Walkable aBlockOfCode = () -> {
            System.out.println("I am walking too...");
        };

        walker(aBlockOfCode);

        sayHello(()-> System.out.println("Hello there..."));

//      SumInterface sumVar = (a, b) -> a + b;
// The lambda expression signature has to match the Interface method. Implementing the Interface abstract method
        var total =  sum((a, b) -> a + b);
        var total1 = multiply((a, b) -> a * b);

        System.out.println(total); //6
        System.out.println(total1);//10

        CalculateInterface divide = (a, b) -> {
            if(a <= 0 || b <= 0){
                return 0;
            }
            else if (a >= b){
                return a / b;
            }
            else {
                return b / a;
            }
        };

        System.out.println(divide.compute(2,4)); //2
        System.out.println(divide.compute(20,2));//10
        System.out.println(divide.compute(0,4));//0
        System.out.println(divide.compute(10,-2));//0

        StringWorker reverse1 = (str) -> { //I do not need to specify the type because Java looks into the interface
            String result = "";
            for (int i = str.length()-1; i >= 0 ; i--) {
                result = result + str.charAt(i);
            }
            return result;
        };

        MyGenericInterface<String> reverse = (str) -> { //I need to specify the type <String> since it was Generic T
            String result = "";
            for (int i = str.length()-1; i >= 0 ; i--) {
               result = result + str.charAt(i);
            }
            return result;
        };

        System.out.println(reverse.work("nomar")); //ramon


        MyGenericInterface<Integer> factorial = number -> { //I could use the StringWorker reverse...
            int result = 1;
            for (int i = 1; i <= number ; i++) {
                result = i * result;
            }
            return result;
        };

        System.out.println(factorial.work(5)); //120

    }

    public static void walker(Walkable walkableEntity){
        walkableEntity.walk();
    }

    public static void sayHello(Greet greeting){
        greeting.greet();
    }

    public static int sum(CalculateInterface arguments){
        return arguments.compute(2, 4); //calling the interface abstract method and passing the arguments
    }

    public static int multiply(CalculateInterface args){
        return args.compute(2,5);
    }


}
