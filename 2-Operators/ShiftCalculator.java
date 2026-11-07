
// Implementation of Shift Operator:
// Author : Nikhil 
// 7/11/2026

public class ShiftCalculator {
    public static void main(String args[]) {

        int number = 12;    
        int negativeNumber = -12;

        System.out.println(number << 2);    // n * 2square
        System.out.println(number >> 2);    // binary 1 shifts two right side numbers.
        System.out.println(number >>> 2);   // same as >>

        System.out.println(negativeNumber << 2);    // same as << but gives nagative value
        System.out.println(negativeNumber >> 2);    // same as >> but gives negative value
        System.out.println(negativeNumber >>> 2);   // large positive integer


    }
}