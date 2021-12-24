package AbstractClasses;

public class Penguin extends Bird{
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("I cannot fly");
    }

    @Override
    public void swim() {
        System.out.println("I can swim!!!");
    }
}
