package Composition_Example;

public class Tio implements Careers{
    @Override
    public void softWareEngineer() {
        System.out.println("I do not like coding");
    }

    @Override
    public void medicine() {
        System.out.println("I do not like medicine");
    }

    @Override
    public void mechanicEngineer() {
        System.out.println("I love build stuff!!");
    }
}
