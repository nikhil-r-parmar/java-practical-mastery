// Student Average calculator using type casting
// author: Nikhil
// 6/11/2026

public class StudentAverage {
    public static void main(String args[]) {
        
        int java = 85;
        int python = 79;
        int database = 92;

        int total_marks = java + python + database;

        double average = (double) total_marks / 3;
        System.out.println("Decimal Average: " + average);

        int avg = (int) average;
        System.out.println("Integer Average: " + avg);

        double difference = average - avg;
        System.out.println("Difference: " + difference);

    }
}