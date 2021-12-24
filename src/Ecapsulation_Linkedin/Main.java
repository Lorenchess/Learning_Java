package Ecapsulation_Linkedin;

//Encapsulation: Binds state and behavior together into a single unit. Combine/wrap data and code action on that data
// into a single unit. Java classes allow us to bind together data and related functionality.
//Benefits of encapsulation: Prevent classes from becoming tightly couple, so we can modify the inner workings of one
// class without affecting the rest of the program. Like replacing a piece of the car that is not functioning without
// affecting/or need it to replace the entire car, but this only happens if we have a clear interface between a given
// class and the rest of the program by using public methods. We need to make our class attributes hidden from
// the other classes (private-access modifiers) and use some public methods to provide some access to the exterior
// classes to those
// hidden attributes/state/data, without making then heavily depending on each other. This is what we call a clear
// interface...Achieving this our code becomes clear and more secure(less likely for an attribute to be overwritten
// with an invalid or null value unexpectedly), and if changes then we do less work on refactoring the code.


public class Main {
    public static void main(String[] args) {
        /*String name = "Isandra";
        var total = name.length(); //.length() Method is in the String build in Java class.
        System.out.println(total); //7 */

        //Bank Account Challenge

        BankAccount owner1 = new BankAccount("Ramon Lorente", 40000);
        owner1.getBalance();
        owner1.deposit(500);
        System.out.println(owner1.getBalance());
        owner1.withdraw(50000);
        owner1.withdraw(500);
        owner1.getBalance();
        owner1.withdraw(40000);
        owner1.deposit(100000);




    }
}
