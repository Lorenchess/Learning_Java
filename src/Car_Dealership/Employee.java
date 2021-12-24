package Car_Dealership;

public class Employee {
    public void handleCustomers(Customer customer, boolean finance, Vehicle vehicle){
        if(finance){
            double loanAmount = vehicle.getPrice() - customer.getCashOnHand();
            runCreditHistory(customer, loanAmount);
        } else if(vehicle.getPrice() <= customer.getCashOnHand()){
            processTransaction(customer,vehicle);
        } else {
            double moreMoney = vehicle.getPrice() - customer.getCashOnHand();
            System.out.println("I am sorry, " + customer.getName() +", you need more money to purchase the "
                                              + vehicle.getMake() + ". You need to bring an additional $" + moreMoney );

        }
    }
    private void runCreditHistory(Customer customer,double loanAmount ){
        System.out.println("Ran credit history for customer, " + customer.getName());
        System.out.println("Customer has been approved to purchase the vehicle and it will own " + loanAmount );
    }
    private void processTransaction(Customer customer, Vehicle vehicle){
        System.out.println("Customer " + customer.getName() + " has purchased the vehicle: "
                                       + vehicle.getMake() + " for the price " + vehicle.getPrice());

    }
}
