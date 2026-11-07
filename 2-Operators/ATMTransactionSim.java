
// Combined All Operators Challenge.
// Author : Nikhil 
// 7/11/2026

public class ATMTransactionSim {
    public static void main(String args[]) {

        double balance = 20000;
        int transactionCounter = 0;
        System.out.println("Balance: " + balance + "Rs.");

        // transactions
        balance += 5000;
        transactionCounter++;
        System.out.println("Balance: " + balance + "Rs.");

        balance -= 3500;
        transactionCounter++;
        System.out.println("Balance: " + balance + "Rs.");

        double charge = 3500/100 * 2;
        balance -= charge;
        transactionCounter++;
        System.out.println("Balance: " + balance + "Rs.");


        // Comparision
        System.out.println((balance > 10000) ? "Balance>10K" : "Less balance than 10k");
        System.out.println((balance == 25000) ? "Balance=25K" : "Not Balance=25000");
        System.out.println("Balance between 10k to 25k?: " + (balance >= 10000 && balance <= 25000));


        // Logical Operators
        boolean accountActive = true;
        System.out.println((accountActive) && (balance > 10000));
        System.out.println("Account Active?: " + !(accountActive));


        // Unary & Bitwise
        transactionCounter++;
        System.out.println("Total Transactions: " + transactionCounter);
        System.out.println("Toggle Balance: " + (transactionCounter^4));
        System.out.println("Left Shift to transaction counter: " + (transactionCounter << 2));


        // Final Calculation 
        System.out.println((balance >= 20000) ? "Premium Balance" : "Regular Balance");
        balance /= 2;
        System.out.println("Balance: " + balance + "Rs.");



    }
}