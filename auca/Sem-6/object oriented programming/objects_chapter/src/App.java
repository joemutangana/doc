
import bank.bk.operation.Saving;
import bank.bk.business.Loan;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        Saving saving = new Saving(1234,"Joseph", 1000000, "12-01-2025");
        saving.add();

        // System.out.print("Enter your account number: ");
        // int account_no = sc.nextInt();
        // sc.nextLine();
        // System.out.print("Enter your name: ");
        // String name = sc.nextLine();
        // System.out.print("Enter saving amount: ");
        // double amount = sc.nextDouble();
        // sc.nextLine();
        // System.out.print("Enter transaction date: ");
        // String date = sc.nextLine();
        // Saving save = new Saving(account_no, name,amount,date);


        // Loan loan = new Loan(230000, "Mutangana", "12-01-2034", "12-01-2056","BNR");
        // saving.displaySaving();

        System.out.print("Enter amount you want to borrow: ");
        Double amount = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter the date you want a loan: ");
        String loanDate = sc.nextLine();
        System.out.print("Enter the date you will pay back: ");
        String paybackDate = sc.nextLine();

        System.out.print("Enter your creditor: ");
        String creditor = sc.nextLine();

        Loan loan = new Loan(amount, name, loanDate, paybackDate, creditor);
        loan.displayLoan();

        
        
    }
}
