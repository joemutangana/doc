package bms;

public class Driver {
    private int driverId;
    private String driverName;
    private String licenseNumber;
    private int driverAge;
    private String driverPhone;
    
    public Driver(int driverId, String driverName, String licenseNumber, int driverAge, String driverPhone) {
        this.driverId = driverId;
        this.driverName = driverName;
        this.licenseNumber = licenseNumber;
        this.driverAge = driverAge;
        this.driverPhone = driverPhone;
    }
    public int getDriverId() {
        return driverId;
    }
    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }
    public String getDriverName() {
        return driverName;
    }
    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }
    public String getLicenseNumber() {
        return licenseNumber;
    }
    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }
    public int getDriverAge() {
        return driverAge;
    }
    public void setDriverAge(int driverAge) {
        this.driverAge = driverAge;
    }
    public String getDriverPhone() {
        return driverPhone;
    }
    public void setDriverPhone(String driverPhone) {
        this.driverPhone = driverPhone;
    }
    @Override
    public String toString() {
        return "\nDriver Id=" + driverId + "\nDriver Name=" + driverName + "\nLicense Number=" + licenseNumber
                + "\nDriver Age=" + driverAge + "\nDriverPhone=" + driverPhone;
    }

    
    
}
