package Car_Dealership;

public class Dealership {
    public static void main(String[] args) {
       Customer customer1 = new Customer("Ramon","150 NW Pembroke",50000);
       Customer customer2 = new Customer("Isandra","150 NW Pembroke",500000);

       Vehicle vehicle1 = new Vehicle("Hyundai","Sonata",15000);
       Vehicle vehicle2 = new Vehicle("Ferrari","Mclaren",250000);

       Employee employee1 = new Employee();

       customer1.purchaseCar(vehicle1,employee1,false);
       customer2.purchaseCar(vehicle2,employee1,false);
        System.out.println("==============");
        customer1.purchaseCar(vehicle2,employee1,false);
        System.out.println("==============");
        customer1.purchaseCar(vehicle2,employee1,true);
    }
}
