package school.students;

public class Department {

    private int id;
    private String departementName, departmentEmail;
    public Department(int id, String departementName, String departmentEmail) {
        this.id = id;
        this.departementName = departementName;
        this.departmentEmail = departmentEmail;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        if(id < 0){
            System.out.println("Invalid ID");
        }
        else{
            this.id = id;
        }
        
    }
    
    public String getDepartementName() {
        return departementName;
    }
    public void setDepartementName(String departementName) {
        this.departementName = departementName;
    }
    public String getDepartmentEmail() {
        return departmentEmail;
    }
    public void setDepartmentEmail(String departmentEmail) {
        this.departmentEmail = departmentEmail;
    }
    @Override
    public String toString() {
        return "Department [id=" + id + ", departementName=" + departementName + ", departmentEmail=" + departmentEmail
                + "]";
    }



    



    
    
}
