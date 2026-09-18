import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double marks;
        String status;
        System.out.print("Enter your marks: ");
        marks = sc.nextDouble();
        if (marks >= 50) {
            status = "Pass";
       
        } else {
            status = "Fail";
        }
        System.out.println("Your have: " + status);
        sc.close();
    }
    
}
