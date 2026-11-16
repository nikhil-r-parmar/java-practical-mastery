
// Write a Java program that checks whether a positive integer is a palindrome using a while loop.

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number, backup;
        boolean Palindrome = false;

        System.out.print("Enter number: ");
        number = sc.nextInt();

        backup = number;

        int reverse = 0;
        while(number != 0) {
            int Digit = number % 10;
            reverse = (reverse * 10) + Digit;
            number /= 10;

            if(reverse == backup) {
                Palindrome = true;
            }
        }

        if(Palindrome) {
            System.out.println(backup + " is a Palindrome");

        } else {
            System.out.println(backup + " is not a Palindrome");

        }

    }
}