// Program to implement automatic (implicit) type conversion
// 6/11/2026
// author: Nikhil

public class ImplicitTypeConversion {
    public static void main(String args[]) {

        // Small Student Marks Program

        int obtained_marks = 87;
        System.out.println("Obtained Marks: " + obtained_marks);

        int total_marks = 100;
        System.out.println("Total Marks: " + total_marks);

        char grade = 'A';
        System.out.println("grade: " + grade);


        // implicit casting
        double obtMarks = obtained_marks;   // workes because double size is bigger than integer size
        System.out.println("Obtained Marks: " + obtMarks);

        int Grade = grade;     // integer size is bigger than character size
        System.out.println("Grade: " + Grade);

    }
}