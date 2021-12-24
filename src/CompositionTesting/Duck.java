package CompositionTesting;

public class Duck {
    DuckBehavior duckBehavior; //We use "COMPOSITION" getting a variable type interface, our Duck has an Interface
    // type variable

    public Duck(DuckBehavior duckBehavior) {
        this.duckBehavior = duckBehavior;
    }
    //Our Duck class has it own Method...
    public void flying () {
        duckBehavior.fly(); //we use our abstract variable to get access to the interface methods...as well the
        // different implementation done in the concrete classes that implements the interface...
    }
}
