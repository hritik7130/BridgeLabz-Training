import java.util.*;

// Interface
interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}

// Abstract class
abstract class Employee {
    private int employeeId;
    private String name;
    protected double baseSalary;
    protected String department;

    Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Encapsulation (getters)
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    // Abstract method
    abstract double calculateSalary();

    // Concrete method
    void displayDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + calculateSalary());
    }
}

// Full-time employee
class FullTimeEmployee extends Employee implements Department {

    FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    double calculateSalary() {
        return baseSalary;
    }

    public void assignDepartment(String dept) {
        department = dept;
    }

    public String getDepartmentDetails() {
        return department;
    }
}

// Part-time employee
class PartTimeEmployee extends Employee implements Department {
    int hoursWorked;
    double hourlyRate;

    PartTimeEmployee(int id, String name, int hours, double rate) {
        super(id, name, 0);
        this.hoursWorked = hours;
        this.hourlyRate = rate;
    }

    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    public void assignDepartment(String dept) {
        department = dept;
    }

    public String getDepartmentDetails() {
        return department;
    }
}

class EmployeeSystem {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        Employee e1 = new FullTimeEmployee(101, "Tanishq", 60000);
        Employee e2 = new PartTimeEmployee(102, "Rahul", 80, 300);

        ((Department)e1).assignDepartment("IT");
        ((Department)e2).assignDepartment("Support");

        employees.add(e1);
        employees.add(e2);

        for (Employee e : employees) {
            e.displayDetails();
            System.out.println();
        }
    }
}