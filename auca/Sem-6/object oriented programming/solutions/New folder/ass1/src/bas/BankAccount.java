package bas;

public class BankAccount {

    // Declare variables for account details
    String accountHolderName;
    int  accountNumber, pin;
    double balance;

    // Constructor to initialize the BankAccount object with account details
    public BankAccount(int accountNumber, String accountHolderName, int pin, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.pin = pin;
        this.balance = balance;
    }

    // Method to authenticate the user by comparing the input PIN with the stored PIN
    boolean authenticate(int inputPin) {
        return inputPin == pin;
    }

    // Method to check the current balance of the account
    public double checkBalance() {
        return balance;
    }

    // Method to deposit a specified amount into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit Success. Current Balance: RWF" + balance);
        } else {
            System.out.println("Deposit failed: Amount must be greater than 0");
        }
    }

    // Method to withdraw a specified amount from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw Success. Current Balance: RWF" + balance);
        } else if (amount > balance) {
            System.out.println("Withdraw failed: Not enough balance");
        } else {
            System.out.println("Withdraw failed: Amount must be greater than 0");
        }
    }
    
}
