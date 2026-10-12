package bank.bk.business;

public class Loan {

    public double amount;
    public String name;
    public String loanDate;
    public String paybackDate;
    public String creditor;

    public Loan(double amount, String name, String loanDate, String paybackDate, String creditor) {
        this.amount = amount;
        this.name = name;
        this.loanDate = loanDate;
        this.paybackDate = paybackDate;
        this.creditor = creditor;
    }

    public void displayLoan(){
        System.out.println("Dear, "+name+" your loan of "+amount+" request to be taken on"+loanDate+" from "+creditor+" and will be paid on "+paybackDate+" saved succefully");
    }



}
