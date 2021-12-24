package BeedroomComposition;

public class Walls {
    private String wallNorth;
    private String wallSouth;
    private String wallWest;
    private String wallEast;
    private String color;

    public Walls(String wallNorth, String wallSouth, String wallWest, String wallEast, String color) {
        this.wallNorth = wallNorth;
        this.wallSouth = wallSouth;
        this.wallWest = wallWest;
        this.wallEast = wallEast;
        this.color = color;
    }

    public String paintWall(){
        System.out.println("Painting the walls in color " + getColor());
        return color;
    }

    public String getWallNorth() {
        return wallNorth;
    }

    public String getWallSouth() {
        return wallSouth;
    }

    public String getWallWest() {
        return wallWest;
    }

    public String getWallEast() {
        return wallEast;
    }

    private String getColor() {
        return color;
    }
}
