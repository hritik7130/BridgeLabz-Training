public class CourseDemo {

    public static void main(String[] args) {

        Course c1 = new Course("Java Full Stack", "6 Months", 45000);
        Course c2 = new Course("Data Science", "8 Months", 60000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        System.out.println();

        Course.updateInstituteName("BridgeLabz");

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}

class Course {

   
    String courseName;
    String duration;
    double fee;


    static String instituteName = "ABC Institute";

    // Constructor
    Course(String courseName, String duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    
    void displayCourseDetails() {
        System.out.println(
            courseName + " | " + duration + " | " + fee + " | " + instituteName
        );
    }

    // Class method
    static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}