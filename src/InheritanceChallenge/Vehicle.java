package InheritanceChallenge;

public class Vehicle {
    private String color;
    private boolean isAircraft;
    private boolean isCargo;
    private boolean transportPeople;
    private boolean isRail;
    private boolean isWatercraft;
    private String energyType;

    public Vehicle(String color, boolean isAircraft, boolean isCargo, boolean transportPeople, boolean isRail, boolean isWatercraft, String energyType) {
        this.color = color;
        this.isAircraft = isAircraft;
        this.isCargo = isCargo;
        this.transportPeople = transportPeople;
        this.isRail = isRail;
        this.isWatercraft = isWatercraft;
        this.energyType = energyType;
    }

    public void accelerate(int speed){
        System.out.println("The vehicle moves at " + speed);
    }
    public void stop(int decreaseSpeed){

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isAircraft() {
        return isAircraft;
    }

    public void setAircraft(boolean aircraft) {
        isAircraft = aircraft;
    }

    public boolean isCargo() {
        return isCargo;
    }

    public void setCargo(boolean cargo) {
        isCargo = cargo;
    }

    public boolean isTransportPeople() {
        return transportPeople;
    }

    public void setTransportPeople(boolean transportPeople) {
        this.transportPeople = transportPeople;
    }

    public boolean isRail() {
        return isRail;
    }

    public void setRail(boolean rail) {
        isRail = rail;
    }

    public boolean isWatercraft() {
        return isWatercraft;
    }

    public void setWatercraft(boolean watercraft) {
        isWatercraft = watercraft;
    }

    public String getEnergyType() {
        return energyType;
    }

    public void setEnergyType(String energyType) {
        this.energyType = energyType;
    }
}
