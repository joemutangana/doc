import java.util.Scanner;
public class Ex6{
    public static void main(String[] args) {
        boolean isEven = false;
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        number = sc.nextInt();
        if (number % 2 == 0) {
            isEven = true;
        } 

        if(isEven) {
            System.out.println("The number " + number + " is even.");
        } else {
            System.out.println("The number " + number + " is odd.");
        }
        sc.close();
    
    }
}