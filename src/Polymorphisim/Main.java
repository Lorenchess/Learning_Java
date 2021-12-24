package Polymorphisim;
//The dictionary definition of polymorphism refers to a principle in biology in which an organism or species can have many different forms or stages. This principle can also be applied to object-oriented programming and languages like the Java language. Subclasses of a class can define their own unique behaviors and yet share some of the same functionality of the parent class.
//Polymorphism gives you unique functionality to the classes that extends other classes.

//SUPER class
class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "A shark eats a lot of fish";
    }
}

class IndependenceDay extends Movie{
    public IndependenceDay() {
        super("IndependenceDay");
    }

    @Override
    public String plot() {
        return "Aliens attend to take over planet";
    }
}

class MazeRunner extends Movie{
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Children escape a maze";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("StarWars");
    }

    @Override
    public String plot() {
        return "Imperial forces try to take over Universe";
    }
}

class Forgetable extends Movie{
    public Forgetable() {
        super("Forgetable");
    }

    //No plot here
}

public class Main {
    public static void main(String[] args) {
      for(int i = 1; i < 10; i++ ){
          Movie movie = randomMovie(); //We assign to the variable the return of the method call randomMovie() that
          // is the one that generates the random number from 1 to 5 and invokes the switch statement that creates a
          // new Movie in the fly.
          System.out.println("Movie # " + movie.getName() + "\n" + "Plot: " + movie.plot() + "\n"); //Then we use the
          // instance movie created in the randomMovie() and print into the console it name and plot. Each time we
          // are calling the same/similarity of methods (plot()) but each time the values obtained are different,
          // this is a case of Polymorphism by printing unique information.
      }
    }
    public static Movie randomMovie(){
        int randomNumber = (int)(Math.random() * 5 + 1);
        System.out.println("Random number generated was: " + randomNumber);
        switch(randomNumber){
            case 1 :
               return new Jaws();
            case 2 :
                return new IndependenceDay();
            case 3 :
                return new MazeRunner();
            case 4 :
                return new StarWars();
            case 5 :
                return new Forgetable();
        }
        return null;
    }
}
