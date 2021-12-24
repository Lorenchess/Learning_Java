package CollectionsPractice;

public class Vehicle {
    private String make;
    private String model;
    private int year;
    private int price;
    boolean fourWDrive;

    public Vehicle(String make, String model, int year, int price, boolean fourWDrive) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.fourWDrive = fourWDrive;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public boolean isFourWDrive() {
        return fourWDrive;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", fourWDrive=" + fourWDrive +
                '}';
    }
}
