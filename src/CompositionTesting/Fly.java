package CompositionTesting;

//Fly class concrete implementation that implements the interface
public class Fly implements DuckBehavior{
    @Override
    public void fly() {
        System.out.println("The duck fly height...");
    }
}
