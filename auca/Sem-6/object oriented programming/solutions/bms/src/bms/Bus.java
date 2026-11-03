package bms;
public class Bus{

    private int busId;
    private String busName;
    private String busNumber;
    private int seatCapacity;
    private String busStatus;

    public Bus(int busId, String busName, String busNumber, int seatCapacity, String busStatus) {
        this.busId = busId;
        this.busName = busName;
        this.busNumber = busNumber;
        this.seatCapacity = seatCapacity;
        this.busStatus = busStatus;
    }

    public int getBusId() {
        return busId;
    }

    public void setBusId(int busId) {
        this.busId = busId;
    }

    public String getbusName() {
        return busName;
    }

    public void setbusName(String busName) {
        this.busName = busName;
    }

    public String getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }

    public void setSeatCapacity(int seatCapacity) {
        this.seatCapacity = seatCapacity;
    }

    public String getBusStatus() {
        return busStatus;
    }

    public void setBusStatus(String busStatus) {
        this.busStatus = busStatus;
    }

    @Override
    public String toString() {
        return "\nBus Id=" + busId + "\nBus Name=" + busName + "\nBus Number=" + busNumber + "\nSeat Capacity="
                + seatCapacity + "\nBus Status=" + busStatus;
    }

    



    

}