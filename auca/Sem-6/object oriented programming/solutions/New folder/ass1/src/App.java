import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        //Create an object of Student class
        Student st = new Student();

        //Declare variables to store student information
        String studentId, name, department;
        double marks, total=0, average=0;
        int age;

        //Prompt the user inputs
        System.out.print("Enter Student ID: ");
        studentId = sc.nextLine();
        st.studentId = studentId;
        System.out.print("Enter Student Name: ");
        name = sc.nextLine();
        st.name = name;
        System.out.print("Enter Department Name: ");
        department = sc.nextLine();
        st.department = department;
        System.out.print("Enter Student Age: ");
        age = sc.nextInt();
        st.age = age;

        //Check if the age is valid, if not prompt the user to enter again
        while (!(st.checkAge())){
            System.out.println("ERROR: Age range is (16-60)");
            System.out.print("Enter Student Age: ");
            age = sc.nextInt();
            st.age = age;            

        }

        //Prompt the user to enter marks for 5 subjects and calculate total and average marks
        for(int i=1 ; i<=5; i++){
            System.out.print("Enter marks of subject "+i+": ");
            marks = sc.nextDouble();
            st.marks = marks;

            //Check if the marks are valid, if not prompt the user to enter again
            while (!(st.checkMarks())) {
                System.out.println("ERROR: Marks range is (0-100)");
                System.out.print("Enter marks of subject " + i + ": ");
                marks = sc.nextDouble();
                st.marks = marks;

            }
            //Calculate the total marks and assign it to the Student object
            total += marks;
            st.total=total;


        }

        //Calculate the average marks and check if student passed
        average = total / 5;
        st.average = average;
        if (st.isPassed()) {
            System.out.println("\nStudent has passed");
        } else {
            System.out.println("Student has failed");
        }
       

        //Display the student information and obtained grade
        st.displayStudentInfo();
        st.assignGrade();

    }
}
