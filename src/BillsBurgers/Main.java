package BillsBurgers;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic hamburger","Italian bread","beef",16.00);

        hamburger.getPrice();

        HealthyBurger healthyBurger = new HealthyBurger("Healthy Burger","brown rye","beef",16.00,0.50);
        healthyBurger.getPrice();
    }
}
