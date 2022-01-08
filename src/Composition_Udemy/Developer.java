package Composition_Udemy;

public class Developer extends Person implements Software_Eng {
    public Developer(String fullName, int age, String address) {
        super(fullName, age, address);
    }

    @Override
    public void create() {
        System.out.println("I create software...");
    }
}
