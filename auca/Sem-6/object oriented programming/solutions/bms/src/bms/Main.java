package bms;
import java.util.Scanner;

public class  Main{

    static Bus[] buses;
    static Driver[] drivers;
    static Route[] routes;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Main grobal Attributes
        int choice;
        System.out.println("===================================");
        System.out.println("      Bus Management System");
        System.out.println("===================================");
        do{
            System.out.println("");
            System.out.println("1. Register Bus");
            System.out.println("2. Register Driver");
            System.out.println("3. Register Route");
            System.out.println("4. ");
            System.out.println("5. ");
            System.out.println("9. View All Buses");
            System.out.println("22. Exit");
            System.out.println("");
            System.out.print("Select an option <: ");
            choice = isInt(sc);
            switch(choice){
                case 1:
                    registerBus(sc);
                    
                   break;
                case 2:
                    registerDriver(sc);
                    break;
                case 3:
                    registerRoute(sc);
                    break;
                case 9:
                    if((buses != null)){

                        System.out.println("-----------------------------");
                        System.out.println("      " + (buses.length) + " Bus(es) Regitered");
                        System.out.println("-----------------------------");

                    }
                    else{
                        System.out.println("-----------------------------");
                        System.out.println("      Regitered buses");
                        System.out.println("-----------------------------");

                    }
                   
                    
                    viewBus(buses);
                    break;
                case 22:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("\nWrong choice! Try again: ");
                    break;
            }
           
            

            
        }while(choice !=22);
       
    }

    public static String handleName(Scanner sc){
        while(true){
            String name;
            name=handleBlank(sc, sc.nextLine());
            if(name.matches("[\\p{L} `\\-]+")){
                return name;
            }
            System.out.print("ERROR: Name can't have numeric value. Try again: ");
        }
    }

    public static String handleBlank(Scanner sc,String userInput){
        while(userInput.isBlank()){
            System.out.print("ERROR: Value can't be blank. Try again: ");
            userInput=sc.nextLine();
        }
        return userInput;
    }

    public static int handleNegative(Scanner sc, int userInput){
        while(userInput <= 0){
            System.out.print("ERROR: Value must be positive. Try again: ");
            userInput = isInt(sc);
        }         
        return userInput;
      
    }

    public static double handleNegativeDouble(Scanner sc, double userInput){
        while(userInput<0){
            System.out.print("ERROR: Value must be above 0. Try again: ");
            userInput=handleDouble(sc);
        }
        return userInput;
    }

    public static int isInt(Scanner sc){

        while (true) {
            try {
                return Integer.parseInt(sc.nextLine());

            } catch (NumberFormatException e) {
                System.out.print("ERROR: Enter an integer. Try again: ");

            }
        }

    }

    public static double handleDouble(Scanner sc){
        while(true){
            try{
                return Double.parseDouble(sc.nextLine());
            }
            catch(NumberFormatException e){
                System.out.print("ERROR: Enter valid value. Try again: ");
            }
        }
    }

    public static void viewBus(Bus[] busList){
        if(busList == null){
            System.out.println("Oops! No buses available.");
            System.out.println("-----------------------------");
        }
        else{
           
            for (int i = 0; i < busList.length; i++) {
                System.out.println((i+1)+". "+busList[i].getbusName());
            }
            System.out.println("-----------------------------");

        }
       

    }

    public static void registerBus(Scanner sc){
        int busId;
        String busName;
        String busNumber;
        int seatCapacity;
        String busStatus;
        int numberOfBuses;

        System.out.print("How many buses to register?: ");
       
        numberOfBuses = handleNegative(sc, isInt(sc));
        
        buses = new Bus[numberOfBuses];

        for (int i = 0; i < numberOfBuses; i++) {
            System.out.println("\n(" + i + "/" + numberOfBuses + ") Buses Registered");
            System.out.println("Enter details for bus " + (i + 1));
            System.out.print("Enter bus ID: ");
            busId = handleNegative(sc, isInt(sc));
            System.out.print("Enter bus Name: ");
            busName = handleBlank(sc, sc.nextLine());
            System.out.print("Enter bus plate number: ");
            busNumber = handleBlank(sc, sc.nextLine());
            System.out.print("Enter seat capacity: ");
            seatCapacity = handleNegative(sc, isInt(sc));
            System.out.print("Enter bus status: ");
            busStatus = handleBlank(sc, sc.nextLine());
            
            buses[i] = new Bus(busId, busName, busNumber, seatCapacity, busStatus);

        }
        System.out.println("Bus registrtion done");

    }


    public static void registerDriver(Scanner sc){
        int driverId;
        String driverName;
        String licenseNumber;
        int driverAge;
        String driverPhone;
        int numberOfDrivers;

        System.out.print("How many Drivers to register?: ");
        numberOfDrivers = handleNegative(sc, isInt(sc));
        drivers = new Driver[numberOfDrivers];

        for (int i = 0; i < numberOfDrivers; i++) {
            System.out.println("\n(" + i + "/" + numberOfDrivers + ") drivers Registered");
            System.out.println("Enter details for driver " + (i + 1));
            System.out.print("Enter drive ID: ");
            driverId = handleNegative(sc, isInt(sc));
            System.out.print("Enter driver Name: ");
            driverName = handleBlank(sc, sc.nextLine());
            System.out.print("Enter driver phone number: ");
            driverPhone = handleBlank(sc, sc.nextLine());
            System.out.print("Enter license number: ");
            licenseNumber = handleBlank(sc, sc.nextLine());
            System.out.print("Enter driver age: ");
            driverAge = handleNegative(sc, isInt(sc));
            drivers[i] = new Driver(driverId, driverName, licenseNumber, driverAge, driverPhone);

        }
        System.out.println("Driver registrtion done!");
    } 

    public static void registerRoute(Scanner sc) {
        int routeId;
        String departureLocation;
        String destinationLocation;
        double distance;
        double ticketPrice;
        int numberOfRoutes;

        System.out.print("How many routes to register?: ");
        numberOfRoutes = handleNegative(sc, isInt(sc));
        routes = new Route[numberOfRoutes];

        for (int i = 0; i < numberOfRoutes; i++) {
            System.out.println("\n(" + i + "/" + numberOfRoutes + ") Routes registered");
            System.out.println("Enter details for route " + (i + 1));
            System.out.print("Enter route ID: ");
            routeId = handleNegative(sc, isInt(sc));
            System.out.print("Enter departure location: ");
            departureLocation = handleBlank(sc, sc.nextLine());
            System.out.print("Enter destination location: ");
            destinationLocation = handleBlank(sc, sc.nextLine());
            System.out.print("Enter distance: ");
            distance = handleNegativeDouble(sc, handleDouble(sc));
            System.out.print("Enter ticket price: ");
            ticketPrice = handleNegativeDouble(sc, handleDouble(sc));
            routes[i] = new Route(routeId, departureLocation, destinationLocation, distance, ticketPrice);

        }
        System.out.println("Routes registrtion done!");
    }
}