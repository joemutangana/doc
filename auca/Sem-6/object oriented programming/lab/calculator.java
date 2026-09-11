import java.util.Scanner;

public class calculator {

    
    float addition(float a, float b) {
        return a + b;

    }

    float subtraction(float a , float b){
        return a - b;
    }

    float product(float a, float b){
        return a * b;
    }

    float division(float a, float b){
        return a / b;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number :");
        float a = input.nextFloat();
        System.out.print("Enter second number :");
        float b = input.nextFloat();

        calculator calc = new calculator();

        System.out.println("\n========Result========\n");
        System.out.println(a + " + " + b + " = " + calc.addition(a,b));
        System.out.println(a + " - " + b + " = " + calc.subtraction(a,b));
        System.out.println(a + " * " + b + " = " + calc.product(a, b));
        System.out.println(a + " ÷ " + b + " = " + calc.division(a, b));
        

        
    }
    
}
