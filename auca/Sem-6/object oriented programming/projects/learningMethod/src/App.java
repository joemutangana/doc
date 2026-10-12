import auca.Student;
public class App {
    public static void main(String[] args) throws Exception {
        /*
        We need to call a method
        a method can't be executed unless it is called
        if you see a method without a body, the metod is being called.

        if you have many methods having same name but having different parameters,
         it is called method overloading associativity. A-B AND B-C There A-C
        
        */
       Student.studentInfo();
       addNumber();
       addNumber(12.5f, 43.5f);
       System.out.println("The total of the two float values is: " + addNumber(12.5f, 43.5f));
    }

    public static void addNumber(){
        int a = 20;
        int b = 10;
        int c = a + b;
        System.out.println("The total of the two values is: " + c);
        addNumber(4, 5);
    }

    public static void addNumber(int a, int b){
        System.out.println("The total of the two values is: " +  (a + b));
        addNumbers(4, 5, 6);
    }

    public static void addNumbers(int a, int b, int c){
        System.out.println("The total of the three values is: " +  (a + b + c));
    }

    public static float addNumber(float a, float b){

        return a + b;
    }

}
