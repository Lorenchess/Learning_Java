package Inheritance_Linkedin;

public class Employee {
    private String name;
    protected double salary; //important to use protected as access modifier to be able to use/see it in the other
    // subclasses like in this case in Analyst class.
    private int age;

    public Employee(String name, double salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getSalary() {
        return this.salary;
    }

    public void raiseSalary() {
        this.salary = this.salary * 1.2;
    }
}
