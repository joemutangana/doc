import java.util.Scanner;
public class Truck extends Vehicle {

    private String loadSize;
    
    InputHelper ih = new InputHelper();

    
    public Truck(int id, String name, String model, int seat, String loadSize) {
        super(id, name, model, seat);
        this.loadSize = loadSize;
    }

    public Truck() {
    }

    public String getLoadSize() {
        return loadSize;
    }

    public void setLoadSize(String loadSize) {
        this.loadSize = loadSize;
    }

    @Override
    public void displayTrucks() {
        super.displayTrucks();
        
    }
    
    @Override
    public void displayCars() {
        super.displayCars();
        
    }

    

    

    




    @Override
    public void save(Scanner sc) {
        int choice;
        System.out.println();
        System.out.println("================ Truck Registration ================ ");
        System.out.println();
        do{
           
            System.out.println("1. New Truck");
            System.out.println("0. Exit");
            System.out.print("Select an option: ");
            choice = ih.handleNonInt(sc);
            switch (choice) {
                case 1:
                    System.out.print("Enter truck id: ");
                    int id = ih.handleNonInt(sc);
                    System.out.print("Enter truck name: ");
                    String name = ih.handleBlank(sc);
                    System.out.print("Enter truck model: ");
                    String model = ih.handleBlank(sc);
                    System.out.print("Enter truck seats: ");
                    int seat = ih.handleNonInt(sc);
                    System.out.print("Enter truck loadsize: ");
                    loadSize = ih.handleBlank(sc);
                    Vehicle v = new Truck(id, name, model, seat, loadSize);
                    ls.add(v);
                    System.out.println();
                    System.out.println("Number of vehicles: " + ls.size());
                    System.out.println();
                    break;
                case 0:
                    break;
            
                default:
                    System.out.println();
                    System.out.println("Invalid option. Try again: ");
                    System.out.println();
                    continue;
            }
            
            
            
        }while(choice !=0);
        
    }

    @Override
    public String toString() {
        return "\nTruck Id: " +getId() +"\nTruck Name: " +getName()
                +"\nTruck Model: " +getModel() +"\nTruck Seats: " +getSeat()+"\nLoadSize: " +getLoadSize();
    }





    

    

    
    
}
