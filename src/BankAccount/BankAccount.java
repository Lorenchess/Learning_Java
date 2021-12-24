package BankAccount;

public class BankAccount {
    private String accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(String accountNumber, int balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
    public int getBalance(){
        return balance;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public String getCustomerName(){
        return customerName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public int deposit(int deposit){
        return balance += deposit;
    }
    public int withdrawal(int withdrawal){
        if(balance >= withdrawal){
            balance -= withdrawal;
            System.out.println("Withdrawal of " + withdrawal + " completed. Your remaining balance is " + balance);
        }
        else {
            System.out.println("Your current balance is " + balance + " Not enough founds to complete the withdrawal.");
        }
        return balance;
    }

}
