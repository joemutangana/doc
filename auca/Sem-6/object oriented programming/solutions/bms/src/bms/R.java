package bms;
import java.util.Scanner;
public class R {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        int age;

        System.out.print("Enter email: ");
        String email = handleEmail(sc);
        System.out.print("Enter name: ");
        name = handleName(sc);
        System.out.print("Enter phone: ");
        String phone=handlePhone(sc);
        System.out.print("Enter age: ");
        age = handleNegativeValue(sc, handleNonInteger(sc));
        
        System.out.println("");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        
    }

    public static String handleEmail(Scanner sc){
        while(true){
            String email = handleBlank(sc,sc.nextLine());
            if(email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")){
                return email;
            }
            System.out.print("ERROR: Invalid email. Try again: ");

        }
    }
    public static String handleName(Scanner sc) {
        while (true) {
            String name;
            name = handleBlank(sc, sc.nextLine());
            if (name.matches("[\\p{L} `\\-]+")) {
                return name;
            }
            System.out.print("ERROR: Name can't have numeric value. Try again: ");
        }
    }

    public static String handleBlank(Scanner sc, String userInput){

        while(userInput.isBlank()){
            System.out.print("ERROR: Value can't be blank. Try again: ");
            userInput=sc.nextLine();
        }
        return userInput;

    }

    public static int handleNonInteger(Scanner sc){
        while(true){
            try{
                return Integer.parseInt(sc.nextLine());
            }
            catch(NumberFormatException e){
                System.out.print("ERROR: Enter an interger value. Try again: ");

            }
        }
    }

    public static int handleNegativeValue(Scanner sc, int userInput){

        while(userInput <=0){
            System.out.print("ERROR: Value must be positive. Try again: ");
            userInput=handleNonInteger(sc);
        }

        return userInput;
    }

    public static String handlePhone(Scanner sc) {
        String phone;
    
        while (true) {
            phone = handleBlank(sc, sc.nextLine());
    
            if (phone.length() == 10 && phone.matches("[0-9]{10}")) {
                return phone;
            }
    
            System.out.print("ERROR: Phone must contain exactly 10 digits. Try again: ");
        }
    }

       
    
    
}
