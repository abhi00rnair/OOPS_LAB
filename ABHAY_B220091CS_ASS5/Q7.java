import java.util.*;


interface TaxCalculatable {
    double calculateTax();
}

abstract class Vehicle implements TaxCalculatable {
    protected String modelNumber;
    protected double rateBought;
    protected String fuelType;
    protected int numberOfWheels;

    public Vehicle(String modelNumber, double rateBought, String fuelType) {
        this.modelNumber = modelNumber;
        this.rateBought = rateBought;
        this.fuelType = fuelType;
    }

    public abstract   void displayDetails();
}

class Car extends Vehicle {
    private int numberOfPassengers;

    public Car(String modelNumber, double rateBought, String fuelType, int numberOfPassengers) {
        super(modelNumber, rateBought, fuelType);
        this.numberOfPassengers = numberOfPassengers;
        this.numberOfWheels = 4;  
    }

    @Override
    public double calculateTax() {
        double taxRate = (fuelType.equalsIgnoreCase("petrol")) ? 0.5 : 0.4;
        return (rateBought * 0.1 * numberOfPassengers) * taxRate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Car Model: " + modelNumber + ", Rate Bought: " + rateBought 
                + ", Fuel Type: " + fuelType + ", Passengers: " + numberOfPassengers 
                + ", Tax: " + calculateTax());
    }
}

class Truck extends Vehicle {
    private double loadLimit;

    public Truck(String modelNumber, double rateBought, String fuelType, double loadLimit) {
        super(modelNumber, rateBought, fuelType);
        this.loadLimit = loadLimit;
        this.numberOfWheels = 6;
    }

    @Override
    public double calculateTax() {
        double taxRate = (fuelType.equalsIgnoreCase("petrol")) ? 0.5 : 0.4;
        return (rateBought * 0.1 * loadLimit * 0.002) * taxRate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Truck Model: " + modelNumber + ", Rate Bought: " + rateBought 
                + ", Fuel Type: " + fuelType + ", Load Limit: " + loadLimit 
                + ", Tax: " + calculateTax());
    }
}

public class Q7{
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("CarModelA", 500000, "petrol", 4));
        vehicles.add(new Car("CarModelB", 400000, "diesel", 5));
        vehicles.add(new Truck("TruckModelA", 1000000, "petrol", 10));
        vehicles.add(new Truck("TruckModelB", 1200000, "diesel", 15));

        Collections.sort(vehicles, (v1, v2) -> Double.compare(v2.calculateTax(), v1.calculateTax()));

        for (Vehicle vehicle : vehicles) {
            vehicle.displayDetails();
        }
    }
}
