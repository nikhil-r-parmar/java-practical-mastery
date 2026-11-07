
// Combined Operators Challenge.
// Author : Nikhil 
// 7/11/2026

public class ElectricityBill {
    public static void main(String args[]) {
        int ConsumedUnits = 250;
        double totalBill = 0;
        double price = 0;
        System.out.println("Total Bill: " + totalBill + "Rs.");

        int first100 = 100;
        ConsumedUnits -= 100;
        price = first100 * 3;
        totalBill += price;
        System.out.println("Total Bill: " + totalBill + "Rs.");

        int Second100 = 100;
        ConsumedUnits -= 100;
        price = Second100 * 5;
        totalBill += price;
        System.out.println("Total Bill: " + totalBill + "Rs.");

        int remainingUnits = ConsumedUnits;
        price = remainingUnits * 7;
        totalBill += price;
        System.out.println("Total Bill: " + totalBill + "Rs.");

        int fixedDiscount = 100;
        totalBill -= fixedDiscount;
        System.out.println("Total Bill: " + totalBill + "Rs.");

        double Tax = (totalBill / 100) * 5;
        totalBill += Tax;
        System.out.println("Total Bill: " + totalBill + "Rs.");

        totalBill /= 2;
        System.out.println("Total Bill: " + totalBill + "Rs.");


    }
}