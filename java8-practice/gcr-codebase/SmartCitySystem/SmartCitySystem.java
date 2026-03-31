import java.util.Scanner;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

interface TransportService {
    String getName();
    double getFare();
    String getRoute();
    LocalTime getDepartureTime();

    default void printServiceDetails() {
        System.out.println(getName() + " | Route: " + getRoute() + " | Fare: " + getFare() + " | Time: " + getDepartureTime());
    }
}

interface GeoUtils {
    static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}

@FunctionalInterface
interface FareCalculator {
    double calculateFare(double distance);
}

interface EmergencyService { }

class BusService implements TransportService {
    public String getName() { return "Bus"; }
    public double getFare() { return 20; }
    public String getRoute() { return "A-B"; }
    public LocalTime getDepartureTime() { return LocalTime.of(9, 30); }
}

class MetroService implements TransportService {
    public String getName() { return "Metro"; }
    public double getFare() { return 40; }
    public String getRoute() { return "A-C"; }
    public LocalTime getDepartureTime() { return LocalTime.of(9, 0); }
}

class TaxiService implements TransportService {
    public String getName() { return "Taxi"; }
    public double getFare() { return 80; }
    public String getRoute() { return "B-C"; }
    public LocalTime getDepartureTime() { return LocalTime.of(9, 15); }
}

class AmbulanceService implements TransportService, EmergencyService {
    public String getName() { return "Ambulance"; }
    public double getFare() { return 0; }
    public String getRoute() { return "Emergency"; }
    public LocalTime getDepartureTime() { return LocalTime.now(); }
}

public class SmartCitySystem {
    public static void main(String[] args) {

        List<TransportService> services = Arrays.asList(
                new BusService(),
                new MetroService(),
                new TaxiService(),
                new AmbulanceService()
        );

        System.out.println("Filtered & Sorted Services:");
        services.stream()
                .filter(s -> s.getFare() <= 50)
                .sorted(Comparator.comparing(TransportService::getDepartureTime))
                .forEach(TransportService::printServiceDetails);

        FareCalculator calculator = d -> d * 5;
        double distance = GeoUtils.calculateDistance(0, 0, 6, 8);
        System.out.println("\nCalculated Fare: " + calculator.calculateFare(distance));

        System.out.println("\nLive Dashboard:");
        services.forEach(System.out::println);

        Map<String, List<TransportService>> groupedByRoute =
                services.stream().collect(Collectors.groupingBy(TransportService::getRoute));

        System.out.println("\nGrouped By Route: " + groupedByRoute.keySet());

        DoubleSummaryStatistics stats =
                services.stream().collect(Collectors.summarizingDouble(TransportService::getFare));

        System.out.println("\nRevenue Summary:");
        System.out.println("Total: " + stats.getSum());
        System.out.println("Average: " + stats.getAverage());

        System.out.println("\nEmergency Services:");
        services.stream()
                .filter(s -> s instanceof EmergencyService)
                .forEach(s -> System.out.println(s.getName()));
    }
}