import java.util.*;
import java.util.stream.*;

class Employee {
    String name;
    String department;
    double salary;

    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    String getDepartment() {
        return department;
    }

    double getSalary() {
        return salary;
    }
}

public class EmployeeSalary {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
            new Employee("A", "IT", 50000),
            new Employee("B", "HR", 40000),
            new Employee("C", "IT", 60000)
        );

        Map<String, Double> avgSalaryByDept =
            employees.stream()
                     .collect(Collectors.groupingBy(
                         Employee::getDepartment,
                         Collectors.averagingDouble(Employee::getSalary)
                     ));

        System.out.println(avgSalaryByDept);
    }
}
