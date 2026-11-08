
// An Program to implement If-Else statements
// Author : Nikhil 
// 8/11/2026

public class ATMWithdrawal {
    public static void main(String args[]) {

        double balance = 15000;
        int withdrawAmount = 5000;
        boolean accountActive = false;

        if (accountActive) {
            System.out.println("Account is Active.");
            System.out.println("Balance: " + balance);

            if (withdrawAmount > 0) {
                System.out.println("Withdraw ammount is correct");

                if (balance >= withdrawAmount) {
                    System.out.println("Balance is enough.");
                    balance -= withdrawAmount;
                    System.out.println("Withdrawal Successfull!.");
                    System.out.println("Remaining Balance: " + balance);
                    
                } else {
                    System.out.println("Balance is not enough");
                    System.out.println("Withdrawal failed!.");

                }
            } else {
                System.out.println("Withdraw ammount is incorrect");
            }
        } else {
            System.out.println("Account is not Active.");
        }

    }
}