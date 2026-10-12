package sms;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        

        // Declare variables to store student information
        String studentId, name, department;
        double marks, total = 0, average = 0;
        int age, numberOfStudents, registeredStudents = 0;

        //Ask a user how many number of students to register
        System.out.print("How many students to register? : ");
        numberOfStudents = sc.nextInt();

        // Check if the number of students is valid, if not prompt the user to enter again
        while (numberOfStudents <= 0) {
            System.out.println("ERROR: Number of students must be greater than 0");
            System.out.print("How many students to register? : ");
            numberOfStudents = sc.nextInt();
        }

        //Create an array of Student objects to store the student information
        Student[] students = new Student[numberOfStudents];        

        //Create a loop to iterate through all number of students while collecting their info
        for(int obj=0; obj < numberOfStudents; obj++){
            total = 0; // Reset total for each student
            System.out.println("\n=======================================");
            System.out.println("("+registeredStudents+"/" + numberOfStudents + ") Student(s) registered");
            System.out.println("-----------------------------------------");
            System.out.println(" PROVIDE INFORMATION OF STUDENT " +(obj+1) +" BELOW:");
            System.out.println("------------------------------------------\n");

            // Prompt the user inputs
            sc.nextLine();
            System.out.print("Enter Student ID: ");
            studentId = sc.nextLine();

            System.out.print("Enter Student Name: ");
            name = sc.nextLine();

            System.out.print("Enter Department Name: ");
            department = sc.nextLine();

            System.out.print("Enter Student Age: ");
            age = sc.nextInt();

            // Check if the age is valid, if not prompt the user to enter again
            while (age < 16 || age > 60) {
                System.out.println("ERROR: Age range is (16-60)");
                System.out.print("Enter Student Age: ");
                age = sc.nextInt();

            }


            // Prompt the user to enter marks for 5 subjects and calculate total and average marks
            double[] marksArray = new double[5];
            for (int i = 0; i < 5; i++) {
                System.out.print("Enter marks of subject " + (i + 1) + ": ");
                marks = sc.nextDouble();
                marksArray[i] = marks;

                // Check if the marks are valid, if not prompt the user to enter again
                while (marks < 0 || marks > 100) {
                    System.out.println("ERROR: Marks range is (0-100)");
                    System.out.print("Enter marks of subject " + (i + 1) + ": ");
                    marks = sc.nextDouble();
                    marksArray[i] = marks;

                }
               

            }

            // Calculate the total marks and assign it to the Student object
            for (int mark=0; mark<marksArray.length; mark++) {
                total += marksArray[mark];
            }
          

            // Calculate the average marks and check if student passed
            average = total / marksArray.length;

            students[obj]= new Student(studentId, name, department, total, average, marksArray, age);
            

            // Display the student information 
            System.out.println("\n================= STUDENT " + (obj+1) + " INFORMATION =================");
            students[obj].displayStudentInfo();  
            char grade = students[obj].getGrade();
            System.out.println("Grade: " + grade);
            if (students[obj].isPassed()) {
                System.out.println("Student has passed");
            } else {
                System.out.println("Student has failed");
            }
            
            registeredStudents++;

        }

        System.out.println("\n=======================================");
        System.out.println("("+registeredStudents+"/" + numberOfStudents + ") Student(s) registered\n");
       
    }

    
}
