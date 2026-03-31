import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FilterStudents {

    public static void main(String[] args) {

        String fileName = "students.csv";

        System.out.println("Students who scored more than 80:");

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;
            br.readLine(); // skip header

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                int marks = Integer.parseInt(data[3]);

                if (marks > 80) {
                    System.out.println(
                            "ID: " + data[0] +
                            ", Name: " + data[1] +
                            ", Age: " + data[2] +
                            ", Marks: " + data[3]
                    );
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading CSV file");
        }
    }
}
