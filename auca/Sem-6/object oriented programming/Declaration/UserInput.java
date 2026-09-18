package Declaration;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int age;
        String name;
        System.out.print("Enter age: ");
        age =scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.println("My age is " + age);
        System.out.println("My name is "+name);



    }
    
}
