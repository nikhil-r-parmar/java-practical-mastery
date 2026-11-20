
// Combine method overloading with conditional logic (if-else) and String matching using basic types.

public class ECommerce {
    public static double finalPrice(double amount) {
        return amount + (amount * 0.05);

    }

    public static double finalPrice(double amount, double discountPer) {
        return amount + (amount * (discountPer/100));

    }

    public static double finalPrice() {

    }

}