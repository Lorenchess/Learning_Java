package Zoo;

//A class is not an object, but it's used to construct them. Classes are the blueprint for an object. It tells the JVM
// "how" to make the object of that particular "type."


public class Animal {
    //fields, instance variables, state. Things the object knows about itself...
    private String name;
    private int age;
    private String gender;

    //The constructor construct the instances object in the main method when the new keyword is invoked, and
    // initialized the fields for that particular instance.

    public Animal(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    //These are the behaviors/methods all instances of the Animal class will inherit

    public void eat(){
        System.out.println(name + " is eating...");
    }

    public void sleep(){
        System.out.println(name + " is sleeping...");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}
