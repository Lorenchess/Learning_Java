package BillsBurgers;

public class DeluxBurger extends Hamburger{
    private double chips;
    private double drink;
    private double bacon;
    public DeluxBurger(String name, String rollType, String meat, double price, double chips, double drink, double bacon) {
        super(name, rollType, meat, price);
        this.chips = chips;
        this.drink = drink;
        this.bacon = bacon;
    }
}
