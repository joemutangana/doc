import java.util.Scanner;


public class Student {
    int age;
    String name;
    
    void study(){
        System.out.println(name + " Is studying.");
    }

    void enroll(){
        System.out.println(name + " Enrolled");
    }

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your name :");
        String name = input.nextLine();

        Student student = new Student();

        student.name = name;
        student.study();
    }
}
