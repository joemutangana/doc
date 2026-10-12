package eps;
import java.util.Scanner;

public class App {

    public static void main(String[] args){
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        //Declare variables to store employee details
        String employeeName, department;
        int employeeId;
        double salary, hoursWorked, overtimeHours;

        //Declare array to store multiple employees
        Employee[] employees;

        //Ask the user how many employees they want to enter
        System.out.print("Enter the number of employees to register: ");
        int numEmployees = sc.nextInt();

        //Initialize the employees array with the specified size
        sc.nextLine(); 
        employees = new Employee[numEmployees];

        //Loop to prompt the user to enter details for each employee

        int registered = 0; // Variable to keep track of the number of registered employees

        
        for (int i = 0; i < numEmployees; i++) {

            //Show user how many employees have been registered
            System.out.println("\n("+(registered) + "/" + numEmployees+") Employee (s) Registered ");
            //Values on each employee
            hoursWorked = 0;
            overtimeHours = 0;
            


            // Prompt the user to enter employee details
            System.out.print("Enter Employee's ID: ");
            employeeId = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Employee's Name: ");
            employeeName = sc.nextLine();
            System.out.print("Enter Employee's Department: ");
            department = sc.nextLine();
            System.out.print("Enter Employee's Salary: ");
            salary = sc.nextDouble();
            // Check if salary is negative or zero
            while (salary <= 0) {
                System.out.println("Salary must be greater than zero. Please enter a valid salary.");
                System.out.print("Enter Employee's Salary: ");
                salary = sc.nextDouble();
            }

            System.out.print("Enter Hours Worked: ");
            hoursWorked = sc.nextDouble();
            // Check if hours worked is negative or zero
            while (hoursWorked <= 0) {
                System.out.println("Hours worked must be greater than zero. Please enter a valid number of hours.");
                System.out.print("Enter Hours Worked: ");
                hoursWorked = sc.nextDouble();
            }

          

            // Create an Employee object with the entered details
            employees[i] = new Employee(employeeName, department, employeeId, salary, hoursWorked);

            // Increment the count of registered employees
            registered++; 

            // After entring hours worked read new line
            sc.nextLine();


        }

         //Display each employee's detail and check highest net salary
         double highestNetSalary = employees[0].salary;
         int highestNetSalaryIndex = 0;
         for (int emp = 0; emp < numEmployees; emp++) {
             if (employees[emp].salary > highestNetSalary) {
                 highestNetSalary = employees[emp].salary;
                 highestNetSalaryIndex = emp;
             }
         }

         // Display Employee with highest net salary
         String empName = employees[highestNetSalaryIndex].employeeName;
         System.out.println("\n-------------------------------------------------------");
         System.out.println("Employee With Highest Net Salary is " + empName);
         System.out.println("-----------------------------");

         employees[highestNetSalaryIndex].displayEmployeeDetails();

        
    }   
}

