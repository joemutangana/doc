package auca;
import java.util.Scanner;
public class Student {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        studentInfo();
    }


    public static void studentInfo(){
        Scanner sc = new Scanner(System.in);
        double ass, quiz, mid, fina;
        String id, fullName;
        int semester;
        System.out.print("\n\nEnter student name: ");
        fullName = sc.nextLine();
        System.out.print("Enter student ID: ");
        id=sc.nextLine();
        System.out.print("In which semester?: ");
        semester=sc.nextInt();
        System.out.print("Enter assignment marks: ");
        ass = sc.nextDouble();
        while(ass <0 || ass >15){
            System.out.print("Out of assignment marks range (0 to 15). Try again: ");
            ass = sc.nextDouble();
        }
        System.out.print("Enter quiz marks: ");
        quiz = sc.nextDouble();
        while (quiz < 0 || quiz > 15) {
            System.out.print("Out of quiz marks range (0 to 15). Try again: ");
            quiz = sc.nextDouble();
        }

        System.out.print("Enter mid term marks: ");
        mid = sc.nextDouble();
        while (mid < 0 || mid > 30) {
            System.out.print("Out of mid term exam marks range (0 to 30). Try again: ");
            mid = sc.nextDouble();
        }

        System.out.print("Enter final exam marks: ");
        fina = sc.nextDouble();
        while (fina < 0 || fina > 40) {
            System.out.print("Out of final exam marks range (0 to 40). Try again: ");
            fina = sc.nextDouble();
        }

        System.out.println("\n==============================");
        System.out.println("Student information");
        System.out.println("==============================\n");
        System.out.println("Student full name: " + fullName);
        System.out.println("Student ID: " + id);
        System.out.println("Assignment marks: " + ass);
        System.out.println("Quiz marks: " + quiz);
        System.out.println("Mid term marks: " + mid);
        System.out.println("Final marks: " + fina);
        System.out.println("\n");






    }
    
}
