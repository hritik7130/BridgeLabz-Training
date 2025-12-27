import java.util.ArrayList;

// Patient class
class Patient {
    String name;

    Patient(String name) {
        this.name = name;
    }
}

// Doctor class
class Doctor {
    String name;
    ArrayList<Patient> patients = new ArrayList<>();

    Doctor(String name) {
        this.name = name;
    }

    // Communication method
    void consult(Patient patient) {
        patients.add(patient);
        System.out.println("Dr. " + name + " is consulting patient " + patient.name);
    }
}

// Hospital class
class Hospital {
    String hospitalName;

    Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
    }
}

public class HospitalSystem {
    public static void main(String[] args) {

        Hospital hospital = new Hospital("City Hospital");

        Doctor d1 = new Doctor("Agarwal");
        Doctor d2 = new Doctor("Mehta");

        Patient p1 = new Patient("Rohit");
        Patient p2 = new Patient("Ankit");

        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);
    }
}