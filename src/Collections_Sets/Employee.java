package Collections_Sets;

import org.jetbrains.annotations.NotNull;

//We need to use the implements Comparable<Employee> so we can implement our own the compareTo() to be able to use
// the Collections.sort() with Objects...

public class Employee implements Comparable<Employee>{
    private String name;
    private int salary;
    private String department;

    public Employee(String name, int salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee {" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

    ///The method we need to implement to be able to use the Collections.sort() in the main method to sort the
    // employees instances of Employee...

    @Override
    public int compareTo(@NotNull Employee emp) {
        if(this.salary > emp.salary){
            return -1;
        } else if(this.salary < emp.salary){
            return 1;
        }
        return 0;
    }
}
