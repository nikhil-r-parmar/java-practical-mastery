
// Write a Java program that takes a positive integer and calculates the sum of all its digits using a while loop.

import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long number;
        int sum = 0;

        System.out.print("Enter number: ");
        number = sc.nextLong();

        while(number != 0) {
            long digit = number%10;
            sum += digit;
            number = number/10;
            
        }

        System.out.println("Sum of Digits: " + sum);

    }
}