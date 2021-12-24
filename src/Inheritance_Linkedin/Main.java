package Inheritance_Linkedin;

//Inheritance: allow us to organize code through class hierarchies. Classes that inherit attributes and behaviors
// from other classes. We have two main players, the Subclasses(the class that inherits properties also called child
// class) and the Superclass, that is the class that is inherited from and is also call parent class. Inherit help us
// to avoid duplicated code. Additions or modification in the Superclass will affect the subclasses. We call this
// relationship : Is-A Relationship.
//Other benefits are that common properties and functionality can be written in one class(Superclass) and other
// classes will inherit and add on unique functionality as well. Important that one parent class can have multiple
// subclasses but the subclasses can have only one superclass, although a superclass can have a parent class as well,
// Java supports multi level of inheritance. See the bellow example...
//Person: name
//Employee: Person + ID, salary attributes/behaviors
//Salesperson: Employee + commission attributes/behavior
//Analyst: Employee + bonus attributes/behavior

public class Main {
    public static void main(String[] args) {
        /*Stack<Character> charStack = new Stack<>();
        charStack.push('c');
        charStack.push('a');
        charStack.push('t');

        System.out.println(charStack.pop());
        System.out.println(charStack.pop());
        System.out.println(charStack.pop()); */

      //ModArrayList challenge

        ModArrayList<Integer> myMod = new ModArrayList<>();
        myMod.add(2);
        myMod.add(5);
        myMod.add(3);
        myMod.add(10);

        System.out.println(myMod.getUsingMod(1));
        System.out.println(myMod.getUsingMod(-2));
        System.out.println(myMod.getUsingMod(40));



    }
}
