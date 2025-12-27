import java.util.ArrayList;

// Course class
class Course {
    String courseName;
    ArrayList<Student> students = new ArrayList<>();

    Course(String courseName) {
        this.courseName = courseName;
    }

    // Add student to course
    void addStudent(Student student) {
        students.add(student);
    }

    // Display enrolled students
    void showStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student s : students) {
            System.out.println("- " + s.name);
        }
    }
}

// Student class
class Student {
    String name;
    ArrayList<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    // Enroll student in course
    void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    // View enrolled courses
    void viewCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course c : courses) {
            System.out.println("- " + c.courseName);
        }
    }
}

// School class (Aggregation)
class School {
    String schoolName;
    ArrayList<Student> students = new ArrayList<>();

    School(String schoolName) {
        this.schoolName = schoolName;
    }

    void addStudent(Student student) {
        students.add(student);
    }
}

public class SchoolSystem {
    public static void main(String[] args) {

        School school = new School("Green Valley School");

        Student s1 = new Student("Tanishq");
        Student s2 = new Student("Rahul");

        Course c1 = new Course("Mathematics");
        Course c2 = new Course("Computer Science");

        school.addStudent(s1);
        school.addStudent(s2);

        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s2.enrollCourse(c2);

        s1.viewCourses();
        System.out.println();
        c2.showStudents();
    }
}