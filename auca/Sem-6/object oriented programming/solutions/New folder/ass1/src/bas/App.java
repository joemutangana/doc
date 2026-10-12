package bas;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {

        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Declare variables for account details
        String accountHolderName;
        int accountNumber, pin,attempts, inputPin;
        double balance;

        // Prompt user to enter account details
        System.out.print("Enter account number: ");
        accountNumber = sc.nextInt();
        System.out.print("Enter account holder name: ");
        sc.nextLine();
        accountHolderName = sc.nextLine();
        System.out.print("Create a 4-digits PIN: ");
        pin = sc.nextInt();

        // Validate PIN to ensure it's a 4-digit number
        while ((pin < 1000 || pin > 9999)) {
            System.out.println("Invalid PIN. Please enter a 4-digit PIN.");
            System.out.print("Enter PIN: ");
            pin = sc.nextInt();
        }
        System.out.print("Enter initial balance: ");
        balance = sc.nextDouble();

        // Validate initial balance to ensure it's greater than zero
        while(balance <=0){
            System.out.print("Initial balance must be greater than zero. Try again: ");
            balance = sc.nextDouble();
        }


        System.out.println("Account created successful");

        // Create a BankAccount object with the provided details
        BankAccount account = new BankAccount(accountNumber, accountHolderName, pin, balance);

        boolean isAuthenticated = false;

       
        // Allow the user 3 attempts to enter the correct PIN
        for(attempts = 3; attempts > 0; attempts--){
            System.out.print("Enter your PIN: ");
            inputPin = sc.nextInt();
            if(account.authenticate(inputPin)){
                isAuthenticated = true;
                break;
            } 
            else {
                System.out.println("Pin incorrect. "+(attempts-1)+" attempt (s) remaining ");
            }
        }

        //Provide access to banking operations if authentication is successful
        if(isAuthenticated){
            int choice;
            do {

                System.out.println("1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");
                System.out.print("Enter choice: ");
                choice = sc.nextInt();

                if (choice == 1) {
                    System.out.println("Current Balance: RWF" + account.checkBalance());
                }
                else if (choice == 2) {
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                }

                else if (choice == 3) {
                    System.out.print("Enter withdraw amount: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                }

                else if (choice == 4) {
                    System.out.println("Exiting...");
                    System.exit(choice);
                }
                else {
                    System.out.println("Invalid choice. Please try again.");
                }

            } while (choice != 4);
            
        }
        

    }

    
}