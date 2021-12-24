package BeedroomComposition;

public class Door {
    private int numberOfDoors;
    private boolean isOpen;

    public Door(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public boolean isOpen() {
        System.out.println("Opening the door");
        return isOpen;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }
}
