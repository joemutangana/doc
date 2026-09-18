package auca;

import java.util.Scanner;

public class Calculation {
    
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        Float lenght, height;

        System.out.print("Enter the length: ");
        lenght=sc.nextFloat();
        System.out.print("Enter height: ");
        height = sc.nextFloat();

        System.out.println("The area is: " + rectangleArea(lenght,height));
        
    }

    public static float rectangleArea(float lenght, float height){
        float area = lenght *height;
        return area;

    }
        
    
}
