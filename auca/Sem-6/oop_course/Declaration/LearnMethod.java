package Declaration;

public class LearnMethod {

    public static void main(String[] args) {
        addNumber();

    }


    // to create method i nee 3 statements
    // 1. Access modifier
    // 2. Return type
    // 3.Method name/function name(){}
    
    public static void addNumber() {
        int a = 5;
        int b = 10;
        int c = a + b;
        System.out.println("The total is " + c);

    }

    public void getName() {
        System.out.println("Joe");
    }

    //types of method

    // 1. Parameterized: a method with parameter
    // 2. Non-paramterized: a method with no parameter

    public int sumNumber(int a, int b){

        return a+b;
    }


    
    
    
}
