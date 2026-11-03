import java.util.Scanner;

public class Car extends Vehicle {

    InputHelper ih = new InputHelper();

    public Car(int id, String name, String model, int seat) {
        super(id, name, model, seat);
    }

    public Car(){

    }



    @Override
    public void save(Scanner sc) {
        int choice;
        System.out.println();
        System.out.println("============== Car registration ============== ");
        System.out.println();
        do{
            
            System.out.println("1. New car");
            System.out.println("0. Exit");
            System.out.print("select an option: ");
            choice = ih.handleNonInt(sc);

            switch (choice) {
                case 1:
                    System.out.print("Enter car id: ");
                    int id = ih.handleNonInt(sc);
                    System.out.print("Enter car name: ");
                    String name = ih.handleBlank(sc);
                    System.out.print("Enter car model: ");
                    String model = ih.handleBlank(sc);
                    System.out.print("Enter car seats: ");
                    int seat = ih.handleNonInt(sc);
                    Vehicle v = new Car(id, name, model, seat);
                    ls.add(v);
                    System.out.println("Number of vehicles: "+ls.size());
                    System.out.println();
                  break;
                case 0:
                    break;
                default:
                    System.out.println();
                    System.out.println("Invalid choice. Try again: ");
                    System.out.println();
                    continue;
            }

        }while(choice !=0);
    }

    @Override
    public String toString() {
        return "\nCar Id: " + getId() + "\nCar Name: " + getName()
                + "\nCar Model: " + getModel() + "\nCar Seats: " + getSeat();
    }

    


    
    
}
