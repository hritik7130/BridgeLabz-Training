import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UpdateSalary {

    public static void main(String[] args) {

        String inputFile = "employess.csv";
        String outputFile = "updated_employees.csv";

        try (
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            FileWriter fw = new FileWriter(outputFile)
        ) {

            String line;

            // Read and write header
            line = br.readLine();
            fw.write(line + "\n");

            // Process remaining records
            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                String department = data[2];
                double salary = Double.parseDouble(data[3]);

                if (department.equalsIgnoreCase("IT")) {
                    salary = salary + (salary * 0.10);
                }

                data[3] = String.valueOf((int) salary);

                fw.write(String.join(",", data) + "\n");
            }

            System.out.println("Updated CSV file created successfully.");

        } catch (IOException e) {
            System.out.println("Error updating CSV file");
        }
    }
}

