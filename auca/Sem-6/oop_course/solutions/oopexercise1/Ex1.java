import java.util.Scanner;
public class Ex1{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stName;
        int age, regNumber;
        double marks;
        System.out.print("Enter Student Name: ");
        stName = sc.nextLine();
        System.out.print("Enter Age: ");
        age = sc.nextInt();
        System.out.print("Enter Registration Number: ");
        regNumber = sc.nextInt();
        System.out.print("Enter Marks: ");
        marks = sc.nextDouble();
        System.out.println("Student Information:");
        System.out.println("Name: " + stName);
        System.out.println("Age: " + age);
        System.out.println("Registration Number: " + regNumber);
        System.out.println("Marks: " + marks);
        sc.close();
    }
}