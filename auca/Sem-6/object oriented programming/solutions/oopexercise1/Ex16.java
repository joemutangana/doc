import java.util.Scanner;
public class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin = 2026;
        int guess;
        do{
            System.out.print("Enter your password: ");
            guess = sc.nextInt();
            if(guess == pin){
                System.out.println("Access Granted!");
            }

        }
        while(guess != pin);
        
    }
    
}
