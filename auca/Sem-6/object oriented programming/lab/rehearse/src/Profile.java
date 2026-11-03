import java.util.Scanner;
public class Profile{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String name;
        int age;
        String phone;
        String email;
        double salary;

       
        
        System.out.print("Enter your name: ");
        name=handleName(sc);
        System.out.print("Enter your email: ");
        email = handleEmail(sc);
        System.out.print("Enter your phone: ");
        phone = handlePhone(sc);
        System.out.print("Enter your age: ");
        age=handleNegativeInt(sc);
        System.out.print("Enter your salary: ");
        salary=handleNegativeDouble(sc);

    }

    public static String handleBlank(Scanner sc){
        while(true){
            String userInput = sc.nextLine();
            if(!userInput.isBlank()){
                return userInput;
            }
            System.out.print("The value can't be blank. Try again: ");
        }
    }

    public static String handleName(Scanner sc){
       
        while(true){
           
            String userInput = handleBlank(sc);
            if(userInput.matches("[\\p{L} `\\-]+")){
                return userInput;
            }

            System.out.print("Name cant't contain numeric value. Try again: ");
            
        }

    }

    public static String handlePhone(Scanner sc){
        while(true){
            String userInput = handleBlank(sc);
            if(userInput.matches("[0-9]{10}")){
                return userInput;
            }
            System.out.print("Telephone number must be 10 digits. Try again: ");
        }
    }

    public static String handleEmail(Scanner sc){
        while(true){
            String userInput = handleBlank(sc);
            if(userInput.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")){
                return userInput;
            }
            System.out.print("Invalid email. Try again: ");
        }
    }

    public static int handleNonInteger(Scanner sc){
        while(true){
        try{
            return Integer.parseInt(sc.nextLine());
        }
        catch(NumberFormatException e){
            System.out.print("Age must be a number. Try again: ");
        }
    }
    }

    public static Double handleNonDouble(Scanner sc) {
        while (true) {
            try {
                return Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Invalid Salary. Try again: ");
            }
        }
    }

    public static int handleNegativeInt(Scanner sc){
        while(true){
            int userInput=handleNonInteger(sc);
            if(userInput >= 0){
                return userInput;
            }
            System.out.print("Age must be positive number. Try again: ");

        }
    }

    public static double handleNegativeDouble(Scanner sc) {
        while (true) {
            double userInput = handleNonDouble(sc);
            if (userInput >= 0) {
                return userInput;
            }
            System.out.print("Age must be positive. Try again: ");

        }
    }

}