import java.util.Scanner;
public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String password = "Java123";
        String userInput;

        System.out.print("Enter the password: ");
        userInput = sc.nextLine();

        while (!userInput.equals(password)) {
            System.out.print("Incorrect password. Try again: ");
            userInput=sc.nextLine();
            
        }
        
        System.out.println("Login Successful");
    }
    
}
