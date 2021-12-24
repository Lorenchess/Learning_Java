package Composition_Example;

public class Michael {
    private String name;
    private Careers myCareer;

    public Michael(String name, Careers myCareer) {
        this.name = name;
        this.myCareer = myCareer;
    }

    public void iLike() {
        myCareer.medicine();
        myCareer.softWareEngineer();
        myCareer.mechanicEngineer();
    }
}
