import java.util.Scanner;
public class Ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secretNumber = 13;
        int guess;
        do{
            System.out.print("Guess the number: ");
            guess = sc.nextInt();
            if(guess == secretNumber){
                System.out.println("Correct!");
            }
            if(guess > secretNumber){
                System.out.println("Too high");
            }
            else if(guess < secretNumber){
                System.out.println("Too Low");
            }

        }
        while(guess != secretNumber);
        
    }
    
}
