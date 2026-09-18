import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int number;
        System.out.print("Enter a number: ");
        number = sc.nextInt();

        for(int i = 1; i<=number; i++){
            System.out.println(i);
        }
    }
    
}
