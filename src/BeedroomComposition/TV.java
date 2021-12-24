package BeedroomComposition;

public class TV {
    private String model;
    private Boolean isOn;

    public TV(String model, Boolean isOn) {
        this.model = model;
        this.isOn = isOn;
    }

    public boolean turnOnTheTV(){
        System.out.println("The TV is on");
        return isOn;
    }

    public String getModel() {
        return model;
    }

    public Boolean getOn() {
        return isOn;
    }
}
