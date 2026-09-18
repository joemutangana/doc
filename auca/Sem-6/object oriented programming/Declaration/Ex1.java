package Declaration;

import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mid;
        double fin;
        double quiz;
        double assignment;
        double total;
        double gpa;
        String status;

        System.out.print("Enter your mid term exam marks: ");
        mid = sc.nextDouble();
        while(mid > 30 || mid <0 ){
            System.out.println("Mid term exam marks should be between 0 and 30! Try again.");
            System.out.print("Enter your mid term exam marks: ");
            mid = sc.nextDouble();
        }
        System.out.print("Enter your quiz marks: ");
        quiz = sc.nextDouble();
        while(quiz > 15 || quiz < 0){
            System.out.println("Quiz marks should be between 0 and 15! Try again.");
            System.out.print("Enter your quiz marks: ");
            quiz = sc.nextDouble();
        }
        
        System.out.print("Enter your assignments marks: ");
        assignment = sc.nextDouble();
        while(assignment > 15 || assignment < 0){
            System.out.println("Assignment marks should be between 0 and 15! Try again.");
            System.out.print("Enter your Assignment marks: ");
            assignment = sc.nextDouble();
        }
        
        System.out.print("Enter your final exam marks: ");
        fin=sc.nextDouble();
        while(fin > 40 || fin < 0){
            System.out.println("Final exam marks should be between 0 and 40! Try again.");
            System.out.print("Enter your final exam marks: ");
            fin = sc.nextDouble();
        }
        
        
        
        total = mid + quiz + assignment + fin;
        gpa = (total/100) * 20;

        System.out.println("Total marks: "+total + "%");
        System.out.println("GPA: " + gpa);
        if(gpa >= 16){
            status="Excellent";
        }
        else if(gpa >= 14){
            status="Very good";
        }
        else if(gpa <14 && gpa >= 10){
            status="Pass";
        }
        else{
            status="Fail";
        }
        System.out.println("Status: " + status);
        



    }
    
}
