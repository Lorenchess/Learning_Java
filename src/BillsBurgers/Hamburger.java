package BillsBurgers;

public class Hamburger {
    private String name;
    private String rollType;
    private String meat;
    private double price;
    private double lettuce;
    private double tomato;
    private double carrot;
    private double spinach;

    public Hamburger(String name, String rollType, String meat, double price) {
        this.name = name;
        this.rollType = rollType;
        this.meat = meat;
        this.price = price;

        this.lettuce = 0.20;
        this.tomato = 0.20;
        this.carrot = 0.20;
        this.spinach = 0.20;
    }



    public double getPrice() {
        double totalPrice = Math.round(price + lettuce + carrot + spinach);
        System.out.println("The base price for the" + name + " is $" + price + " and the additional items are " +
                "lettuce: " +
                "$" + getLettuce() + ", tomato: $" + getTomato() + ", carrot: $" + getCarrot() + ", spinach : $" + getSpinach() + ", to a total price of " + totalPrice);
        return totalPrice;
    }

    public double getLettuce() {
        return lettuce;
    }

    public double getTomato() {
        return tomato;
    }

    public double getCarrot() {
        return carrot;
    }

    public double getSpinach() {
        return spinach;
    }
}
