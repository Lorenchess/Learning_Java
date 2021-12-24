package CompositionTesting;

public class TestingDuck {
    public static void main(String[] args) {
      MigrationFly migrationFly = new MigrationFly(); //we need to instantiate the classes of course
      Fly fly = new Fly(); ////we need to instantiate the classes of course

        // Now we can instantiate our Duck class with the type of both classes: POLYMORPHISM in action...

      Duck duck = new Duck(fly);
      Duck duck1 = new Duck(migrationFly);

      //Now we can use our method in Duck class flying() but the result will depend on the class type we assign Duck

      duck.flying(); //The duck fly height...
      duck1.flying(); //The duck migrates to Europe!
    }
}
