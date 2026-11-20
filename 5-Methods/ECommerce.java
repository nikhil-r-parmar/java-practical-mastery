
// Combine method overloading with conditional logic (if-else) and String matching using basic types.

public class ECommerce {
    public static double finalPrice(double amount) {
        return amount + (amount * 0.05);

    }

    public static double finalPrice(double amount, double discountPer) {
        return amount + (amount * (discountPer/100));

    }

    public static double finalPrice(double amount, String couponCode) {
        if (cuponCode.equals("SAVE200") && amount>=200) {
            return amount - 200;

        } else {
            return amount;
            
        }

    }

}