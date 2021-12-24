package Zoo;

public class Penguin extends Animal implements Fly{
    public Penguin(String name, int age, String gender) {
        super(name, age, gender);
    }


    @Override
    public void flying() {
        System.out.println("A penguin cannot fly...");
    }
}
