package Composition_Example;

public class Papi implements Careers{
    @Override
    public void softWareEngineer() {
        System.out.println("I love programming!!");
    }

    @Override
    public void medicine() {
        System.out.println("Medicine? I am not good at it");
    }

    @Override
    public void mechanicEngineer() {
        System.out.println("Building stuff is interesting");
    }
}
