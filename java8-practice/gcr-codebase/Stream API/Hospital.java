import java.util.*;

class Doctor {
    String name;
    String specialty;
    boolean availableOnWeekend;

    Doctor(String name, String specialty, boolean availableOnWeekend) {
        this.name = name;
        this.specialty = specialty;
        this.availableOnWeekend = availableOnWeekend;
    }
}

public class Hospital {
    public static void main(String[] args) {

        List<Doctor> doctors = Arrays.asList(
            new Doctor("Dr. A", "Cardiology", true),
            new Doctor("Dr. B", "Neurology", false),
            new Doctor("Dr. C", "Dermatology", true)
        );

        doctors.stream()
               .filter(d -> d.availableOnWeekend)     // weekend available
               .sorted(Comparator.comparing(d -> d.specialty)) // sort by specialty
               .forEach(d -> System.out.println(d.name + " - " + d.specialty));
    }
}
