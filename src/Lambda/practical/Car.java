package Lambda.practical;

public class Car {
    private String make, model, color;
    private int price;

    public Car(String make, String model, String color, int price) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public void printCar(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
