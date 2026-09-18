import java.util.Scanner;
public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age;
        String name;
        System.out.print("Enter your name: ");
        name =sc.nextLine();
        System.out.print("Enter your age: ");
        age = sc.nextInt();

        if(age >=18){
            System.out.println("You are eligible to vote.");
        }
        else{
            System.out.println("You still need " + (18-age)+ " age to be eligible to vote");

        }


    }
    
}
