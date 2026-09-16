package Declaration;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Sum two numbers is: " + addTwoNumber(2, 4));
        
        
    }


    public static int addTwoNumber(int a, int b){
        System.out.println("Sum three numbers is: " + addThreeNumber(3,4,5));

        return a + b ;
        

    }

    public static int addThreeNumber(int a, int b, int c) {
        System.out.println("Sum four numbers is: " + addFourNumber(2, 4, 10, 20));

        return a + b + c;

    }

    public static int addFourNumber(int a, int b, int c, int d) {

        return a+b+c+d;
    }
    
}
