class Employee {

    // Static variables
    static String companyName = "Tech Solutions Pvt Ltd";
    private static int totalEmployees = 0;

    // Instance variables
    String name;
    final int id;           // final variable
    String designation;

    // Constructor using this keyword
    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    // Static method
    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Method to display employee details
    void displayDetails(Object obj) {
        if (obj instanceof Employee) {
            System.out.println("Company Name: " + companyName);
            System.out.println("Employee Name: " + name);
            System.out.println("Employee ID: " + id);
            System.out.println("Designation: " + designation);
        } else {
            System.out.println("Invalid Employee Object");
        }
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Tanishq Gupta", 1001, "Software Engineer");
        Employee emp2 = new Employee("Divyanshu Mishra", 1002, "Data Analyst");

        emp1.displayDetails(emp1);
        System.out.println();
        emp2.displayDetails(emp2);

        System.out.println();
        Employee.displayTotalEmployees();
    }
}