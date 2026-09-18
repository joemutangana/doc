import java.util.Scanner;
public class Ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalStudents;
        int failed = 0;
        int passed = 0;
        double marks;

        System.out.print("Enter the number of students: ");
        totalStudents = sc.nextInt();

        for(int i=1; i<=totalStudents; i++){
            System.out.print("Enter marks for student "+i+" :");
            marks=sc.nextDouble();
            if(marks >=50){
                passed +=1;
            }
            else if(marks <50){
                failed +=1;
            }
            else{
                System.out.println("Invalid marks");
            }

        }

        System.out.println("Total students: "+totalStudents);
        System.out.println("Passed students: "+passed);
        System.out.println("Failed students: "+failed);

    }
    
}
