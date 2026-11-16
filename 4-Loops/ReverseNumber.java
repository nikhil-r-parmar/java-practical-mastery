
// Write a Java program that takes a positive integer and reverses its digits using a while loop.

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number;
        int reverse = 0;

        System.out.print("Enter a number: ");
        number = sc.nextInt();

        while(number != 0) {
            int eachDigit = number%10;
            reverse = (reverse * 10) + eachDigit;
            number /= 10;

        }

        System.out.println("Reversed Number: " + reverse);
    }
}