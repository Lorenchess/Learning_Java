package OOP_Mosh;

//Encapsulation: Bundle the data/state and related methods/behavior that operate on the data in a single unit. One of
// the advantages of OOP is that we can reuse code. If we need in another application to do the same calculation we
// can just copy this class and pasted it, and it will work the same because it acts independently of other classes,
// we could also put it into a library to pass around.

public class Employee {
    private int baseSalary;
    private int hourlyRate;


    public Employee(int baseSalary, int hourlyRate) {
        this.baseSalary = baseSalary;
        this.hourlyRate = hourlyRate;
    }

    //As you see we do not need to pass parameters(baseSalary && hourlyRate) into this method since they are
    // encapsulated in this class.

    public int calculateWage(int extraHours){
        return baseSalary + (hourlyRate * extraHours);
    }
}
