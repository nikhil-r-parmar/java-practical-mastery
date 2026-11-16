
// Build a console program that records expenses for three days, calculates totals and allows the user to repeat the process.

import java.util.Scanner;

public class ExpenceTracker {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        double dailyTotal = 0;       
        double expence;

        // for loop that iterates 3 time for 3 days
        for(int i=1; i<=3; i++) {
            
            boolean positiveExpence = true;
            dailyTotal = 0;
            System.out.println("Day " + i);

            // while loop to take each day expences
            while (positiveExpence) {

                System.out.print("Enter Expence: ");
                expence = sc.nextDouble();

                dailyTotal += expence;

                if (expence == 0) {
                    positiveExpence = false;
                }
            }

            System.out.println("Day " + i + " Total: " + dailyTotal);
        }

        int i=1;
        do {
            System.out.println("Expence Tracker Completed");
            i++;

        } while (i<=3);
    }
}