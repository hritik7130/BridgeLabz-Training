public class StudentsGrades {

    String name;
    String rollNumber;
    double[] marks;

    // Constructor
    StudentsGrades(String name, String rollNumber, double[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

  
    public double calculateTotalMarks(double[] marks) {
        double sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        return sum / marks.length;
    }

    // Method to calculate grade
    public String calculateGrade(double[] marks) {
        double average = calculateTotalMarks(marks);

        if (average >= 80 && average <= 100) {
            return "Grade A";
        } else if (average >= 60 && average < 80) {
            return "Grade B";
        } else if (average >= 50 && average < 60) {
            return "Grade C";
        } else if (average >= 40 && average < 50) {
            return "Grade D";
        } else {
            return "Grade F";
        }
    }

  
    public void displayStudent() {

        System.out.println("Student Name: " + name);
        System.out.println("Student RollNumber: " + rollNumber);
        System.out.println("Student Marks:");

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Mark" + (i + 1) + ": " + marks[i]);
        }

        System.out.println(calculateGrade(marks));
    }

 
    public static void main(String[] args) {

        double[] mark1 = {80, 70, 75};
        double[] mark2 = {60, 65, 50};

        StudentsGrades student1 = new StudentsGrades("Thamarai", "ECE001", mark1);
        StudentsGrades student2 = new StudentsGrades("Kannan", "CSC002", mark2);

        student1.displayStudent();
        student2.displayStudent();
    }
}