package AbstractClasses;

public class Main {
    public static void main(String[] args) {
        //dog, parrot, penguin are variables instances of type Dog, Parrot, Penguin, that point to the Object
        // The objects are created when the Application runs

       Dog dog = new Dog("Duke");
       dog.breathe();
       dog.eat();

       Parrot parrot = new Parrot("American Parrot");

       parrot.breathe();
       parrot.eat();
       parrot.fly();
       parrot.swim();

        System.out.println("======================");

       Penguin penguin = new Penguin("North Polo Penguin");
       penguin.breathe();
       penguin.eat();
       penguin.fly();
       penguin.swim();

       CanFly flyingAnimal = new Parrot("Cuban Parrot");
       flyingAnimal.fly(); //only method available inherit by the type CanFly...and because the Parrot class
        // inherits from Bird class that implements the CanFly method fly()
       //CanFly flyingAnimal1 = new Bird() cannot instantiate an abstract class Bird is abstract
    }

}
