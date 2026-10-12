public class Student {

    String studentId, name, department;
    double marks, total, average;
    int age;

    public Student() {
       
    }

    public boolean checkMarks(){
        return marks >=0 && marks <=100;
    }

    public boolean checkAge(){
        return age >=16 && age <=60;
    }

    public void displayStudentInfo(){
        System.out.println("\n================= STUDENT INFORMATION =================");
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Age: " + age);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);

        
    }

    public boolean isPassed(){
        return average >= 60;
    }

    public void assignGrade(){
        System.out.println("\n================= OBTAINED GRADE =================");
        if(average >= 90){
            System.out.println("Grade: A");
        }else if(average >= 80){
            System.out.println("Grade: B");
        }else if(average >= 70){
            System.out.println("Grade: C");
        }else if(average >= 60){
            System.out.println("Grade: D");
        }else{
            System.out.println("Grade: F");
        }

        System.out.println("\n");
    }
    
}