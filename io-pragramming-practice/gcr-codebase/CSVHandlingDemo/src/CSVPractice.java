import java.io.*;
import java.util.*;

public class CSVPractice {

    public static void main(String[] args) {

        readCSV();
        writeCSV();
        countRows();
    }

    // Read CSV and Print Data
    public static void readCSV() {
        System.out.println("---- Reading Student CSV File ----");

        String fileName = "students.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;
            boolean isHeader = true;

            while ((line = br.readLine()) != null) {

                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                String[] data = line.split(",");

                System.out.println(
                        "ID: " + data[0] +
                        ", Name: " + data[1] +
                        ", Age: " + data[2] +
                        ", Marks: " + data[3]
                );
            }

        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }

    //  Write Data to CSV File
    public static void writeCSV() {
        System.out.println("\n---- Writing Employee CSV File ----");

        String fileName = "employees.csv";

        try (FileWriter fw = new FileWriter(fileName)) {

            fw.write("ID,Name,Department,Salary\n");
            fw.write("1,Ravi,IT,50000\n");
            fw.write("2,Sneha,HR,45000\n");
            fw.write("3,Amit,Finance,60000\n");
            fw.write("4,Neha,Marketing,48000\n");
            fw.write("5,Rahul,Sales,52000\n");

            System.out.println("Employee data written successfully.");

        } catch (IOException e) {
            System.out.println("Error writing file");
        }
    }

    // Read and Count Rows
    public static void countRows() {
        System.out.println("\n---- Counting Records in Student CSV ----");

        String fileName = "students.csv";
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            br.readLine(); // skip header

            while (br.readLine() != null) {
                count++;
            }

            System.out.println("Total records (excluding header): " + count);

        } catch (IOException e) {
            System.out.println("Error counting rows");
        }
    }
}

