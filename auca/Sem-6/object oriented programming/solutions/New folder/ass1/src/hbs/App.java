package hbs;

import java.util.Scanner;
public class App {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int generateId=100, bookingID, numberOfNights, numberOfGuests, choice;
        String customerName, roomType="";
        double price=0;
        int maximumCustomers = 50;
        HotelBooking[] customers = new HotelBooking[maximumCustomers];  
        
        
        for(int i=0; i<maximumCustomers; i++){
            generateId+=1;
            bookingID=generateId;

            System.out.print("Enter customer name: ");
            customerName=sc.nextLine();

            do{

            System.out.println("\nAvailable Room Types With Price: ");
            System.out.println("1. Standard Rooms (Rwf10000 / Night)");
            System.out.println("2. Delux Rooms (Rwf15000 / Night)");
            System.out.println("3. Executive Rooms (Rwf20000 / Night)");
            System.out.print("\nSelect Room: ");
            choice = sc.nextInt();
            if (choice == 1) {
                roomType="Standard Room";
                price=10000;
                break;
                
            }
            else if (choice == 2) {
                roomType="Delux Room";
                price=15000;
                break;
                
            }
            else if (choice==3) {
                roomType="Executive Room";
                price=20000;
                break;
                
            }
            else{
                System.out.println("\nWrong choice! Try again");
            }

            }
            while(choice != 1 && choice !=2 && choice !=3);

            System.out.print("Enter number of nights: ");
            numberOfNights=sc.nextInt();

            while(numberOfNights < 1 || numberOfNights >30 ){

                System.out.println("ERROR: Number of nights range is (1-30)");
                System.out.print("Enter number of nights: ");
                numberOfNights=sc.nextInt();
            }


            System.out.print("Enter number of guests: ");
            numberOfGuests=sc.nextInt();

            while(numberOfGuests < 1 || numberOfGuests >3 ){

                System.out.println("ERROR: Number of Guests range is (1-3)");
                System.out.print("Enter number of Guests: ");
                numberOfGuests=sc.nextInt();
            }

            customers[i] = new HotelBooking(bookingID,  customerName, roomType, numberOfNights, numberOfGuests,price);
            customers[i].displayBooking();
            
            sc.nextLine();
            System.out.println();
        

        }
        

        
        
        
    }
}
