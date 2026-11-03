import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


class Vehicle{
    private int id;
    private String name;
    private String model;
    private int seat;

    InputHelper ih =new InputHelper();
    static List<Vehicle> ls = new LinkedList<>();

    public Vehicle(int id, String name, String model, int seat) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.seat = seat;
    }

    public Vehicle(){

    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getSeat() {
        return seat;
    }
    public void setSeat(int seat) {
        this.seat = seat;
    }

    public void display(){
        if (ls.isEmpty()) {
            System.out.println();
            System.out.println("=========== The vehicle list is empty ===============");
            System.out.println();
        }
        else{
            int count =1;
            for (Vehicle v : ls) {
                System.out.println();
                System.out.println("-----Vehicle" + (count)+ ": "+v.getClass().getSimpleName());
                System.out.println(v);
                System.out.println("Vehicle type: " + v.getClass().getSimpleName());
                count++;
            }

        }
        
        
    }

    public void displayTrucks(){
       
        if (ls.isEmpty()) {
            System.out.println();
            System.out.println("=========== No registered trucks ===============");
            System.out.println();
        }

        else{
            System.out.println();
            System.out.println("======= Trucks List ===========");
            System.out.println();
            int count=1;
            for (Vehicle v : ls) {
                if (v instanceof Truck) {
                   System.out.println();
                   System.out.println("-----Truck: "+(count));
                   System.out.println(v);
                   System.out.println("Vehicle type: "+v.getClass().getSimpleName());
                   count ++;

                }

            }

        }
        
    } 
    public void displayCars() {
        
        if(ls.isEmpty()){
            System.out.println();
            System.out.println("=========== No registered cars ===============");
            System.out.println();
        }
        else{
            System.out.println();
            System.out.println("======= Cars List ===========");
            System.out.println();
            int count=1;
            for (Vehicle v : ls) {
                if (v instanceof Car) {
                    System.out.println();
                    System.out.println("-----car: " + (count));
                    System.out.println(v);
                    System.out.println("Vehicle type: " + v.getClass().getSimpleName());
                    count++;

                }
            }

        }
        
    }

    public void save(Scanner sc){
        
       

    }
    

    
}