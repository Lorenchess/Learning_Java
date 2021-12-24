package Zoo;

public class Eagle extends Bird implements Fly{
    private String name;

    public Eagle(String name, int age, String gender) {
        super(name, age, gender);
        this.name = name;
    }

    @Override
    public void flying() {
        System.out.println(name + " is flying...height");
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating...");
    }
}
