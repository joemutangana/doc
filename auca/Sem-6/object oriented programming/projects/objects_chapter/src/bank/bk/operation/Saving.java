package bank.bk.operation;
public class Saving {

    public int account_no;
    public String accountHolder;
    public double amount;
    public String transactionDate;

   
    
    public Saving() {
    }

    public Saving(int account_no, String accountHolder, double amount, String transactionDate) {
        this.account_no = account_no;
        this.accountHolder = accountHolder;
        this.amount = amount;
        this.transactionDate = transactionDate;
    }

    public void add(){
        System.out.println("Deposted successful");
    }

    public void displaySaving(){
        System.out.println("Dear "+accountHolder+", amount of "+amount+"francs  saved successfully");
    }
}
