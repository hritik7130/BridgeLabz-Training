import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class EmployeeSearch {

    public static void main(String[] args) {

        String fileName = "employess.csv";
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name to search: ");
        String searchName = sc.nextLine();

        boolean found = false;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;
            br.readLine(); // skip header

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                String name = data[1];

                if (name.equalsIgnoreCase(searchName)) {
                    System.out.println("Employee Found!");
                    System.out.println("Department: " + data[2]);
                    System.out.println("Salary: " + data[3]);
                    found = true;
                    break;
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading CSV file");
        }

        if (!found) {
            System.out.println("Employee not found");
        }

        sc.close();
    }
}

