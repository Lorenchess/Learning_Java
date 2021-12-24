package OOP_Linkedin;

public class Employee {
    private String name;
    private int age;
    private double salary;
    private Profession profession;
    private Location location;

    public Employee(String name, int age, double salary, Profession profession, Location location) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.location = location;
        this.profession = profession;
    }

    public double raiseSalary(double amount){
        return salary += amount;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public Location getLocation() {
        return location;
    }

    public Profession getProfession() {
        return profession;
    }
}
