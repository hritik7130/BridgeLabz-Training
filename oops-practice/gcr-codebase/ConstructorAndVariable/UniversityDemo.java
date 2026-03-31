public class UniversityDemo {

    public static void main(String[] args) {

        Student s = new Student(101, "Rahul");
        s.setCGPA(8.6);
        System.out.println("Student CGPA: " + s.getCGPA());

        System.out.println();

        PostgraduateStudent pg = new PostgraduateStudent(201, "Hritik", "B.tech");
        pg.displayDetails();
        pg.setCGPA(9.1);
        System.out.println("PG Student CGPA: " + pg.getCGPA());
    }
}


class Student {

    public int rollNumber;     
    protected String name;     
    private double CGPA;     

    Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }


    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }


    public double getCGPA() {
        return CGPA;
    }
}


class PostgraduateStudent extends Student {

    String specialization;

    PostgraduateStudent(int rollNumber, String name, String specialization) {
        super(rollNumber, name);
        this.specialization = specialization;
    }

    void displayDetails() {
        System.out.println("Roll No: " + rollNumber);   
        System.out.println("Name: " + name);            
        System.out.println("Specialization: " + specialization);
    }
}