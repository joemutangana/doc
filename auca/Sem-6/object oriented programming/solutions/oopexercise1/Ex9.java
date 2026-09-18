import java.util.Scanner;
public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //calculate the mulitplication table of entered number

        int number;
        System.out.println("Enter the number: ");
        number = sc.nextInt();
        System.out.print("Multiplication table of "+ number);
        for(int i = 1; i<=12; i++){
            
            System.out.println(number  + " * " + i + " = " + (number * i));
        }
    }
}
