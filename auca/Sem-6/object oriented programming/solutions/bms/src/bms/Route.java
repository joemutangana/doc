package bms;

public class Route {
    
    private int routeId;
    private String departureLocation;
    private String destinationLocation;
    private double distance;
    private double ticketPrice;


    public Route(int routeId, String departureLocation, String destinationLocation, double distance,
            double ticketPrice) {
        this.routeId = routeId;
        this.departureLocation = departureLocation;
        this.destinationLocation = destinationLocation;
        this.distance = distance;
        this.ticketPrice = ticketPrice;
    }


    public int getRouteId() {
        return routeId;
    }


    public void setRouteId(int routeId) {
        this.routeId = routeId;
    }


    public String getDepartureLocation() {
        return departureLocation;
    }


    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }


    public String getDestinationLocation() {
        return destinationLocation;
    }


    public void setDestinationLocation(String destinationLocation) {
        this.destinationLocation = destinationLocation;
    }


    public double getDistance() {
        return distance;
    }


    public void setDistance(double distance) {
        this.distance = distance;
    }


    public double getTicketPrice() {
        return ticketPrice;
    }


    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }


    @Override
    public String toString() {
        return "Route [routeId=" + routeId + ", departureLocation=" + departureLocation + ", destinationLocation="
                + destinationLocation + ", distance=" + distance + ", ticketPrice=" + ticketPrice + "]";
    }

    
    
    
}
