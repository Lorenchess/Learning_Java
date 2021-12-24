package AbstractClasses;

//The class Bird needs to be abstract to have an abstract method called fly() because no all birds can fly...
//An abstract class is meant to be a parent class, it cannot be instantiated only extended

public abstract class Bird extends Animal implements CanFly{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in and breathe out ...");
    }
    //Abstract method, any class that inherits from the Animal class needs to have this method implemented...
    public abstract void swim();

    @Override
    public void fly() {
        System.out.println(getName() + " is flapping its wins");
    }
}
