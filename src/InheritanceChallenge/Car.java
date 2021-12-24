package InheritanceChallenge;

public class Car extends Vehicle{
    private int weals;
    private int doors;
    private int amountOfPassengers;

    public Car(String color, boolean isAircraft, boolean isCargo, boolean transportPeople, boolean isRail, boolean isWatercraft, String energyType) {
        super(color, isAircraft, isCargo, transportPeople, isRail, isWatercraft, energyType);
        this.weals = weals;
        this.doors = doors;
        this.amountOfPassengers = amountOfPassengers;
    }

    public int getWeals() {
        return weals;
    }

    public void setWeals(int weals) {
        this.weals = weals;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getAmountOfPassengers() {
        return amountOfPassengers;
    }

    public void setAmountOfPassengers(int amountOfPassengers) {
        this.amountOfPassengers = amountOfPassengers;
    }
}
