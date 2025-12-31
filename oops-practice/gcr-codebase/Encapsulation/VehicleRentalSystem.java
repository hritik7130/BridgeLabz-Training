import java.util.*;

// Interface
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

// Abstract class
abstract class Vehicle {
    private String vehicleNumber;
    protected double rentalRate;

    Vehicle(String vehicleNumber, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.rentalRate = rentalRate;
    }

    abstract double calculateRentalCost(int days);
}

// Car
class Car extends Vehicle implements Insurable {

    Car(String number, double rate) {
        super(number, rate);
    }

    double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    public double calculateInsurance() {
        return 500;
    }

    public String getInsuranceDetails() {
        return "Car Insurance";
    }
}

// Bike
class Bike extends Vehicle {

    Bike(String number, double rate) {
        super(number, rate);
    }

    double calculateRentalCost(int days) {
        return rentalRate * days;
    }
}

// Truck
class Truck extends Vehicle implements Insurable {

    Truck(String number, double rate) {
        super(number, rate);
    }

    double calculateRentalCost(int days) {
        return rentalRate * days * 1.2;
    }

    public double calculateInsurance() {
        return 1000;
    }

    public String getInsuranceDetails() {
        return "Truck Insurance";
    }
}

class VehicleRentalSystem {
    public static void main(String[] args) {

        List<Vehicle> vehicles = List.of(
                new Car("CAR101", 1500),
                new Bike("BIKE202", 500),
                new Truck("TRK303", 3000)
        );

        for (Vehicle v : vehicles) {
            System.out.println("Rental Cost: " + v.calculateRentalCost(3));
            if (v instanceof Insurable) {
                System.out.println("Insurance: " + ((Insurable)v).calculateInsurance());
            }
            System.out.println();
        }
    }
}