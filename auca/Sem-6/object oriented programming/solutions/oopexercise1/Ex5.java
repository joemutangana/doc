import java.util.Scanner;
public class Ex5 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double marks;
        String status;
        System.out.print("Enter marks between 0 and 100: ");
        marks = sc.nextDouble();
        if (marks < 0 || marks > 100) { 
            System.out.println("Invalid marks entered. Please enter a value between 0 and 100.");
            status = "Invalid";
        } else if (marks >= 90) {
            status = "A";
        } else if (marks >= 80) {
            status = "B";
        } else if (marks >= 70) {
            status= "C";
        } else if (marks >= 60) {
            status = "D";
        } else {
            status = "F";
        }
        System.out.println("Your grade is: " + status);
        sc.close();
    }
}
