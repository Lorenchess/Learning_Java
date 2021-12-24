package Zoo;

public class Bird extends Animal {

    public Bird(String name, int age, String gender) {
        super(name, age, gender);
    }


    @Override
    public void eat() {
        System.out.println( "Bird picks picks...while eating.");
    }


}
