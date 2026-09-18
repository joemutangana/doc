package Declaration;
import java.util.*;

public class ControlStatement {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age;
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        if(age > 30 && age <= 120){
            System.out.println("You are an adult");
        }
        else if(age >= 0 && age <=30){
            System.out.println("You are a young");
        }
        else{
            System.out.println("Invalid age");
        }

    }
    
}
