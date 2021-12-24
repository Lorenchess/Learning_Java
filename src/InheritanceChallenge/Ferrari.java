package InheritanceChallenge;

public class Ferrari extends Car{
    private String model;
    private String type;


    public Ferrari(String color, boolean isAircraft, boolean isCargo, boolean transportPeople, boolean isRail, boolean isWatercraft, String energyType) {
        super(color, isAircraft, isCargo, transportPeople, isRail, isWatercraft, energyType);
        this.model = model;
        this.type = type;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
