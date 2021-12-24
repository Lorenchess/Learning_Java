package Inheritance;

public class Main {
    public static void main(String[] args) {
       Animal animal = new Animal("Animal", 1,1,5,5); //animal is a reference/instance of Animal class

       Dog dog = new Dog("Duke", 8, 20, 2, 4, 1, 20, "German Cheaper");
       Fish fish = new Fish("Nemo",1,5,20,2,2);

       //dog && fish are references/instances of Dog && Fish classes respectively.

       dog.eat();
       dog.walk();
       dog.run();

       fish.swim(3);

    }
}
