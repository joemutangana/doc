package hbs;

public class HotelBooking{

    int bookingId, numberOfNights, numberOfGuests;
    String customerName, roomType;
    double price;

    public HotelBooking(int bookingId, String customerName,String roomType, int numberOfNights, int numberOfGuests,double price){
        this.numberOfNights = numberOfNights;
        this.numberOfGuests=numberOfGuests;
        this.customerName=customerName;
        this.bookingId=bookingId;
        this.roomType=roomType;
        this.price=price;

    }

    public double calculateAmount(){
        return numberOfNights * price;
    }


    public double calculateDiscount(){

        if(numberOfNights >=25){
            return calculateAmount() * 0.25;
        }
        else if(numberOfNights >=15){
            return calculateAmount() * 0.15;
        }

        else if(numberOfNights >= 7){
            return calculateAmount() * 0.05;
        }
        else{
            return calculateAmount() * 0;
        }

    }

    public double calculateFinalAmount(){

        return calculateAmount() - calculateDiscount();
    }

    




    public void displayBooking(){
        System.out.println("\n-----------------------------");
        System.out.println("Booking Details");
        System.out.println("-----------------------------");
        System.out.println("BookingID: "+bookingId);
        System.out.println("Customer name: "+customerName);
        System.out.println("Room Type: "+roomType);
        System.out.println("Number of Nights: "+numberOfNights);
        System.out.println("Number of Guests: "+numberOfGuests);
        System.out.println("Original Amount: "+calculateAmount());
        System.out.println("Discounted Amount: "+calculateDiscount());
        System.out.println("Final Amount: "+calculateFinalAmount());

    }

    



}