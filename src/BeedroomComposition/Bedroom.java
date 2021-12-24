package BeedroomComposition;

public class Bedroom {
    private Walls walls;
    private Ceiling ceiling;
    private Door door;
    private TV tv;

    public Bedroom(Walls walls, Ceiling ceiling, Door door, TV tv) {
        this.walls = walls;
        this.ceiling = ceiling;
        this.door = door;
        this.tv = tv;
    }

    public boolean openDoor(){
        return door.isOpen();
    }

    public boolean powerOnTV(){
        return tv.turnOnTheTV();
    }
    public String paintingWalls(){
        return walls.paintWall();
    }

    private Walls getWalls() {
        return walls;
    }

    private Ceiling getCeiling() {
        return ceiling;
    }

    private Door getDoor() {
        return door;
    }

    private TV getTv() {
        return tv;
    }
}
