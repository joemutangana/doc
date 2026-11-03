import java.util.Scanner;

public class InputHelper {
    
    public InputHelper() {
    }

    public int handleNonInt(Scanner sc){
        while(true){
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("ERROR: Value must be a number. Try again: ");
            }

        }
    }

    public static String handleBlank(Scanner sc){
        while(true){
            String value = sc.nextLine();
            if(!value.isBlank()){
                return value;   
            }
            System.out.print("ERROR: Value can't be blank. Try again: ");
            
        }
    }
    
}
