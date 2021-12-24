package CarDealership;

public class Car {
    private String name;
    private int year;
    private String model;
    private double value;

    public Car(String name, int year, String model, double value) {
        this.name = name;
        this.year = year;
        this.model = model;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
