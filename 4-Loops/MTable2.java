
// Write a Java program that generates multiplication tables and allows the user to repeat the process.

import java.util.Scanner;

public class MTable2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number;
        int responce;

        do {
            int sumOfMultiples = 0;
            int multiple;
            int j=1;

            System.out.print("Enter number: ");
            number = sc.nextInt();

            System.out.print("Generate another table? (1=Yes, 0=No): ");
            responce = sc.nextInt();

            for(int i=1; i<=10; i++) {
                System.out.println(number + " * " + i + " = " + (number*i));
                multiple = (number*i);
             
                while (j<=i) {
                    sumOfMultiples += multiple;
                    j++;
                }
            }
            System.out.println("Sum of multiples: " + sumOfMultiples);

        } while(responce != 0);

        System.out.println("Program ended.");

    }
}