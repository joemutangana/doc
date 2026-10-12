package school.students;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        
       
        Scanner sc = new Scanner(System.in);
        // int number = sc.nextInt();
        // String name = sc.nextLine();
        // String username = sc.nextLine();

        // Student st = new Student(number, name, username);

        

        // st.setId(number);
        // st.getId();

        
        // System.out.println(st.getId());

        // System.out.print("Enter department id: ");
        // int depId=sc.nextInt();
        // sc.nextLine();
        // System.out.print("Enter department name: ");
        // String depName = sc.nextLine();
        // System.out.print("Enter department email: ");
        // String depEmail = sc.nextLine();

        
        // Department dep = new Department(depId, depName, depEmail);
        // dep.setId(depId);
        // System.out.println(dep);


        String courseName;
        String courseId;
        int maxStudents;
        int credits;
        String lecturerName;
        
        System.out.print("Enter Course id: ");
        courseId = sc.nextLine();
        System.out.print("Enter course name: ");
        courseName = sc.nextLine();
        System.out.print("Enter lecturer name: ");
        lecturerName = sc.nextLine();
        System.out.print("Enter maximum Students: ");
        maxStudents = sc.nextInt();
        System.out.print("Enter number of credits: ");
        credits = sc.nextInt();

        Course course = new Course(courseName, courseId, maxStudents, credits, lecturerName);
        course.setCourseId(courseId);
        course.setCourseName(courseName);
        course.setMaxStudents(maxStudents);
        course.setCredits(credits);
        System.out.println(course);

    

    }
    
}
