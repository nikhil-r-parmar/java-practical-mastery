
// Understand how the same instance method produces different results for different objects.

class Student {
    String name;
    int marks;

    public void displayResult() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Marks: " + marks);

    }
}

public class MultipleObjects2 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.name = "Nikhil";
        student1.marks = 85;

        student2.name = "prem";
        student2.marks = 92;

        student1.displayResult();
        student2.displayResult();

    }
}