package CompositionChallenge;

public class Bedroom {
    private String name;
    private CompositionChallenge.Wall wall1;
    private CompositionChallenge.Wall wall2;
    private CompositionChallenge.Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;


    public Bedroom(String name, CompositionChallenge.Wall wall1, CompositionChallenge.Wall wall2, CompositionChallenge.Wall wall3, CompositionChallenge.Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public Lamp getLamp() {
        return lamp;
    }
    public void makeBed(){
        System.out.println("Bedroom -> Making bed");
        bed.make();
    }
}
