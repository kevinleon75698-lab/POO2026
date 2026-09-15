public class Thermometer {
    private static final double MIN_TEMPERATURE = -50.0;
    private static final double MAX_TEMPERATURE = 100.0;
 
    private double temperature;
 
    public Thermometer() {
        this.temperature = 0.0;
    }
 
    public Thermometer(double initialTemperature) {
        this.temperature = isValidTemperature(initialTemperature) ? initialTemperature : 0.0;
    }
 
    public double getTemperature() {
        return temperature;
    }
 
    public boolean setTemperature(double newTemperature) {
        if (isValidTemperature(newTemperature)) {
            this.temperature = newTemperature;
            return true;
        }
        return false;
    }
 
    private boolean isValidTemperature(double value) {
        return value >= MIN_TEMPERATURE && value <= MAX_TEMPERATURE;
    }
}