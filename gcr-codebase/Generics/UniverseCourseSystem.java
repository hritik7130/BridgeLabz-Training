import java.util.ArrayList;
import java.util.List;

abstract class CourseType {
    private String evaluationMethod;

    public CourseType(String evaluationMethod) {
        this.evaluationMethod = evaluationMethod;
    }

    public String getEvaluationMethod() {
        return evaluationMethod;
    }

    public abstract String getType();
}


class ExamCourse extends CourseType {
    public ExamCourse() {
        super("Written Examination");
    }

    @Override
    public String getType() {
        return "Exam-Based Course";
    }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse() {
        super("Assignments & Projects");
    }

    @Override
    public String getType() {
        return "Assignment-Based Course";
    }
}

class ResearchCourse extends CourseType {
    public ResearchCourse() {
        super("Research & Thesis");
    }

    @Override
    public String getType() {
        return "Research-Based Course";
    }
}


class Course<T extends CourseType> {
    private String courseName;
    private String department;
    private T courseType;

    public Course(String courseName, String department, T courseType) {
        this.courseName = courseName;
        this.department = department;
        this.courseType = courseType;
    }

    public T getCourseType() {
        return courseType;
    }

    public void display() {
        System.out.println(
                "Course: " + courseName +
                " | Department: " + department +
                " | Type: " + courseType.getType() +
                " | Evaluation: " + courseType.getEvaluationMethod()
        );
    }
}

class CourseUtil {

    public static void displayCourses(List<? extends CourseType> courseTypes) {
        for (CourseType type : courseTypes) {
            System.out.println(
                    "Course Type: " + type.getType() +
                    " | Evaluation Method: " + type.getEvaluationMethod()
            );
        }
        System.out.println("------------------------------------");
    }
}

public class UniversityCourseSystem {

    public static void main(String[] args) {

        // Create courses
        Course<ExamCourse> math =
                new Course<>("Mathematics", "Science", new ExamCourse());

        Course<AssignmentCourse> software =
                new Course<>("Software Engineering", "Computer Science", new AssignmentCourse());

        Course<ResearchCourse> aiResearch =
                new Course<>("AI Research", "Computer Science", new ResearchCourse());

        // Display course details
        math.display();
        software.display();
        aiResearch.display();

        System.out.println();

        // Store different course types together
        List<CourseType> courseTypes = new ArrayList<>();
        courseTypes.add(new ExamCourse());
        courseTypes.add(new AssignmentCourse());
        courseTypes.add(new ResearchCourse());

        // Display using wildcard
        CourseUtil.displayCourses(courseTypes);
    }
}
