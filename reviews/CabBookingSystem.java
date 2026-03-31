import java.util.*;

public class CabBookingSystem {


    interface FareCalculator {
        double calculateFare(double distance);
    }

   
    class NormalFare implements FareCalculator {
        public double calculateFare(double distance) {
            return distance * 10;
        }
    }


    class PeakFare implements FareCalculator {
        public double calculateFare(double distance) {
            return distance * 15;
        }
    }

 
    class User {
        int userId;
        String name;

        User(int userId, String name) {
            this.userId = userId;
            this.name = name;
        }
    }


    class Driver {
        int driverId;
        String name;
        boolean available = true;

        Driver(int driverId, String name) {
            this.driverId = driverId;
            this.name = name;
        }
    }

  
    class Ride {
        int rideId;
        User user;
        Driver driver;
        double distance;
        double fare;

        Ride(int rideId, User user, Driver driver, double distance, double fare) {
            this.rideId = rideId;
            this.user = user;
            this.driver = driver;
            this.distance = distance;
            this.fare = fare;
        }
    }

   
    class NoDriverAvailableException extends Exception {
        NoDriverAvailableException(String msg) {
            super(msg);
        }
    }

  
    Queue<Driver> driverQueue = new LinkedList<>();
    Map<Integer, Ride> rideHistory = new HashMap<>();
    int rideCounter = 1;

  
    void addDriver(Driver driver) {
        driverQueue.offer(driver);
    }

   
    Ride bookRide(User user, double distance, FareCalculator fareCalculator)
            throws NoDriverAvailableException {

        if (driverQueue.isEmpty()) {
            throw new NoDriverAvailableException("No drivers available");
        }

        Driver driver = driverQueue.poll();
        driver.available = false;

        double fare = fareCalculator.calculateFare(distance);
        Ride ride = new Ride(rideCounter++, user, driver, distance, fare);

        rideHistory.put(ride.rideId, ride);
        return ride;
    }
    void displayRide(){
        if(rideHistory.isEmpty()){
            System.out.println("No ride is book");
            return;

        }
        for (Ride ride : rideHistory.values()) {
            System.out.println(
                    "Ride ID   : " + ride.rideId +
                    "\nUser      : " + ride.user.name +
                    "\nDriver    : " + ride.driver.name +
                    "\nDistance  : " + ride.distance + " km" +
                    "\nFare      : ₹" + ride.fare +
                    "\n"
            );
        }

    }
    

   

  


    
    public static void main(String[] args) {

        CabBookingSystem system = new CabBookingSystem();

        system.addDriver(system.new Driver(1, "Ravi"));
        system.addDriver(system.new Driver(2, "Amit"));

        User user = system.new User(101, "Hritik");

    }}
 
    