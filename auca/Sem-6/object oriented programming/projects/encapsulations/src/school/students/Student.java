package school.students;

public class Student{
    /*
    
    ENCAPSULATION IT IS CALLED DATA HIDING

    A DATA IS ATTRIBUTES OR PROPERTIES



    SUPPOSE WE ARE HAVING

    id,name,address....// THESE ARE DATA/ATTRIBUTES/PROPERTIES


    IF YOU ARE HIDING THE DATA YOU ARE PREVENTING OUT SIDE CLASS TO ACCESS YOUR ATTRIBUTES
    TO HIDE THEM, WE USE AN ACCESS MODIFIER CALLED PRIVATE

    WE DO ENCAPSULATION FOR SECURITY PURPOSE


    */

    private int id;
    private String name;
    private String username;

    public Student(int id, String name, String username) {
        this.id = id;
        this.name = name;
        this.username = username;
    }

    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    /*
    
    How can we access these attributes?
    We will access them through methods getters and setters

    If we are asking for the data: setters are used
    If we want todisplaye data: getters are used


    */

    
    

    
    
}