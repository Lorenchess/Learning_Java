package AbstractClasses;

public class Parrot extends Bird {
    public Parrot(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("Ups...I cannot swim");
    }
}
