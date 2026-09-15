public class TestVehicle {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Mazda", 120);

        System.out.println("Marca: " + vehicle.getBrand());
        System.out.println("Velocidad maxima: " + vehicle.getMaximumSpeed());
        System.out.println("Velocidad actual: " + vehicle.getCurrentSpeed());

        System.out.println("\n--- Registro de placa ---");
        reportPlate("abc123", vehicle.setLicensePlate("abc123"));
        System.out.println("Placa almacenada: " + vehicle.getLicensePlate());

        reportPlate("XYZ9AB", vehicle.setLicensePlate("XYZ9AB"));
        System.out.println("Placa almacenada: " + vehicle.getLicensePlate());

        reportPlate("ABC456", vehicle.setLicensePlate("ABC456"));
        System.out.println("Placa almacenada: " + vehicle.getLicensePlate());

        System.out.println("\n--- Aumentar velocidad hasta el limite ---");
        for (int i = 0; i < 13; i++) {
            boolean increased = vehicle.increaseSpeed();
            System.out.println("Aumentar velocidad: " + (increased ? "OK" : "RECHAZADO")
                    + " -> " + vehicle.getCurrentSpeed() + " km/h");
        }

        System.out.println("\n--- Disminuir velocidad con vehiculo detenido ---");
        Vehicle stoppedVehicle = new Vehicle("Renault", 100);
        boolean decreased = stoppedVehicle.decreaseSpeed();
        System.out.println("Disminuir velocidad: " + (decreased ? "OK" : "RECHAZADO"));
    }

    private static void reportPlate(String attempted, Vehicle.PlateRegistrationResult result) {
        System.out.println("Placa '" + attempted + "': " + result);
    }
}