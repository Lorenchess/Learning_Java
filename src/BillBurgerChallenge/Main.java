package BillBurgerChallenge;

public class Main {
    public static void main(String[] args) {
     Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56,"White" );
     double price = hamburger.itemizeHamburger();
     hamburger.addHamburgerAddition1("lettuce",0.75);
     hamburger.addHamburgerAddition2("Tomato", 0.27);
     hamburger.addHamburgerAddition3("Cheese", 1.12);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());




    }
}
