package CompositionTesting;

//Migration class concrete implementation that implements the interface
public class MigrationFly implements DuckBehavior{
    @Override
    public void fly() {
        System.out.println("The duck migrates to Europe!");
    }
}
