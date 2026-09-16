import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        int num;
        boolean isPositive = true;
        boolean isZero = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = scanner.nextInt();
        if (num < 0) {
            isPositive = false;
        }
        if (num == 0) {
            isZero = true;
        }

        if (isZero) {
            System.out.println("The number is zero.");
        } else if (isPositive) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is negative.");
        }

    }
    
}
