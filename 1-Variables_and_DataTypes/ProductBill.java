// Product billing calculator using type casting
// author: Nikhil
// 6/11/2026

public class ProductBill {
    public static void main (String args[]) {

        double price = 199.99;
        int quantity = 3;
        int discountPer = 15;

        double total_price = price * quantity;
        System.out.println(total_price);

        double discount = (total_price * discountPer) / 100;
        System.out.println(discount);
        
        double final_price = total_price - discount;
        System.out.println(final_price);

        int final_price2 = (int) final_price;
        System.out.println(final_price2);

    } 
}