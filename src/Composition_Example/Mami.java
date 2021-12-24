package Composition_Example;

public class Mami implements Careers{
    @Override
    public void softWareEngineer() {
        System.out.println("I like medicine!!");
    }

    @Override
    public void medicine() {
        System.out.println("Developer? I am not good at it");
    }

    @Override
    public void mechanicEngineer() {
        System.out.println("I do not like buildings");
    }
}
