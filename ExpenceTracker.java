// Implementation of Arithmetic & Assignment Operator:
// Author : Nikhil 
// 6/11/2026

public class ExpenceTracker {
    public static void main (String args[]) {

        double balance = 10000;
        System.out.println("Normal Balance: " + balance);
        
        System.out.println("After Friend Gave 2500rs. : " + (balance += 2500));
        System.out.println("After shopping of 1200rs. : " + (balance -= 1200));
        System.out.println("After spending 350rs. on food : " + (balance -= 350));

        double cashback = (balance/100) * 0.05;
        System.out.println("After getting 5% Cashback. : " + (balance += cashback));
        System.out.println("Balance after devidiving into two parts: " + (balance /= 2));

        double remainder = balance % 3;
        System.out.println("Remainder: " + remainder);
        System.out.println("Final Balance: " + balance);

    }
}