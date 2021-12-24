package CarDealership;

public class Customer {
    private String name;
    String address;
    private int catchOnHand;
    private boolean finance;
    private int creditScore;


    public Customer(String name,String address, int catchOnHand, boolean finance, int creditScore) {
        this.name = name;
        this.address = address;
        this.catchOnHand = catchOnHand;
        this.finance = finance;
        this.creditScore = creditScore;
    }

    public String getName() {
        return name;
    }

    public int getCatchOnHand() {
        return catchOnHand;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void lookAtCar(){
        System.out.println( this.name + " is looking a car...");
    }

    public void goesToStore(){
        System.out.println(this.name + " is going to the Dealership...");
    }

    public void purchaseCar(Car car, Employee employee){
       if(employee.isAvailable() == true && employee.isWorking() == true){
           System.out.println("Hi I would like to purchase a " + car.getName() + "-" + car.getModel() + " from " + car.getYear());
       } else {
           System.out.println("I am sorry, " + employee.getName()+ " is not available");
       }
    }
//    public double howMuchMore(Car car){
//      double total = (Car.getValue(car)- this.catchOnHand);
//      return total;
//    }


}
