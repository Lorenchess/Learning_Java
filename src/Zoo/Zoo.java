package Zoo;

//The main method is also call the tester class...The tester class has only one job: to try out the methods and
// variables of your new object class type. The two uses of main: test your real class and launch your application.
//A real Java application is nothing but objects talking to other objects. In this case, talking means objects
// calling methods on one another.


public class Zoo {
    public static void main(String[] args) {

     //Creating instances of Object of the Type Animal. These instances are not the Object itself created by invoking
     // the "new" keyword on the Heap. These instances are references, hold a pointer to the Object/Animal on the
     // Heap. It holds the address of the Object in the Heap.

     Animal zebra = new Animal("Zebra",10,"male");
     Animal lion = new Animal("African Lion",20,"male");
     Animal bird = new Animal("Flamingo",5,"female");
     Animal fish = new Animal("Goldfish",1,"female");

     //Now we used to inherit methods of Animal eat() and sleep()...The methods are the primary way of communication
     // between Objects...The dot operator (.) gives you access to an object’s state and behavior (instance variables and methods).


     zebra.eat();
     lion.sleep();
     bird.eat();
     fish.eat();

     Penguin penguin1 = new Penguin("Polo penguin", 2, "female");
     penguin1.eat();
     penguin1.flying();


     Eagle eagle1 = new Eagle("US eagle",3,"male");
     eagle1.flying();
     eagle1.eat();
    }
}
