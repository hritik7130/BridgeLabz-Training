import java.util.*;

// Main class
public class UserInterface {

    // =========================
    // Vessel (Model Class)
    // =========================
    static class Vessel {

        private String vesselId;
        private String vesselName;
        private double averageSpeed;
        private String vesselType;

        public Vessel() {}

        public Vessel(String vesselId, String vesselName, double averageSpeed, String vesselType) {
            this.vesselId = vesselId;
            this.vesselName = vesselName;
            this.averageSpeed = averageSpeed;
            this.vesselType = vesselType;
        }

        public String getVesselId() { return vesselId; }
        public String getVesselName() { return vesselName; }
        public double getAverageSpeed() { return averageSpeed; }
        public String getVesselType() { return vesselType; }
    }

    // =========================
    // VesselUtil (Logic Class)
    // =========================
    static class VesselUtil {

        private List<Vessel> vesselList = new ArrayList<>();

        // Requirement 1
        public void addVesselPerformance(Vessel vessel) {
            vesselList.add(vessel);
        }

        // Requirement 2
        public Vessel getVesselById(String vesselId) {
            for (Vessel v : vesselList) {
                if (v.getVesselId().equals(vesselId)) {
                    return v;
                }
            }
            return null;
        }

        // Requirement 3
        public List<Vessel> getHighPerformanceVessels() {

            List<Vessel> result = new ArrayList<>();
            if (vesselList.isEmpty()) return result;

            double maxSpeed = 0;

            for (Vessel v : vesselList) {
                maxSpeed = Math.max(maxSpeed, v.getAverageSpeed());
            }

            for (Vessel v : vesselList) {
                if (v.getAverageSpeed() == maxSpeed) {
                    result.add(v);
                }
            }

            return result;
        }
    }

    // =========================
    // MAIN METHOD
    // =========================
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        VesselUtil util = new VesselUtil();

        System.out.println("Enter the number of vessels to be added");
        int n = Integer.parseInt(sc.nextLine());

        System.out.println("Enter vessel details");

        for (int i = 0; i < n; i++) {

            String[] parts = sc.nextLine().split(":");

            Vessel vessel = new Vessel(
                    parts[0],
                    parts[1],
                    Double.parseDouble(parts[2]),
                    parts[3]
            );

            util.addVesselPerformance(vessel);
        }

        System.out.println("Enter the Vessel Id to check speed");
        String id = sc.nextLine();

        Vessel found = util.getVesselById(id);

        if (found != null) {
            System.out.println(found.getVesselId() + " | " +
                    found.getVesselName() + " | " +
                    found.getVesselType() + " | " +
                    found.getAverageSpeed() + " knots");
        } else {
            System.out.println("Vessel Id " + id + " not found");
        }

        System.out.println("High performance vessels are");

        for (Vessel v : util.getHighPerformanceVessels()) {
            System.out.println(v.getVesselId() + " | " +
                    v.getVesselName() + " | " +
                    v.getVesselType() + " | " +
                    v.getAverageSpeed() + " knots");
        }

        sc.close();
    }
}
