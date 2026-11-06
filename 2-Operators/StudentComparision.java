
// Implementation of Relational & Logical Operator:
// Author : Nikhil 
// 6/11/2026

public class StudentComparision {
    public static void main(String args[]) {

        // Create a Java program that checks whether a student qualifies for an examination.

        int Student1Marks = 85;
        int Student2Marks = 72;
        int passingMarks = 40;
        int attendance = 80;

        System.out.println("student 1 marks are greater than student 2 marks?: " + (Student1Marks > Student2Marks));
        System.out.println("both students have equal marks?: " + (Student1Marks == Student2Marks));
        System.out.println("student 1 passed?: " + (Student1Marks >= passingMarks));
        System.out.println("attendance is below 75?: " + (attendance < 75));
        System.out.println("both students passed?: " + (Student1Marks >= passingMarks && Student2Marks >= passingMarks));
        System.out.println("at least one student scored above 80?: " + (Student1Marks > 80 || Student2Marks > 80));
        System.out.println("Student 2 Failed?: " + (!(Student2Marks >= passingMarks)));

        
    }
}