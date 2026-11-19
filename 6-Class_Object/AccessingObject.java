
// Create a class named Student to store basic student information. Create one object, assign values to its fields and display them.

class Student {
    int rollNumber;
    double marks;
    boolean passed;
}

public class AccesingObject {
    public static void main() {
        Student student = new Student();

        student.rollNumber=18;
        student.marks=85.5;
        student.passed=true;

        System.out.println("Roll Number: " + student.rollNumber);
        System.out.println("Marks: " + student.marks);
        System.out.println("Passed: " + student.passed);

    }
}