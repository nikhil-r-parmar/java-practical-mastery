
// Create a program that calculates the total cost of purchasing items using a method that returns a value.

public class PurchaseReturn {
    public static int calculateTotal(int price, int quantity) {
        return price * quantity;

    }

    public static void main(String[] args) {
        int price = calculateTotal(100, 3);

        System.out.println("Stored Total: " + price);
        System.out.println("Direct Total: " + calculateTotal(100, 3));

    }
}