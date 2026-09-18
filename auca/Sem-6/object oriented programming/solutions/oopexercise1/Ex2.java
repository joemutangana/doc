import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 , num2, result;

        System.out.println("Calculator");
        System.out.print("Enter first number: ");
        num1 = sc.nextDouble();
        System.out.println("Choose operation: ");
        System.out.println("1. Add (+)");
        System.out.println("2. Subtract (-)");
        System.out.println("3. Multiply (*)");
        System.out.println("4. Divide (/)");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        System.out.print("Enter second number: ");
        num2 = sc.nextDouble();
        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Sum: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Difference: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Product: " + result);
                break;
            case 4:
                result = num1 / num2;
                System.out.println("Quotient: " + result);
                break;
            default:
                System.out.println("Invalid choice!");
                sc.close();
        }
    }
    
}
