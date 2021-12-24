package BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("12345",100,"Ramon","ramon@gmail.com","956-336-2323");

        account1.withdrawal(20);
        System.out.println(account1.getBalance());
        account1.deposit(500);
        System.out.println(account1.getBalance());
        account1.withdrawal(80);
        System.out.println(account1.getBalance());
        System.out.println(account1.getCustomerName());
        account1.withdrawal(100);
        account1.withdrawal(400);
        account1.withdrawal(100);

       VipCustomer customer1 = new VipCustomer();
        System.out.println(customer1.getName());

        VipCustomer customer2 = new VipCustomer("Michael", 250000);
        System.out.println(customer2.getName());
        System.out.println(customer2.getCreditLimit());

    }
}
