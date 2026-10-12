package eps;

public class Employee {

    String employeeName, department;
    int employeeId;
    double salary, hoursWorked, overtimeHours;

    public Employee(String employeeName, String department, int employeeId, double salary, double hoursWorked) {
        this.employeeName = employeeName;
        this.department = department;
        this.employeeId = employeeId;
        this.salary = salary;
        this.hoursWorked = hoursWorked;
        
        
    }

    //Method to calculate overtime hours
    public double calculateOvertimeHours() {   
        if (hoursWorked > 160){
            return overtimeHours = hoursWorked-160;
        }
        else{
            return 0;
        }
        
    }

    //Method to caculate the tax based on the salary range
    public double calculateTax() {
        if (salary <= 100000) {
            return salary * 0.1; // 10% tax for salary up to $100000
        } else if (salary <= 200000) {
            return salary * 0.15; // 15% tax for salary between $100001 and $200000
        } else {
            return salary * 0.2; // 20% tax for salary above $200000
        }
    }

    //Method to calculate the net salary after tax deduction
    public double calculateNetSalary() {
        double tax = calculateTax();
        return salary - tax;
    }


    //Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Department: " + department);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: Rwf" + salary);
        System.out.println("Hours Worked: " + hoursWorked+"hrs");
        System.out.println("Overtime Hours: " + calculateOvertimeHours()+"hrs");
        System.out.println("Tax : Rwf" + calculateTax());
        System.out.println("Net Salary: Rwf" + calculateNetSalary());
    }

    
}
