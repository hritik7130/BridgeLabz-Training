import java.util.ArrayList;

// Faculty class (independent)
class Faculty {
    String name;

    Faculty(String name) {
        this.name = name;
    }
}

// Department class (dependent on University)
class Department {
    String deptName;

    Department(String deptName) {
        this.deptName = deptName;
    }
}

// University class
class University {
    String universityName;
    ArrayList<Department> departments = new ArrayList<>();
    ArrayList<Faculty> faculties = new ArrayList<>();

    University(String universityName) {
        this.universityName = universityName;
    }

    void addDepartment(Department dept) {
        departments.add(dept);
    }

    void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    // Simulating deletion of university
    void deleteUniversity() {
        departments.clear();  // departments destroyed
        System.out.println("University deleted along with its departments");
    }
}

public class UniversitySystem {
    public static void main(String[] args) {

        University uni = new University("ABC University");

        Department d1 = new Department("Computer Science");
        Department d2 = new Department("Mechanical");

        Faculty f1 = new Faculty("Dr. Sharma");
        Faculty f2 = new Faculty("Dr. Verma");

        uni.addDepartment(d1);
        uni.addDepartment(d2);

        uni.addFaculty(f1);
        uni.addFaculty(f2);

        uni.deleteUniversity();

        // Faculty still exists independently
        System.out.println("Faculty still exists: " + f1.name);
    }
}