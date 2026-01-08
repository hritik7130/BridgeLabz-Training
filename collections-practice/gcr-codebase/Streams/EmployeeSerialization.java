import java.io.*;
import java.util.*;

class Employee implements Serializable {
    int id;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String dept, double salary) {
        this.id = id;
        this.name = name;
        this.department = dept;
        this.salary = salary;
    }

    public String toString() {
        return id + " " + name + " " + department + " " + salary;
    }
}

public class EmployeeSerialization {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Amit", "IT", 60000));
        employees.add(new Employee(2, "Neha", "HR", 50000));

        serialize(employees);
        deserialize();
    }

    static void serialize(List<Employee> list) {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream("employees.ser"))) {
            oos.writeObject(list);
            System.out.println("Employees serialized.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void deserialize() {
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream("employees.ser"))) {
            List<Employee> list = (List<Employee>) ois.readObject();
            for (Employee e : list) {
                System.out.println(e);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}