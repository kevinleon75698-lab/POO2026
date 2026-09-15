public class Vehicle {
 
    public enum PlateRegistrationResult {
        ACCEPTED,
        ACCEPTED_WITH_NORMALIZATION,
        REJECTED
    }
 
    private static final int SPEED_INCREMENT = 10;
 
    private String licensePlate;
    private final String brand;
    private int currentSpeed;
    private final int maximumSpeed;
 
    public Vehicle(String brand, int maximumSpeed) {
        this.brand = brand;
        this.maximumSpeed = maximumSpeed;
        this.currentSpeed = 0;
        this.licensePlate = "";
    }
 
    public String getLicensePlate() {
        return licensePlate;
    }
 
    public String getBrand() {
        return brand;
    }
 
    public int getCurrentSpeed() {
        return currentSpeed;
    }
 
    public int getMaximumSpeed() {
        return maximumSpeed;
    }
 
    public PlateRegistrationResult setLicensePlate(String plate) {
        if (plate == null) {
            return PlateRegistrationResult.REJECTED;
        }
 
        String normalized = plate.toUpperCase();
 
        if (!normalized.matches("[A-Z]{3}[0-9]{3}")) {
            return PlateRegistrationResult.REJECTED;
        }
 
        boolean wasNormalized = !normalized.equals(plate);
        this.licensePlate = normalized;
 
        return wasNormalized
                ? PlateRegistrationResult.ACCEPTED_WITH_NORMALIZATION
                : PlateRegistrationResult.ACCEPTED;
    }
 
    public boolean increaseSpeed() {
        if (currentSpeed + SPEED_INCREMENT <= maximumSpeed) {
            currentSpeed += SPEED_INCREMENT;
            return true;
        }
        return false;
    }
 
    public boolean decreaseSpeed() {
        if (currentSpeed - SPEED_INCREMENT >= 0) {
            currentSpeed -= SPEED_INCREMENT;
            return true;
        }
        return false;
    }
}