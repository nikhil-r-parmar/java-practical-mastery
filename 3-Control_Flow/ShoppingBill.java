
// An Program to implement Nested If Else with Logical Operators
// Author : Nikhil 
// 8/11/2026

public class ShoppingBill {
    public static void main(String args[]) {

        double billAmount = 6500;
        double discount;
        boolean membershipActive = true;
        double finalAmount;

        System.out.println("Origional Bill: " + billAmount + "Rs.");
        System.out.println("Membership Status: " + membershipActive);

        if (billAmount >= 5000) {
           if (membershipActive) {
                discount = (billAmount / 100) * 20;
                finalAmount = billAmount - discount;
                System.out.println("Discount Percentage: 20%");
                System.out.println("Discount Amount: " + discount + "Rs.");
                System.out.println("Final Bill Amount: " + finalAmount + "Rs.");

           } else {
                discount = (billAmount / 100) * 5;
                finalAmount = billAmount - discount;
                System.out.println("Discount Percentage: 5%");
                System.out.println("Discount Amount: " + discount + "Rs.");
                System.out.println("Final Bill Amount: " + finalAmount + "Rs.");

           }

        } else if (billAmount >= 3000) {
            if (membershipActive) {
                discount = (billAmount / 100) * 10;
                finalAmount = billAmount - discount;
                System.out.println("Discount Percentage: 10%");
                System.out.println("Discount Amount: " + discount + "Rs.");
                System.out.println("Final Bill Amount: " + finalAmount + "Rs.");

           } else {
                discount = (billAmount / 100) * 0;
                finalAmount = billAmount - discount;
                System.out.println("Discount Percentage: 0%");
                System.out.println("Discount Amount: " + discount + "Rs.");
                System.out.println("Final Bill Amount: " + finalAmount + "Rs.");

           }

        } else {
            discount = (billAmount / 100) * 0;
            finalAmount = billAmount - discount;
            System.out.println("Discount Percentage: 0%");
            System.out.println("Discount Amount: " + discount + "Rs.");
            System.out.println("Final Bill Amount: " + finalAmount + "Rs.");
        }

        

    }
}