import java.util.Scanner;
public class do_while_loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your points :");
        float points = input.nextFloat();

        do{
            if (points >= 70){

                float bonus;  
                float rate = 6;
                bonus =((rate/points)*100);
                points += bonus;
                System.out.print("Conglatulations🎉! Your have received "+ rate + "% of your points (" + bonus + ") . You new points is " + points);
                break;
                
            }
            else{
                System.out.println("Your points is :" + points);

            }
            
        }

        while (points >= 70); 

        
    }
    
}
