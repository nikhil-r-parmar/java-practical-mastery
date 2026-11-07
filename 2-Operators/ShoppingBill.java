
// Combined Arithmetic & Assignment Challenge.
// Author : Nikhil 
// 7/11/2026

public class ShoppingBill {
    public static void main(String args[]) {

        double keyboard_price = 750;
        double mouse_price = 450;
        double USBhub_price = 600;

        keyboard_price *= 2;
        double totalCost = 0;
        System.out.println("Bill Amount: " + totalCost + "Rs.");

        totalCost += keyboard_price;
        System.out.println("Bill Amount: " + totalCost + "Rs.");


        totalCost += mouse_price;
        System.out.println("Bill Amount: " + totalCost + "Rs.");

        totalCost += USBhub_price;
        System.out.println("Bill Amount: " + totalCost + "Rs.");


        totalCost -= 200;   
        System.out.println("Bill Amount: " + totalCost + "Rs.");


        double GST = (totalCost/100) * 18;

        totalCost += GST;
        System.out.println("Bill Amount: " + totalCost + "Rs.");

        double finalBill = totalCost / 2;
        System.out.println("Bill Amount: " + finalBill + "Rs.");
    }
}