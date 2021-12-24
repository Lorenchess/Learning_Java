package PolymorphismChallenge;

public class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;
    private int speed;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.speed = 0;
    }

    public void startEngine(){
        this.engine = true;
        System.out.println("The " + name + " engine started running...");
    }

    public int accelerate(int velocity){
        if(speed < 120){
            int currentSpeed = speed += velocity;
            System.out.println("The " + name + " has a current speed of: " + currentSpeed);
            return currentSpeed;
        } else {
            System.out.println("The " + name + " has a current speed of: " + speed);
            return speed = 120;
        }

    }

    public int brake(int reduceVelocity){
        int currentSpeed = speed - reduceVelocity;
        System.out.println("The " + name + " is reducing its velocity at: " + currentSpeed);
        return currentSpeed;
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public int getSpeed() {
        return speed;
    }
}
