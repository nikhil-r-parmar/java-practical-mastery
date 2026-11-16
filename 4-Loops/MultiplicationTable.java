
// Write a Java program that takes an integer from the user and prints its multiplication table from 1 to 10 using a do-while loop.

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number;

        System.out.print("Enter number: ");
        number = sc.nextInt();

        int i=1;
        do {
            System.out.println(number + " * " + i + " = " + (number*i));
            i++;

        } while(i<=10);

    }
}