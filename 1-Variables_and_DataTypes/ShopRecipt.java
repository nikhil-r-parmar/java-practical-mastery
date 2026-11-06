// A small shoping recipt
// 6/11/2026
// author: Nikhil

public class ShopRecipt {
    public static void main (String agrs[]) {

        String sName = "Nicky's Store";
        String item = "Laptop";
        double price = 55999.99;
        int quantity = 2;
        float discountPer = 10.5f;
        boolean paymentStatus = true;

        System.out.print("|-------------------------------|\n");
        System.out.print("|     || \"Nicky's Store\" ||  \t|\n");
        System.out.print("|-------------------------------|\n");
        System.out.println("| Item: " + item + " \t\t\t|");
        System.out.println("| Price: " + price + "Rs. \t\t|");
        System.out.println("| Quantity: " + quantity + " \t\t\t|");
        System.out.println("| Discount: " + discountPer + "% \t\t|");
        System.out.println("|-------------------------------|");

        double finalAmount = (price*quantity) - ((price*quantity) * (discountPer/100));
        finalAmount = Math.round(finalAmount * 100.0) / 100.0;
        System.out.println("| Final Amount: " + finalAmount + "Rs. \t|");
        System.out.println("| Payment Status: " + ((paymentStatus) ? "Done" : "Not Done") + " \t\t|");
        System.out.println("|-------------------------------|");


    }
}