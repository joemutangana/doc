package sms;

public class Student {

    String studentId, name, department;
    double total, average;
    double[] marksArray;
    int age;

        
    public Student(String studentId, String name, String department, double total, double average, double[] marksArray,
            int age) {
                
        this.studentId = studentId;
        this.name = name;
        this.department = department;
        this.total = total;
        this.average = average;
        this.marksArray = marksArray;
        this.age = age;
    }


    public void displayStudentInfo(){        
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



    public char getGrade(){       
        if(average >= 90){
            return 'A';
        }else if(average >= 80){
            return 'B';
        }else if(average >= 70){
            return 'C';
        }else if(average >= 60){
            return 'D';
        }else{
            return 'F';
        }

    }


    
}
