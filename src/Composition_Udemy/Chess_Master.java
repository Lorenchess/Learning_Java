package Composition_Udemy;

public class Chess_Master extends Person implements Software_Eng{
    private Developer developer = new Developer("Ramon Lorente",36,"150 Main St, Pembroke Pines, Florida");
    public Chess_Master(String fullName, int age, String address) {
        super(fullName, age, address);
    }

    public void play () {
        System.out.println("I play chess...");
    }

    public void create() {
        developer.create();
    }
}
