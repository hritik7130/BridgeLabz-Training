import java.util.*;
import java.util.stream.*;

class Student {
    String name;
    String grade;

    Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }
}

public class StudentGrouping {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
            new Student("Tanishq", "A"),
            new Student("Rahul", "B"),
            new Student("Aman", "A"),
            new Student("Neha", "C")
        );

        // Group students by grade and collect names
        Map<String, List<String>> result =
            students.stream()
                    .collect(Collectors.groupingBy(
                        s -> s.grade,                          // key = grade
                        Collectors.mapping(s -> s.name, Collectors.toList()) // value = names
                    ));

        System.out.println(result);
    }
}
