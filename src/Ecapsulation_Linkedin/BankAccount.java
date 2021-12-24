package Ecapsulation_Linkedin;

public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double startingBalance) {
        this.owner = owner;
        this.balance = Math.max(startingBalance, 0); //to prevent adding a starting balance negative
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        System.out.println(owner + ", your current balance is " + balance);
        return balance;
    }

    public double deposit(double amount){
        if(amount > 0){
            balance = balance + amount;
            System.out.println("Deposit of " + amount + " was successfully added it to your account.");
            System.out.println("Your current balance is " + balance);
            return balance;
        }
        return 0;
    }

    public double withdraw(double amount){
        if(amount > balance){
            System.out.println("Not enough balance to withdraw. Your current balance is " + balance);
        }
        else{
            balance -= amount;
            System.out.println("Withdraw successful. Your current balance is " + balance);
        }

        return this.balance;
    }
}
