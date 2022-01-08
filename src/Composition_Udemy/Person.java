package Composition_Udemy;

public class Person {
    private String fullName;
    private int age;
    private String address;

    public Person(String fullName, int age, String address) {
        this.fullName = fullName;
        this.age = age;
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void eat () {
        System.out.println("Person is eating...");
    }

    public void sleep () {
        System.out.println("Person is sleeping...");
    }
}
