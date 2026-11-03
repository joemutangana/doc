
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        InputHelper ih = new InputHelper();
        int choice;
        Vehicle t = new Truck();
        Vehicle c = new Car();
        do{
            System.out.println();
            System.out.println("============== Welcome To Vehicle MIS============== ");
            System.out.println();
            System.out.println("1. Register a Truck");
            System.out.println("2. Register a Car");
            System.out.println("3. Display Vehicles");
            System.out.println("4. Exit");
            System.out.print("Select an option <: ");
            choice = ih.handleNonInt(sc);
            switch (choice) {
                case 1:
                    
                    t.save(sc);
                    break;
                case 2:
                    
                    c.save(sc);
                    
                    break;
                case 3:
                    do{
                        System.out.println();
                        System.out.println("=========== Vehicle Display ========");
                        System.out.println();
                        System.out.println("1. Display Trucks");
                        System.out.println("2. Display Cars");
                        System.out.println("3. Display all vehicles");
                        System.out.println("0. Exit");
                        System.out.print("Select an option: ");
                        choice = ih.handleNonInt(sc);
                        switch (choice) {
                            case 1:
                                t.displayTrucks();
                                break;
                            case 2:
                                c.displayCars();
                                break;
                            case 3:
                                t.display();
                               break;
                            case 0:
                                System.out.println("Exiting...");
                                break;
                            

                            default:
                                System.out.println("Invalid choice. Try again!");
                                continue;
                        }

                    }while (choice !=0);
                    
                    break;
                case 4:
                    System.out.println("Exit...");
                    break;
                default:
                    System.out.println();
                    System.out.println("Invalid choice. Try again");
                    System.out.println();
                    break;
            }
            
        }while(choice !=4);
        
       
        
    }

  

    
}
