package PolymorphismChallenge;

public class Ferrari extends Car{
    private int speed;
    private String name;

    public Ferrari(String name, int cylinders) {
        super(name, cylinders);
        this.speed = 0;
        this.name = name;
    }

    @Override
    public int accelerate(int velocity) {
        int currentSpeed = speed += velocity;
        System.out.println("The" + name + " has a current speed: " + currentSpeed);
        return currentSpeed;
    }
}
