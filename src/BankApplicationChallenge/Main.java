package BankApplicationChallenge;

public class Main {
    public static void main(String[] args) {
      Bank bank = new Bank ("Bank of America");

      bank.addBranch("Pembroke");

      bank.addCustomer("Pembroke","Ramon Lorente",50.05);
      bank.addCustomer("Pembroke","Isandra Blanco",175.34);
      bank.addCustomer("Pembroke","Michael Lorente",220.12);

      bank.addBranch("Miami");

      bank.addCustomer("Miami","Oniel", 150.54 );
      bank.addCustomerTransaction("Pembroke", "Ramon",44.22);
      bank.addCustomerTransaction("Pembroke", "Ramon",12.44);
      bank.addCustomerTransaction("Pembroke", "Isandra",150.65);

      bank.listCustomers("Pembroke",true);
      bank.listCustomers("Miami",true);
    }
}
