
// An Program to implement If-Else-If statements
// Author : Nikhil 
// 8/11/2026

public class StudentGrade {
    public static void main (String args[]) {

        int marks = 76;
        int totmarks = 100;

        System.out.println("Student Marks: " + marks);

        if (marks>=90 && marks<=totmarks) {
            System.out.println("Student Grade: A+");
            System.out.println("Excellent Performance");

        } else if (marks>=80 && marks<90) {
            System.out.println("Student Grade: A");

        } else if (marks>=70 && marks<80) {
            System.out.println("Student Grade: B");

        } else if (marks>=60 && marks<70) {
            System.out.println("Student Grade: C");

        } else if (marks>=40 && marks<60) {
            System.out.println("Student Grade: D");

        } else if (marks<40) {
            System.out.println("Student Failed");
            System.out.println("Needs Improvement");

        } else {
            System.out.println("Invalid Student Marks");
            
        } 
    }
}