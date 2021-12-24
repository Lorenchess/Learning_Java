package CarDealership;

public class Employee {
    private String name;
    private boolean isWorking;
    private boolean isAvailable;


    public Employee(String name, boolean isWorking, boolean isAvailable) {
        this.name = name;
        this.isWorking = isWorking;
        this.isAvailable = isAvailable;
    }

    public String getName() {
        return name;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public boolean handleCustomer(Customer customer, boolean finance, Car car, boolean isAvailable, boolean isWorking){
        if(isAvailable ==true && isWorking ==true) {
            if(finance == true && customer.getCreditScore() >= 800){
                System.out.println("Congrats, " + customer.getName() + " can purchase " + car.getName());
            } else if (customer.getCatchOnHand() >= car.getValue()){
                System.out.println("Congrats, " + customer.getName() + ", you can purchase a " + car.getName() + "-"
                        + car.getModel() + " from " + car.getYear());
            } else {
                System.out.println("I am sorry, " + customer.getName() + ". Please bring more catch... ");
            }
            return true;
        }
        System.out.println("I am sorry...employee is not available");
      return false;
    }


}
