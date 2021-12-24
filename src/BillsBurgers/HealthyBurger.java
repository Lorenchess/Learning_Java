package BillsBurgers;

public class HealthyBurger extends Hamburger{
    private String name;
    private double lettuce;
    private double tomato;

    private double chicken;

    public HealthyBurger(String name, String rollType, String meat, double price, double chicken) {
        super(name, rollType, meat, price);
        this.name = name;
        this.lettuce = 0.20;
        this.tomato = 0.20;
        this.chicken = chicken;
    }


    public void setName(String name) {
        this.name = name;
    }


    @Override
    public double getLettuce() {
        return lettuce;
    }

    @Override
    public double getTomato() {
        return tomato;
    }

    public double getChicken() {
        return chicken;
    }

    @Override
    public double getPrice() {
        double totalPrice =  lettuce + tomato + chicken;
        System.out.println("The base price for the " + name + " is " + "" + " and the additional " +
                "items" +
                " are lettuce: " +
                "$" + getLettuce() + ", tomato: $" + getTomato() +  ", to a total price of: $" + totalPrice);
        return totalPrice;
    }
}
