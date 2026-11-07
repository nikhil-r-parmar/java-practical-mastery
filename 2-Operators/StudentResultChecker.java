
// Implementation of Ternary:
// Author : Nikhil 
// 7/11/2026

public class StudentResultChecker {
    public static void main(String args[]) {

        int SMarks = 72;
        int passingMarks = 40;

        System.out.println((SMarks>=passingMarks) ? "Passed" : "Failed");

        System.out.println((SMarks>=90 && SMarks <= 100) ? "A Grade" : (SMarks>=75 && SMarks < 90) ? "B Grade" : (SMarks>=69 && SMarks < 75) ? "C Grade" : "D Grade");

        System.out.println((SMarks % 2 == 0) ? "Even Marks" : "Odd Marks");


    }
}