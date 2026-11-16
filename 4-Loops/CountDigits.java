
// Write a Java program that takes a positive integer from the user and counts how many digits it contains using a while loop.

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long number;
        int digits = 0;

        System.out.print("Enter number: ");
        number = sc.nextLong();

        while (number != 0) {
            number /= 10;
            digits++;
        }

        System.out.println("Number of Digits: " + digits);

    }
}