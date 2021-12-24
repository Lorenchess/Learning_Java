package CarDealership;

public class Dealership {
    public static void main(String[] args) {
       Customer customer1 = new Customer("Ramon", "154 Main St.",1000,false,850 );
       Customer customer2 = new Customer("Isandra", "154 Main St.",200000,false,850 );
       Employee employee1 = new Employee("George",true,true);
       Employee employee2 = new Employee("Pedro",true,false);
       Employee employee3 = new Employee("Ana",false,false);
       Car car1 = new Car("Hyundai",2021,"Sonata",10000);
       Car car2 = new Car("Ferrari",2021,"Fire",190000);

       customer1.goesToStore();
       customer1.lookAtCar();
       customer1.purchaseCar(car1,employee2);
       employee1.handleCustomer(customer1,false,car1, true, true);

       System.out.println("========================");

       customer2.goesToStore();
       customer2.lookAtCar();
       customer2.purchaseCar(car2,employee1);
       employee1.handleCustomer(customer2,false,car2,true,true);
    }
}
