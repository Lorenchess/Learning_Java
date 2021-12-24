package PolymorphismChallenge;

public class Main {
    public static void main(String[] args) {
        Car ferrari = new Car("Ferrari",4);
        Car hyundai = new Car("Hyundai", 4);

        ferrari.accelerate(50);
        ferrari.accelerate(50);
        ferrari.accelerate(50);

        Ferrari myFerrari = new Ferrari("Ramon's Ferrari",8);
        myFerrari.accelerate(50);
        myFerrari.accelerate(50);
        myFerrari.accelerate(50);
        myFerrari.brake(20);


    }
}
