package Day11;

class Student {
    String name;
    int age;
    String course;

    // No-argument constructor
    public Student() {
        this("Unknown", 0, "Not assigned");
    }

    // Name-only constructor
    public Student(String name) {
        this(name, 18, "General Studies");
    }

    // Full 3-argument constructor
    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Display student details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println();
    }
}

public class Constructor {
    public static void main(String[] args) {

        // Using no-argument constructor
        Student student1 = new Student();

        // Using name-only constructor
        Student student2 = new Student("Hritik");

        // Using full constructor
        Student student3 = new Student(
            "Rahul",
            21,
            "Computer Science"
        );

        student1.display();
        student2.display();
        student3.display();
    }
}
