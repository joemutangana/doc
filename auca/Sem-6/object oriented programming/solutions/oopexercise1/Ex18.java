import java.util.Scanner;
public class Ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 500;
        double withdraw;
        int choice;

        do{
            System.out.print("\n\n1. Withdraw\n2. Exit\n\nSelect choice: ");
            choice = sc.nextInt();
            if(choice == 1){
                System.out.print("Enter amount: ");
                withdraw=sc.nextDouble();
                if(withdraw > balance){
                    System.out.println("Insufficient Balance!");
                }
                else{
                    balance -=withdraw;
                    System.out.println("Withdraw success. Remaining balance: "+balance);
                }


            }
            


        }
        while(choice !=2 );
        System.out.println("\n\nExit...");
    }
    
}
