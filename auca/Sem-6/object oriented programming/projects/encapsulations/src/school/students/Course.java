package school.students;

public class Course {
    
    private String courseName;
    private String courseId;
    private int maxStudents;
    private int credits;
    private String lecturerName;

    public Course(String courseName, String courseId, int maxStudents, int credits, String lecturerName) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.maxStudents = maxStudents;
        this.credits = credits;
        this.lecturerName = lecturerName;
    }

    /*

    Accepsted course name are: OOP and JAVA
    Course Code: max lenght 5
    Credits, min 3 max 4
    
    */
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        if(!courseName.toLowerCase().equals("oop") && !courseName.toLowerCase().equals("java")){
            System.out.println("Invalid Course name.");

        }
        else{
            this.courseName = courseName;
        }
        
    }

    public String getCourseId() {
        
        return courseId;
    }

    public void setCourseId(String courseId) {
        if(courseId.length() > 5){
            System.out.println("To long characters. Try less or 5 chars");

        }
        else{
            this.courseId = courseId;
        }
        
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        if(maxStudents < 0 || maxStudents > 100){
            System.out.println("Out of range. Accepted range(0-100)");
        }
        else{
            this.maxStudents = maxStudents;

        }
        
    }

    public int getCredits() {
        
        return credits;
    }

    public void setCredits(int credits) {
        if(credits !=3 && credits !=4){
            System.out.println("Invalid course credit. Number of credits can be 3 or 4");
            
        }
        else{
            this.credits = credits;

        }
        
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    @Override
    public String toString() {
        return "Course [courseName=" + courseName + ", courseId=" + courseId + ", maxStudents=" + maxStudents
                + ", credits=" + credits + ", lecturerName=" + lecturerName + "]";
    }


    
    


    
    
}
