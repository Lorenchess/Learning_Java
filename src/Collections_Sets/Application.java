package Collections_Sets;

import java.util.*;

public class Application {
    public static void main(String[] args) {

        HashSet<Employee> employees = new HashSet<>();

        employees.add(new Employee("Ramon", 200000,"Google"));
        employees.add(new Employee("Isa", 70000,"Davita"));
        employees.add(new Employee("Mike", 250000,"Google"));



        HashSet<Integer> values = new HashSet<>();

        values.add(12);
        values.add(20);
        values.add(120);
        values.add(11);
        values.add(12);
        values.add(30);
        values.add(25);

        for (Integer value: values) {
            System.out.println(value);
        }
        //After the print we can see that the value repeated 12 was removed, only one 12 stayed
        // and there is no order in the print...all it cares is about "unique values" for keeping order we need to 
        // use the LinkedHashSet data type

        LinkedHashSet<String> animals = new LinkedHashSet<>();
        
        animals.add("Lion");
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Fish");
        animals.add("Koala");
        animals.add("Piton");


        ///Now using the class People
        HashSet<People> people = new HashSet<>();

        people.add( new People("Ramon", 36));

        People person1 = new People("Isa", 41);
        People person2 = new People("Isa", 41);

        people.add(person1);
        people.add(person2);

        printSets(people);
        printSets(animals);

        //It prints the repeated Isa person because it recognizes both objects as no uniques.
        System.out.println(person1.equals(person2)); //false

        //So we need to generate a new equals() and hashCode()
        // the equals' method will evaluate field by field to compare both objects, in that case it will be
        // true and the HashSet will print only one value for the Isa object.
        System.out.println(person1.equals(person2));//true
        //People{name='Isa', age=41}
        //People{name='Ramon', age=36}
        //Mainly the HashSet operation fails at first because it compares the hash code of both objects, and they will
        // be different so by overwriting the hasCode() method we will secure that both hash codes will be identical
        // so the objects will be equals and the HashSet will operate as expected.

        //Example of converting from one collection to another...
        List<String> newArrList = new ArrayList<>(animals); //just specify in the constructor which one to convert

        for (String newArr: newArrList) {
            System.out.println("Converting from LinkedHashSet to ArrayList: " + newArr);
        }

        //SORTING() Now to sort collections...the sort() uses the "List" collection, no the HashSet so to sort a
        // HashSet we
        // need to converted to a List
        List<Integer> listValues = new ArrayList<>(values); //this converts my hashSet variable values to an ArrayList

        Collections.sort(listValues);
        System.out.println("Sorting in ascending order... " +listValues); //sorts as accenting (natural order)

        Collections.sort(listValues,Collections.reverseOrder()); //USING THE Collections.reverseOrder() will do it...
        System.out.println("Sorting in Descending order... " + listValues);

        List<Employee> employeeArr = new ArrayList<>(employees);

        Collections.sort(employeeArr);

        //Now it sorts the employeesArr by salary as we set in the Employee class compareTo()...

        System.out.println("After applying compareTo() " + employeeArr);

    }

    public static void printSets(HashSet myData){
        for (Object data: myData) {
            System.out.println(data);
        }
    }
}
