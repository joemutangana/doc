package Declaration;

public class DeclarationClass {
    public static void main(String[] args) {

        int age;
        float marks;
        double amount;
        String name;
        int semester = 5;
        String department = "Software Engineering";

        //initialization

        age=23;
        marks=12.6f;
        name = "Joe";
        

        System.out.println(age);
        System.out.println("My name is " + name + ", I'm "+ age + " years old, and my marks is "+ marks + " and I'm in semester " + semester + " in department of " + department);


        //Exercise

        int stId = 29061;
        double expectedMarks = 17.5;
        String fname = "Mutangana";
        String lname = "Joseph";

        System.out.println("Id: " + stId);
        System.out.println("First name: " + fname);
        System.out.println("Last name: " + lname);
        System.out.println("Expected marks in OOP: " + expectedMarks);
        
    }
    
}
