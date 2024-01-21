package student;

public class Student {
    private int studentId;
    private String name;
    private int age;

    // Constructor with only student ID
    public Student(int studentId) {
        this.studentId = studentId;
        this.name = "Unknown";
        this.age = 0;
    }

    // Constructor with student ID and name
    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.age = 0;
    }

    // Constructor with all attributes
    public Student(int studentId, String name, int age) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Example of how to use the constructors to create Student objects
    public static void main(String[] args) {
        // Creating a student with only student ID
        Student student1 = new Student(123456);
        System.out.println("Student 1 - ID: " + student1.getStudentId() +
                ", Name: " + student1.getName() +
                ", Age: " + student1.getAge());

        // Creating a student with student ID and name
        Student student2 = new Student(789012, "Alice Smith");
        System.out.println("Student 2 - ID: " + student2.getStudentId() +
                ", Name: " + student2.getName() +
                ", Age: " + student2.getAge());

        // Creating a student with all attributes
        Student student3 = new Student(345678, "Bob Johnson", 20);
        System.out.println("Student 3 - ID: " + student3.getStudentId() +
                ", Name: " + student3.getName() +
                ", Age: " + student3.getAge());
    }
}

