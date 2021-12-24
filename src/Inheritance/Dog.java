package Inheritance;

public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name,  int size, int weight, int eyes,int legs, int tail,int teeth,String coat ) {
        super(name, 1, 1, size, weight); //the super() call, used to constructor chaining, since it calls the parent
        // super class constructor. In this case calls the Animal class constructor. Must be the first statement in
        // the constructor...A constructor can't have both super() && this()...
        this.eyes = eyes;
        this.legs = legs;
        this.teeth = teeth;
        this.coat = coat;
    }
    private void chew(){ //private method bec we are only calling it inside Dog class.
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() { //method particular to the Animal super class overwritten by Dog class
        System.out.println("Dog.eat() called");
        chew(); //calling the private method
        super.eat(); // we use super.eat() bec we need to reference the super class (Animal) method, otherwise we are
        // going to create an infinite loop by calling the method eat() itself over and over.
    }

    public void walk(){
        System.out.println("Dog.walk() called. Dod is eating");
        move(5); //method particular to the Animal super class.
    }

    public void run(){
        System.out.println("Dog.run() called. Dog is running" );
        move(10); //method particular to the Animal super class.
    }
}
